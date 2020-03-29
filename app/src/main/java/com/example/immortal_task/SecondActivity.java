package com.example.immortal_task;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.TextView;;


import org.json.JSONException;
import org.json.JSONObject;

public class SecondActivity extends AppCompatActivity {
    JSONObject mJsonObject;
    String val;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        TextView id = (TextView) findViewById(R.id.textView2);
        TextView name = (TextView) findViewById(R.id.textView3);
        TextView email = (TextView) findViewById(R.id.textView4);
        TextView address = (TextView) findViewById(R.id.textView5);
        TextView gender = (TextView) findViewById(R.id.textView6);

        Intent i = getIntent();
        //Bundle product = i.getExtras();

        try {
            mJsonObject = new JSONObject(getIntent().getStringExtra("contactList"));
            id.setText(mJsonObject.getString("id"));
            name.setText(mJsonObject.getString("name"));
            email.setText(mJsonObject.getString("email"));
            address.setText(mJsonObject.getString("address"));
            gender.setText(mJsonObject.getString("gender"));

            Log.d("OutPut", mJsonObject.getString("id"));
        } catch (JSONException e) {
            e.printStackTrace();
        }
        //String idUser = product.getString("contactList");


//        name.setText(product);
//        email.setText(product);
//        address.setText(product);
//        gender.setText(product);


    }

}
