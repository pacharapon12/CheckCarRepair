package com.ziloliz.checkcarrepair;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Main extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_car_repair);

        ImageView addmin = (ImageView) findViewById(R.id.imageView3);
        ImageView customer = (ImageView) findViewById(R.id.imageView4);

        addmin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent addmin;
                addmin = new Intent(Main.this, LoginM.class);
                startActivity(addmin);
            }
        });
        customer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent customer;
                customer = new Intent(Main.this, LoginM.class);
                startActivity(customer);
            }
        });
    }
}