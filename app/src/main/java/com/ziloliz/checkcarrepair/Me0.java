package com.ziloliz.checkcarrepair;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Me0 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_me0);

        ImageView talk = (ImageView) findViewById(R.id.imageView15);
        ImageView newf = (ImageView) findViewById(R.id.imageView15);


        talk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent talk;
                talk = new Intent(Me0.this, Talk.class);
                startActivity(talk);
            }
        });

        newf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent newf;
                newf = new Intent(Me0.this, Me1.class);
                startActivity(newf);
            }
        });
    }
}
