package com.example.android.example;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.view.menu.ActionMenuItemView;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText textUser;
    EditText textPass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textUser = (EditText) findViewById(R.id.textUser);
        textPass = (EditText) findViewById(R.id.textPass);
        Button buttonGo = (Button) findViewById(R.id.buttonGo);

        buttonGo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,SecondActivity.class);
                Bundle bundle = new Bundle();
                bundle.putString("textUser",textUser.getText().toString());
                bundle.putString("textPass",textPass.getText().toString());
                intent.putExtras(bundle);
                startActivity(intent);
                finish();
            }
        });
    }
}
