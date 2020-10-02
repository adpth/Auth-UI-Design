package com.adpth.authuidesigns.signup;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.adpth.authuidesigns.R;

public class Signup05Activity extends AppCompatActivity {

    EditText first,last,email,password;
    RelativeLayout signup_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup05);

        FindviewbyId();

        signup_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!TextUtils.isEmpty(first.getText().toString())) {
                    if (!TextUtils.isEmpty(last.getText().toString())) {
                        if (!TextUtils.isEmpty(email.getText().toString())) {
                            if (!TextUtils.isEmpty(password.getText().toString())) {
                                Toast.makeText(Signup05Activity.this,"Account is created",Toast.LENGTH_LONG).show();
                            }
                        }
                    }
                }

                if (first.getText().toString().length() == 0) {
                    Toast.makeText(Signup05Activity.this,"Enter the First Name",Toast.LENGTH_LONG).show();
                }

                if (last.getText().toString().length() == 0) {
                    Toast.makeText(Signup05Activity.this,"Enter the Last Name",Toast.LENGTH_LONG).show();
                }

                if (email.getText().toString().length() == 0) {
                    Toast.makeText(Signup05Activity.this,"Enter the email",Toast.LENGTH_LONG).show();
                }

                if (password.getText().toString().length() == 0) {
                    Toast.makeText(Signup05Activity.this,"Enter the password",Toast.LENGTH_LONG).show();
                }
            }
        });
    }

    private void FindviewbyId() {
        first = findViewById(R.id.signup_firstnm);
        last = findViewById(R.id.signup_lastnm);
        email = findViewById(R.id.signup_email05);
        password = findViewById(R.id.signup_password05);
        signup_btn = findViewById(R.id.signup05_btn);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.anim.slide_in_left,R.anim.slide_out_right);
    }
}