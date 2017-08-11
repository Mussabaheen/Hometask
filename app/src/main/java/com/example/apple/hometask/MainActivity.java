package com.example.apple.hometask;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    public	static	final	String	a	= "com.example.pc.intentextraspractice.extra.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void open(View view) {
        switch (view.getId())
        {
            case R.id.button2:
                Intent i1 = new Intent(this, activity2.class);
                i1.putExtra(a,"1");
                startActivity(i1);
                break;
            case R.id.button4:
                Intent i2 = new Intent(this, activity2.class);
                i2.putExtra(a,"2");
                startActivity(i2);
                break;
            case R.id.button5:
                Intent i3 = new Intent(this, activity2.class);
                i3.putExtra(a,"3");

                startActivity(i3);
                break;



        }

    }
}
