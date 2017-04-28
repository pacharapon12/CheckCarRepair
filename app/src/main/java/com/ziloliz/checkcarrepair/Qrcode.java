package com.ziloliz.checkcarrepair;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;
import android.widget.ImageView;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;


public class Qrcode extends AppCompatActivity {

    private ImageView qr;
    private DatabaseReference myRef;
    private EditText codeout;

    private DatabaseReference mRootRef = FirebaseDatabase.getInstance().getReference();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_qrcode);

        Bundle bundle = getIntent().getExtras(); //ตัวแปรที่จะส่ง
        String id = bundle.getString("IDQRCODE"); //ตัวแปรที่จะส่ง

        qr = (ImageView) findViewById(R.id.qr);
        Bitmap bitmap = getIntent().getParcelableExtra("pic");
        qr.setImageBitmap(bitmap);

        codeout = (EditText) findViewById(R.id.code);
        codeout.setEnabled(false);

        codeout.setText(id);
/* final FirebaseDatabase database = FirebaseDatabase.getInstance();
        myRef = database.getReference();

        myRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                Map map = (Map)dataSnapshot.getValue();
                String value = String.valueOf(map.get(mRootRef.child("QRCODE").child("TEST")));
                codeout.setText(value);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {
                Toast.makeText(Qrcode.this, "เกิดข้อผิดพลาด", Toast.LENGTH_SHORT).show();
                codeout.setText("Failed: " + databaseError.getMessage());
            }
        });
*/
}
}
