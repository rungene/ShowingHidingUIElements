package com.rungene.showinghidinguielements;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    Button buttonHide,buttonShow;



    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView =findViewById(R.id.textView);
        buttonHide = findViewById(R.id.buttonHide);
        buttonShow = findViewById(R.id.buttonShow);

    }

    public void hide(View view){
        textView.setVisibility(view.INVISIBLE);

        Log.i("hide","Hide pressed");

    }

    public void show(View view){
        textView.setVisibility(view.VISIBLE);

        Log.i("show","show pressed");


    }
}
