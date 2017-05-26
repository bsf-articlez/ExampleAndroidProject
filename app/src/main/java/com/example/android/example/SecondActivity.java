package com.example.android.example;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by sumet.a2g on 5/26/2017.
 */

public class SecondActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle saveInstanceState){
        super.onCreate(saveInstanceState);
        setContentView(R.layout.activity_second);

        Button buttonBack = (Button) findViewById(R.id.buttonBack);
        buttonBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SecondActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });

        String textUser,textPass;

        Intent intent = getIntent();
        textUser = intent.getExtras().getString("textUser");
        textPass = intent.getExtras().getString("textPass");

        TextView resultUser = (TextView) findViewById(R.id.textResultUser);
        TextView resultPass = (TextView) findViewById(R.id.textResultPass);
        resultUser.setText(textUser);
        resultPass.setText(textPass);
    }
}
