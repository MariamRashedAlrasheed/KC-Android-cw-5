package com.example.myapplication3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Object main;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView customerNameTextView = findViewById(R.id.customerName2);
        TextView nationaliDTaxtView = findViewById(R.id.textView4);
        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (customerNameTextView.getText().toString().equals("")){
                    Toast.makeText(MainActivity.this,"شدعوا تأكد من ملئ الفراغات",Toast.LENGTH_LONG).show();
                }

                else if (nationaliDTaxtView.getText().toString().equals("")) {
                    Toast.makeText(MainActivity.this, "شدعوا تأكد من ملئ الفراغات", Toast.LENGTH_LONG).show();
                }
                 else{
                String customerName = customerNameTextView.getText().toString();
                int nationaliD = Integer.parseInt(nationaliDTaxtView.getText().toString());
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                intent.putExtra("name", customerName);
                intent.putExtra("national", nationaliD);
                startActivity(intent);

            }}
        });



}}