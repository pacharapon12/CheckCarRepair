package com.ziloliz.checkcarrepair;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.Map;


public class Qrcode extends AppCompatActivity {

    private ImageView qr;
    private DatabaseReference myRef;
    private EditText codeout;

    private DatabaseReference mRootRef = FirebaseDatabase.getInstance().getReference();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_qrcode);

        qr = (ImageView) findViewById(R.id.qr);
        Bitmap bitmap = getIntent().getParcelableExtra("pic");
        qr.setImageBitmap(bitmap);

        codeout = (EditText) findViewById(R.id.code);
        codeout.setEnabled(false);
       // codeout.setText(); รอจาก firebase
        final FirebaseDatabase database = FirebaseDatabase.getInstance();
        myRef = database.getReference();

        myRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                Map map = (Map)dataSnapshot.getValue();
                String value = String.valueOf(map.get("QRCODE"));
                codeout.setText(value);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {
                Toast.makeText(Qrcode.this, "เกิดข้อผิดพลาด", Toast.LENGTH_SHORT).show();
            }
        });


}
}
