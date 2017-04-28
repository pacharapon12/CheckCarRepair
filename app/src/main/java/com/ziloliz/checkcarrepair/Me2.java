package com.ziloliz.checkcarrepair;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;

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

                EditText me2_fname = (EditText)findViewById(R.id.me2_fname);
                EditText me2_lname = (EditText)findViewById(R.id.me2_lname);
                EditText me2_ta = (EditText)findViewById(R.id.me2_ta);
                EditText me2_tel = (EditText)findViewById(R.id.me2_tel);
                Spinner spinner1 = (Spinner)findViewById(R.id.spinner1);
                Spinner spinner2 = (Spinner)findViewById(R.id.spinner2);
                Spinner spinner3 = (Spinner)findViewById(R.id.spinner3);


                String me2_fnameA = me2_fname.getText().toString();
                String me2_lnameA = me2_lname.getText().toString();
                String me2_taA = me2_ta.getText().toString();
                String me2_telA = me2_tel.getText().toString();
                String me2_spinner1A = spinner1.getSelectedItem().toString();
                String me2_spinner2A = spinner2.getSelectedItem().toString();
                String me2_spinner3A = spinner3.getSelectedItem().toString();


                Intent next;
                next = new Intent(Me2.this, Me3.class);

                next.putExtra("me2_fname", me2_fnameA); //ตัวแปรที่จะส่ง
                next.putExtra("me2_lname", me2_lnameA); //ตัวแปรที่จะส่ง
                next.putExtra("me2_ta", me2_taA); //ตัวแปรที่จะส่ง
                next.putExtra("me2_tel", me2_telA); //ตัวแปรที่จะส่ง
                next.putExtra("me2_spinner1", me2_spinner1A); //ตัวแปรที่จะส่ง
                next.putExtra("me2_spinner2", me2_spinner2A); //ตัวแปรที่จะส่ง
                next.putExtra("me2_spinner3", me2_spinner3A); //ตัวแปรที่จะส่ง

                next.putExtra("TestSend", x); //ตัวแปรที่จะส่ง
                startActivity(next);
            }
        });


    }
}
