package com.adpth.authuidesigns.signup;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.adpth.authuidesigns.R;

public class Signup03Activity extends AppCompatActivity {

    EditText username,email,password;
    ImageView signup_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup03);

        FindviewbyId();

        signup_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!TextUtils.isEmpty(username.getText().toString())) {
                    if (!TextUtils.isEmpty(email.getText().toString())) {
                        if (!TextUtils.isEmpty(password.getText().toString())) {
                            Toast.makeText(Signup03Activity.this,"Account is created",Toast.LENGTH_LONG).show();
                        }
                    }
                }

                if (username.getText().toString().length() == 0) {
                    Toast.makeText(Signup03Activity.this,"Enter the Username",Toast.LENGTH_LONG).show();
                }

                if (email.getText().toString().length() == 0) {
                    Toast.makeText(Signup03Activity.this,"Enter the email",Toast.LENGTH_LONG).show();
                }

                if (password.getText().toString().length() == 0) {
                    Toast.makeText(Signup03Activity.this,"Enter the password",Toast.LENGTH_LONG).show();
                }
            }
        });
    }

    private void FindviewbyId() {
        username = findViewById(R.id.signup_username03);
        email = findViewById(R.id.signup_email03);
        password = findViewById(R.id.signup_password03);
        signup_btn = findViewById(R.id.signup03_btn);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.anim.slide_in_left,R.anim.slide_out_right);
    }
}