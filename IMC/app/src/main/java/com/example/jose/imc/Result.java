package com.example.jose.imc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.Activity;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.graphics.Color;


public class Result extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);


        TextView textView = (TextView) findViewById(R.id.textResult);
        ImageView mImageView = (ImageView) findViewById(R.id.imageDisplay);
        double imc = Double.parseDouble(getIntent().getStringExtra("result"));

        if (imc < 18.5) {

            textView.setText("Abaixo do peso");
            mImageView.setImageResource(R.drawable.abaixopeso);

        }
        else if (imc < 25) {

            textView.setText("Saudável");
            mImageView.setImageResource(R.drawable.normal);
        }
        else if (imc < 30) {

            textView.setText("Acima do peso");
            mImageView.setImageResource(R.drawable.acimapeso);
        }
        else {

            textView.setText("Obesidade");
            mImageView.setImageResource(R.drawable.obeso);
        }

    }
}
