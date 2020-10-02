package com.adpth.authuidesigns.login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.adpth.authuidesigns.R;

public class Login03Activity extends AppCompatActivity {

    EditText email,password;
    ImageView login_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login03);

        FindviewbyId();

        login_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!TextUtils.isEmpty(email.getText().toString())) {
                    if (!TextUtils.isEmpty(password.getText().toString())) {
                        Toast.makeText(Login03Activity.this,"Login is successful",Toast.LENGTH_LONG).show();
                    }
                }

                if (email.getText().toString().length() == 0) {
                    Toast.makeText(Login03Activity.this,"Enter the email",Toast.LENGTH_LONG).show();
                }

                if (password.getText().toString().length() == 0) {
                    Toast.makeText(Login03Activity.this,"Enter the password",Toast.LENGTH_LONG).show();
                }
            }
        });
    }

    private void FindviewbyId() {
        email = findViewById(R.id.login_email03);
        password = findViewById(R.id.login_password03);
        login_btn = findViewById(R.id.login03_btn);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.anim.slide_in_left,R.anim.slide_out_right);
    }
}