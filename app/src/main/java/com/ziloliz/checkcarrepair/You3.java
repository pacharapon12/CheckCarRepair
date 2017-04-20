package com.ziloliz.checkcarrepair;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class You3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_you3);

        ImageView back = (ImageView) findViewById(R.id.imageView22);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent back;
                back = new Intent(You3.this, You2.class);
                startActivity(back);
            }
        });
    }
}
