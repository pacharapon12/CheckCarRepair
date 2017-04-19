package com.ziloliz.checkcarrepair;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;

public class Main extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_check_car_repair);

        ImageView ผู้ดูแลระบบ = (ImageView) findViewById(R.id.imageView3);

        ผู้ดูแลระบบ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ผู้ดูแลระบบ;
                ผู้ดูแลระบบ = new Intent(Main.this, LoginM.class);
                startActivity(ผู้ดูแลระบบ);
            }
        });
    }
}