package com.example.myapplication3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        TextView  customerNameTextView = findViewById(R.id.customerName);
        TextView  nationalTextView = findViewById(R.id.nationaliD);

        Bundle bundle = getIntent().getExtras();

        ///// CustomerName
        String name = bundle.getString("name");
        customerNameTextView.setText(name);
        ///// internationl iD
        int international = bundle.getInt("national");
        nationalTextView.setText(String.valueOf("national"));


    }
}