package com.example.apple.hometask;

import android.content.Intent;
import android.support.v4.view.ScrollingView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ScrollView;
import android.widget.TextView;

public class activity2 extends AppCompatActivity {
    TextView s2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity2);
        s2=(TextView) findViewById(R.id.s1);
        Intent i4 =getIntent();
        String	o	= i4.getStringExtra(MainActivity.a);
        switch (o)
        {
            case "1":
                s2.setText(R.string.passage1);
                break;
            case "2":
                s2.setText(R.string.passage2);
                break;
            case  "3":
                s2.setText(R.string.passage3);
                break;

        }

    }
}
