package com.ziloliz.checkcarrepair;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class CheckCarRepair extends AppCompatActivity {

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
                addmin = new Intent(CheckCarRepair.this, LoginM.class);
                startActivity(addmin);
            }
        });
        customer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent customer;
                customer = new Intent(CheckCarRepair.this, LoginY.class);
                startActivity(customer);
            }
        });
    }
}
