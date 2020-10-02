package com.adpth.authuidesigns.signup;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.adpth.authuidesigns.R;
import com.adpth.authuidesigns.login.Login01Activity;

public class Signup01Activity extends AppCompatActivity {

    EditText username,email,password;
    RelativeLayout signup_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup01);

        FindviewbyId();

        signup_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!TextUtils.isEmpty(username.getText().toString())) {
                    if (!TextUtils.isEmpty(email.getText().toString())) {
                        if (!TextUtils.isEmpty(password.getText().toString())) {
                            Toast.makeText(Signup01Activity.this,"Account is created",Toast.LENGTH_LONG).show();
                        }
                    }
                }

                if (username.getText().toString().length() == 0) {
                    Toast.makeText(Signup01Activity.this,"Enter the Username",Toast.LENGTH_LONG).show();
                }

                if (email.getText().toString().length() == 0) {
                    Toast.makeText(Signup01Activity.this,"Enter the email",Toast.LENGTH_LONG).show();
                }

                if (password.getText().toString().length() == 0) {
                    Toast.makeText(Signup01Activity.this,"Enter the password",Toast.LENGTH_LONG).show();
                }
            }
        });

    }

    private void FindviewbyId() {
        username = findViewById(R.id.signup_username01);
        email = findViewById(R.id.signup_email01);
        password = findViewById(R.id.signup_password01);
        signup_btn = findViewById(R.id.signup01_btn);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.anim.slide_in_left,R.anim.slide_out_right);
    }
}