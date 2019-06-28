package com.example.testing;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText etnum1,etnum2;
    Button btnadd,btnsub,btndiv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etnum1=(EditText) findViewById(R.id.num1);
        etnum2=(EditText) findViewById(R.id.num2);
        btnadd=(Button) findViewById(R.id.add);
        btndiv=(Button) findViewById(R.id.div);
        btnsub=(Button) findViewById(R.id.sub);

        btnadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Add();
            }
        });

    }

    private void Add() {
        float first=Float.parseFloat(etnum1.getText().toString());
        float second=Float.parseFloat(etnum2.getText().toString());
        float result= (float) Arithmetic.add(first,second);
        Intent intent=new Intent(MainActivity.this,OutputActivity.class);
        intent.putExtra("result",result);
        startActivity(intent);
    }
}
