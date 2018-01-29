package com.example.anits.loginintentbundle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        TextView t1= (TextView) findViewById(R.id.textView5);
        Bundle bun=new Bundle();
        bun=getIntent().getExtras();
        String text=bun.getString("e1");
       t1.setText(text);
    }
}
