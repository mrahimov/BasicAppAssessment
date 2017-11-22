package nyc.c4q.watsismyaddress;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import java.util.Map;

import static nyc.c4q.watsismyaddress.MainActivity.PREF_KEY;

public class RecyclerActivity extends AppCompatActivity {

    private SharedPreferences preferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler);

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_view);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);


        Intent intent = getIntent();
        String userEmail = intent.getStringExtra("shardepref");


        //found on google.
        Map<String, ?> map = preferences.getAll();
        for (Map.Entry<String, ?> entry : map.entrySet()) {
            Log.d("map values", entry.getKey() + ": " + entry.getValue().toString());

        }

    }
}
