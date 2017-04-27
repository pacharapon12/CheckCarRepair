package com.ziloliz.checkcarrepair;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class Me1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_me1);

        ImageView back = (ImageView) findViewById(R.id.buttonback);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent back;
                back = new Intent(Me1.this, Me0.class);
                startActivity(back);
            }
        });







    }
}
