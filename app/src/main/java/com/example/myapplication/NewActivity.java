package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class NewActivity extends AppCompatActivity {
    Button B2;

@Override
    protected void onCreate(Bundle savedInstanceState){

    super.onCreate(savedInstanceState);
    setContentView(R.layout.testloyaot3);
    B2 = findViewById(R.id.B2);
    B2.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            setContentView(R.layout.testloyaot1);
        }
    });
    TextView messageText = new TextView(this);
    messageText.setTextSize(26);
    messageText.setPadding(16, 16, 16, 16 );
MyObject myObjectInput = (MyObject) getIntent().getSerializableExtra("myObject");
if(myObjectInput!=null){
    messageText.setText("tank"+ myObjectInput.getTank()+"\narmor:"+myObjectInput.getArmor());
}
setContentView(messageText);
}
}
