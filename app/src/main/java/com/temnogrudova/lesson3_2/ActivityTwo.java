package com.temnogrudova.lesson3_2;

import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

/**
 * Created by 123 on 26.02.2016.
 */
public class ActivityTwo extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);
        TextView textView = (TextView) findViewById(R.id.tv2);
        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        textView.setText(name);

    }
}
