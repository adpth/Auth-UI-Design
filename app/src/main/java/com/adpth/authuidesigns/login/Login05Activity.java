package com.adpth.authuidesigns.login;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SwitchCompat;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.adpth.authuidesigns.R;

public class Login05Activity extends AppCompatActivity {

    EditText email,password;
    RelativeLayout login_btn,custom_switch;
    SwitchCompat switchCompat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login05);
        FindviewbyId();

        login_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!TextUtils.isEmpty(email.getText().toString())) {
                    if (!TextUtils.isEmpty(password.getText().toString())) {
                        Toast.makeText(Login05Activity.this,"Login is successful",Toast.LENGTH_LONG).show();
                    }
                }

                if (email.getText().toString().length() == 0) {
                    Toast.makeText(Login05Activity.this,"Enter the email",Toast.LENGTH_LONG).show();
                }

                if (password.getText().toString().length() == 0) {
                    Toast.makeText(Login05Activity.this,"Enter the password",Toast.LENGTH_LONG).show();
                }
            }
        });

        custom_switch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (switchCompat.isChecked()) {
                    switchCompat.setChecked(false);
                    Toast.makeText(Login05Activity.this,"Password Remember is OFF",Toast.LENGTH_LONG).show();
                } else {
                    switchCompat.setChecked(true);
                    Toast.makeText(Login05Activity.this,"Password Remember is ON",Toast.LENGTH_LONG).show();
                }
            }
        });

    }

    private void FindviewbyId() {
        email = findViewById(R.id.login_email05);
        password = findViewById(R.id.login_password05);
        login_btn = findViewById(R.id.login05_btn);
        custom_switch = findViewById(R.id.custom_switch);
        switchCompat = findViewById(R.id.switchCompat);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.anim.slide_in_left,R.anim.slide_out_right);
    }
}