package com.ziloliz.checkcarrepair;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class aboutMe extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_me);

        ImageView back = (ImageView) findViewById(R.id.buttonback);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent back;
                back = new Intent(aboutMe.this, LoginM.class);
                startActivity(back);
            }
        });


    }
}
