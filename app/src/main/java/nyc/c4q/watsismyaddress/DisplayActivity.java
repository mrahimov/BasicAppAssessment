package nyc.c4q.watsismyaddress;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayActivity extends AppCompatActivity {

    private TextView textView01;
    private TextView textView02;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);

        textView01 = findViewById(R.id.textview_display_one);
        textView02 = findViewById(R.id.textview_display_two);
    }
}
