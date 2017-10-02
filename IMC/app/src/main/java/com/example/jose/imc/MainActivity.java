package com.example.jose.imc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.view.*;
import android.content.Intent;
import android.widget.Button;

import android.app.Activity;

public class MainActivity extends AppCompatActivity {

    Button btnExecute;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnExecute = (Button) this.findViewById(R.id.button);
        btnExecute.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){
                imcCalc(v);
            }
        });

    }



    public void imcCalc(View view){
        EditText editText = (EditText) findViewById(R.id.editText);
        EditText editText2 = (EditText) findViewById(R.id.editText2);

        double hight = Double.parseDouble(editText.getText().toString());
        double weight = Double.parseDouble(editText2.getText().toString());

        double result = weight/ (hight*hight);

        Intent intent = new Intent(this,Result.class);
        intent.putExtra("result", String.valueOf(result));
        startActivity(intent);

    }
}
