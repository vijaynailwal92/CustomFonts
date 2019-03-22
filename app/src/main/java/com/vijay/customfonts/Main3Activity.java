package com.vijay.customfonts;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import me.anwarshahriar.calligrapher.Calligrapher;

public class Main3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);



        Calligrapher calligrapher = new Calligrapher(Main3Activity.this);
        calligrapher.setFont(Main3Activity.this, "fonts/Pacifico.ttf", true);



    }
}
