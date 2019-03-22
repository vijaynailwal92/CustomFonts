package com.vijay.customfonts;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity {


    //TextView ambleBold, ambleLight, ambleRegular, openSansItalic, openSansRegular;

    Button btn;

    /*private String A_BOLD= "Amble-Bold.ttf";
    private String A_LIGHT="Amble-Light.ttf";
    private String A_REGULAR= "Amble-Regular.ttf";
    private String O_ITALIC= "OpenSans-Italic.ttf";
    private String O_REGULAR="OpenSans-Regular.ttf";*/
    private String P_REGULAR = "fonts/Pacifico.ttf";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        /*ambleBold=(TextView)findViewById(R.id.ambleBold);
        ambleLight=(TextView)findViewById(R.id.ambleLight);
        ambleRegular=(TextView)findViewById(R.id.ambleRegular);
        openSansRegular=(TextView)findViewById(R.id.opRegular);
        openSansItalic=(TextView)findViewById(R.id.opItalic);*/
        btn = (Button) findViewById(R.id.pacifico);

        /*ambleBold.setTypeface(Typeface.createFromAsset(getAssets(), A_BOLD));
        ambleLight.setTypeface(Typeface.createFromAsset(getAssets(), A_LIGHT));
        ambleRegular.setTypeface(Typeface.createFromAsset(getAssets(), A_REGULAR));
        openSansRegular.setTypeface(Typeface.createFromAsset(getAssets(), O_REGULAR));
        openSansItalic.setTypeface(Typeface.createFromAsset(getAssets(), O_ITALIC));*/
        btn.setTypeface(Typeface.createFromAsset(getAssets(), P_REGULAR));
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), Main3Activity.class));
            }
        });


    }
}