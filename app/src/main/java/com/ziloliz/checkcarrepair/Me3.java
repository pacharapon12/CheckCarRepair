package com.ziloliz.checkcarrepair;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.WriterException;
import com.google.zxing.common.BitMatrix;
import com.journeyapps.barcodescanner.BarcodeEncoder;


public class Me3 extends AppCompatActivity {


    //firebase
    FirebaseDatabase database = FirebaseDatabase.getInstance();
    DatabaseReference myRef = database.getReference("APP");

    String f_name = "test1";
    String l_name = "test2";
    String id;

    //

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_me3);

        final Context context = this;
        ImageView success = (ImageView) findViewById(R.id.me3_success);
        success.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Random r = new Random();
                //int code = r.nextInt(10000000) + 99999999;
                //String scode = String.valueOf(code);

                //เชื่อม FIREBASE------------------------------------


                //FirebaseDatabase database = FirebaseDatabase.getInstance();
                //DatabaseReference myRef = database.getReference("APP");
                ////myRef.child("TEST").push().setValue(scode);
                //myRef.child("users").push().getKey();

                addPhone();


                //----------------------------------------------

                MultiFormatWriter multiFormatWriter = new MultiFormatWriter();
                try {
                    BitMatrix bitMatrix = multiFormatWriter.encode(id, BarcodeFormat.QR_CODE, 200, 200);
                    BarcodeEncoder barcodeEncoder = new BarcodeEncoder();
                    Bitmap bitmap = barcodeEncoder.createBitmap(bitMatrix);
                    Intent intent = new Intent(context, Qrcode.class);
                    intent.putExtra("IDQRCODE", id); //ตัวแปรที่จะส่ง
                    intent.putExtra("pic", bitmap);
                    context.startActivity(intent);
                } catch (WriterException e) {
                    e.printStackTrace();
                }
            }
        });

        ImageView back = (ImageView) findViewById(R.id.buttonback);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent back;
                back = new Intent(Me3.this, Me2.class);
                startActivity(back);
            }
        });


        Bundle bundle = getIntent().getExtras(); //ตัวแปรที่จะส่ง
        String text = bundle.getString("TestSend"); //ตัวแปรที่จะส่ง

        CheckBox box1 = (CheckBox) findViewById(R.id.checkBox1); //ตัวแปรที่จะส่ง
        box1.setText(text); //ตัวแปรที่จะส่ง


    }

    //firebase

    private void addPhone() {
        String fname = f_name.trim();
        String lname = l_name.trim();

        if (!TextUtils.isEmpty(fname)) {
            id = myRef.push().getKey();
            Phones artist = new Phones(id, fname, lname);
            myRef.child(id).setValue(artist);
            Toast.makeText(this, "Added", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "You should enter a name", Toast.LENGTH_SHORT).show();
        }








    }


}