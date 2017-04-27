package com.ziloliz.checkcarrepair;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class LoginM extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_m);

        ImageView back = (ImageView) findViewById(R.id.buttonback);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent back;
                back = new Intent(LoginM.this, CheckCarRepair.class);
                startActivity(back);
            }
        });




    ImageView signin = (ImageView) findViewById(R.id.loginm_signin);

        signin.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent signin;
            signin = new Intent(LoginM.this, Me2.class);
            startActivity(signin);
        }
    });




        ImageView aboutme = (ImageView) findViewById(R.id.aboutmeid);
        aboutme.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent aboutme;
                aboutme = new Intent(LoginM.this, aboutMe.class);
                startActivity(aboutme);
            }
        });


    }
}
