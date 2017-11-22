package nyc.c4q.watsismyaddress;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public static final String PREF_KEY = "address_shared_preferences";
    private SharedPreferences preferences;
    private EditText emailEditText;
    private Button button01;
    private Button button02;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        emailEditText = findViewById(R.id.email_edit_text);
        button01 = findViewById(R.id.button_one);
        button02 = findViewById(R.id.button_two);

        preferences = getApplicationContext().getSharedPreferences(PREF_KEY, MODE_PRIVATE);

        button01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences.Editor editor = preferences.edit();
                editor.putString("emailAddress", emailEditText.getText().toString());
                emailEditText.setText("");
            }
        });

        button02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, RecyclerActivity.class);
                intent.putExtra("shardepref", PREF_KEY);
                startActivity(intent);
            }
        });
    }
}
