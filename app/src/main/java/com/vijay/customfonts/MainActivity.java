package com.vijay.customfonts;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);





    }

    public void view_click(View view) {

        switch (view.getId())
        {
            case R.id.second_activity:
                startActivity(new Intent(getApplicationContext(),Main2Activity.class));
                break;
        }


    }
}
