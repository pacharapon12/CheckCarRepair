package com.ziloliz.checkcarrepair;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class LoginM extends AppCompatActivity {

    private FirebaseAuth firebaseAuth;
    private EditText mloginm_username;
    private EditText mloginm_password;
    private ImageView mloginm_signin;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_m);
        firebaseAuth = FirebaseAuth.getInstance();
        ImageView back = (ImageView) findViewById(R.id.buttonback);
        mloginm_username = (EditText)findViewById(R.id.loginm_username);
        mloginm_password = (EditText)findViewById(R.id.loginm_password);
        mloginm_signin = (ImageView)findViewById(R.id.loginm_signin);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent back;
                back = new Intent(LoginM.this, CheckCarRepair.class);
                startActivity(back);
            }
        });
        ImageView aboutme = (ImageView) findViewById(R.id.aboutmeid);
        aboutme.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent aboutme;
                aboutme = new Intent(LoginM.this, aboutMe.class);
                startActivity(aboutme);
            }
        });
    }

    public void btnLogin_Click(View v) {
            final ProgressDialog progressDialog = ProgressDialog.show(LoginM.this, "Please wait...", "Proccessing...", true);

            (firebaseAuth.signInWithEmailAndPassword(mloginm_username.getText().toString(), mloginm_password.getText().toString()))
                    .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {
                            progressDialog.dismiss();

                            if (task.isSuccessful()) {
                                Toast.makeText(LoginM.this, "Login successful", Toast.LENGTH_LONG).show();
                                Intent i = new Intent(LoginM.this, Me0.class);
                                i.putExtra("Email", firebaseAuth.getCurrentUser().getEmail());
                                startActivity(i);
                            } else {
                                Log.e("ERROR", task.getException().toString());
                                Toast.makeText(LoginM.this, task.getException().getMessage(), Toast.LENGTH_LONG).show();
                            }
                        }
                    });

    }

}
