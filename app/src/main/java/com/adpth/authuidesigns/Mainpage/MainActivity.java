package com.adpth.authuidesigns.Mainpage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;

import com.adpth.authuidesigns.Adapter.Adapter;
import com.adpth.authuidesigns.R;
import com.adpth.authuidesigns.login.Login01Activity;
import com.adpth.authuidesigns.login.Login02Activity;
import com.adpth.authuidesigns.login.Login03Activity;
import com.adpth.authuidesigns.login.Login04Activity;
import com.adpth.authuidesigns.login.Login05Activity;
import com.adpth.authuidesigns.signup.Signup01Activity;
import com.adpth.authuidesigns.signup.Signup02Activity;
import com.adpth.authuidesigns.signup.Signup03Activity;
import com.adpth.authuidesigns.signup.Signup04Activity;
import com.adpth.authuidesigns.signup.Signup05Activity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ExpandableListAdapter listAdapter;
    private ExpandableListView listView;
    private List<String> listHeader;
    private HashMap<String,List<String>> listHashMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.ExpandableListView);
        initData();
        listAdapter = new Adapter(this,listHeader,listHashMap);
        listView.setAdapter(listAdapter);
    }

    private void initData() {
        listHeader = new ArrayList<>();
        listHashMap = new HashMap<>();

        listHeader.add("LoginPages");
        listHeader.add("SignUpPages");

        List<String> loginpages = new ArrayList<>();
        loginpages.add("LoginPage 01");
        loginpages.add("LoginPage 02");
        loginpages.add("LoginPage 03");
        loginpages.add("LoginPage 04");
        loginpages.add("LoginPage 05");

        List<String> signuppages = new ArrayList<>();
        signuppages.add("SignUpPages 01");
        signuppages.add("SignUpPages 02");
        signuppages.add("SignUpPages 03");
        signuppages.add("SignUpPages 04");
        signuppages.add("SignUpPages 05");

        listHashMap.put(listHeader.get(0), loginpages);
        listHashMap.put(listHeader.get(1), signuppages);

        listView.setOnChildClickListener(new ExpandableListView.OnChildClickListener() {
            @Override
            public boolean onChildClick(ExpandableListView parent, View v, int groupPosition, int childPosition, long id) {
                if (groupPosition == 0) {
                    switch (childPosition) {
                        case 0:
                            Intent intentChild0 = new Intent(MainActivity.this, Login01Activity.class);
                            startActivity(intentChild0);
                            overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
                            break;

                        case 1:
                            Intent intentChild1 = new Intent(MainActivity.this, Login02Activity.class);
                            startActivity(intentChild1);
                            overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
                            break;

                        case 2:
                            Intent intentChild2 = new Intent(MainActivity.this, Login03Activity.class);
                            startActivity(intentChild2);
                            overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
                            break;

                        case 3:
                            Intent intentChild3 = new Intent(MainActivity.this, Login04Activity.class);
                            startActivity(intentChild3);
                            overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
                            break;

                        case 4:
                            Intent intentChild4 = new Intent(MainActivity.this, Login05Activity.class);
                            startActivity(intentChild4);
                            overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
                            break;

                    }
                }
                if (groupPosition == 1) {
                    switch (childPosition) {
                        case 0:
                            Intent intentChild0 = new Intent(MainActivity.this, Signup01Activity.class);
                            startActivity(intentChild0);
                            overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
                            break;

                        case 1:
                            Intent intentChild1 = new Intent(MainActivity.this, Signup02Activity.class);
                            startActivity(intentChild1);
                            overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
                            break;

                        case 2:
                            Intent intentChild2 = new Intent(MainActivity.this, Signup03Activity.class);
                            startActivity(intentChild2);
                            overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
                            break;

                        case 3:
                            Intent intentChild3 = new Intent(MainActivity.this, Signup04Activity.class);
                            startActivity(intentChild3);
                            overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
                            break;

                        case 4:
                            Intent intentChild4 = new Intent(MainActivity.this, Signup05Activity.class);
                            startActivity(intentChild4);
                            overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
                            break;
                    }
                }
                return true;
            }
        });
    }
}