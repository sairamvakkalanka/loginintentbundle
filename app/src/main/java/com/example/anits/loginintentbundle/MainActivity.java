package com.example.anits.loginintentbundle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText e1,e2;
    Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1 = (EditText) findViewById(R.id.editText);
        e2 = (EditText) findViewById(R.id.editText2);
    }
        public void onClick(View v){
        String name=e1.getText().toString();
        String pwd=e2.getText().toString();


     if(name.equals("sairam")& pwd.equals("9989733724"))
        {
            Intent i = new Intent(this,SecondActivity.class);
           Bundle bun= new Bundle();
           bun.putString("e1",name);
           i.putExtras(bun);
            startActivity(i);

        }

        else if(name.equals("")|| pwd.equals(""))
        {
            Toast.makeText(this,"Please Enter Your Details",Toast.LENGTH_SHORT).show();
        }

        else
        {
            Toast.makeText(this,"Wrong Id or Password",Toast.LENGTH_SHORT).show();
        }

    }
}
