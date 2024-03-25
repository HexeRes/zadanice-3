package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.content.Intent;
public class MainActivity extends AppCompatActivity {
Button B;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.testloyaot2);
        B = findViewById(R.id.B);
        B.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onNextActivity(v);
            }
        });
    }
    public void onNextActivity(View view){
        EditText nameText = findViewById(R.id.tank);
        EditText armorText=findViewById(R.id.armor);
        String name = nameText.getText().toString();
        int tank = Integer.parseInt(armorText.getText().toString());

        MyObject myObject = new MyObject(name,tank);
        Intent intent = new Intent(this, NewActivity.class);
        intent.putExtra("myObject", myObject);
        startActivity(intent);

    }
}