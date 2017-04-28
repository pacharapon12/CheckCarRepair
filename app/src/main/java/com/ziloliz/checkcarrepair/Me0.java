package com.ziloliz.checkcarrepair;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;

public class Me0 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_me0);

        ImageView talk = (ImageView) findViewById(R.id.imageView15);
        //ImageView newf = (ImageView) findViewById(R.id.imageView16); // ค้นหา
        RelativeLayout car1 = (RelativeLayout) findViewById(R.id.car1);
        RelativeLayout car2 = (RelativeLayout) findViewById(R.id.car2);
        RelativeLayout gome2 = (RelativeLayout) findViewById(R.id.pluscar);


        talk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent talk;
                talk = new Intent(Me0.this, Talk.class);
                startActivity(talk);
            }
        });

        car1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent newf;
                newf = new Intent(Me0.this, Me1.class);
                startActivity(newf);
            }
        });

        car2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent newf;
                newf = new Intent(Me0.this, Me1.class);
                startActivity(newf);
            }
        });

        gome2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gome2;
                gome2 = new Intent(Me0.this, Me2.class);
                startActivity(gome2);
            }
        });



    }
}
