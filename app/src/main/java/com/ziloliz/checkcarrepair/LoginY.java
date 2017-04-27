package com.ziloliz.checkcarrepair;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;



public class LoginY extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_y);

        /*
        ImageView qr = (ImageView) findViewById(R.id.imageView);

        qr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent qr;
                qr = new Intent(LoginY.this, You0.class);
                startActivity(qr);
            }
        });

        */

        ImageView back = (ImageView) findViewById(R.id.imageView22);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent back;
                back = new Intent(LoginY.this, CheckCarRepair.class);
                startActivity(back);
            }
        });
    }


}
