package com.ziloliz.checkcarrepair;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Me2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_me2);

        ImageView talk = (ImageView) findViewById(R.id.buttonback);


        talk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent talk;
                talk = new Intent(Me2.this, Me0.class);
                startActivity(talk);
            }
        });

        ImageView next = (ImageView) findViewById(R.id.next);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String x = "TEST SEND"; //ตัวแปรที่จะส่ง
                Intent next;
                next = new Intent(Me2.this, Me3.class);
                next.putExtra("TestSend", x); //ตัวแปรที่จะส่ง
                startActivity(next);
            }
        });





    }
}
