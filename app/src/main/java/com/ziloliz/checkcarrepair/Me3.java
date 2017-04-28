package com.ziloliz.checkcarrepair;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ScrollView;
import android.widget.SeekBar;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.WriterException;
import com.google.zxing.common.BitMatrix;
import com.journeyapps.barcodescanner.BarcodeEncoder;

import java.util.ArrayList;
import java.util.Random;


public class Me3 extends AppCompatActivity {

//////////////
    EditText editText1;
    ListView listView1;
    //ScrollView scrollView1 ;
    ArrayList<String> arr_list;
//////////////


    LinearLayout layoutScroll;
    ScrollView scrollView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_me3);

////////////////////////////////////

        arr_list = new ArrayList<String>();
        arr_list.add("ซ่อมไฟหลังขวา");
        arr_list.add("ซ่อมไฟหลังซ้าย");

///////////////////////////////เพิ่มเพื่อหา





///////////////////////////////////////////////////////////////////////////////////////

        final Context context = this;
        ImageView success = (ImageView) findViewById(R.id.me3_success);
        success.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random r = new Random();
                int code = r.nextInt(10000000) + 99999999;
                String scode = String.valueOf(code);


                FirebaseDatabase database = FirebaseDatabase.getInstance();
                DatabaseReference myRef = database.getReference("QRCODE");
                myRef.child("TEST").push().setValue(scode);


                MultiFormatWriter multiFormatWriter = new MultiFormatWriter();
                try {
                    BitMatrix bitMatrix = multiFormatWriter.encode(scode, BarcodeFormat.QR_CODE, 200, 200);
                    BarcodeEncoder barcodeEncoder = new BarcodeEncoder();
                    Bitmap bitmap = barcodeEncoder.createBitmap(bitMatrix);
                    Intent intent = new Intent(context, Qrcode.class);
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


        layoutScroll = (LinearLayout) findViewById(R.id.layoutScroll);
        scrollView1 = (ScrollView) findViewById(R.id.scrollView1);
//


    }}
