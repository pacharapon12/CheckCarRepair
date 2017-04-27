package com.ziloliz.checkcarrepair;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;
import android.widget.ImageView;

public class Qrcode extends AppCompatActivity {

    private ImageView qr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_qrcode);

        qr = (ImageView) findViewById(R.id.qr);
        Bitmap bitmap = getIntent().getParcelableExtra("pic");
        qr.setImageBitmap(bitmap);

        EditText codeout = (EditText) findViewById(R.id.code);
        codeout.setEnabled(false);

       // codeout.setText(); รอจาก firebase







    }
}
