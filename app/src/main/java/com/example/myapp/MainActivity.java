package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private TextView tvMsg;
    private ImageView ivImg;
    private EditText edMsg;
    private Button btnConfirm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvMsg = findViewById(R.id.tvMsg);
        ivImg = findViewById(R.id.ivImg);
        edMsg = findViewById(R.id.edMsg);
        btnConfirm = findViewById(R.id.btnConfirm);

        btnConfirm.setOnClickListener(view -> {
            String msg = edMsg.getText().toString();
            if(msg.isEmpty()){
                Toast.makeText(this, "message can not be empty!!", Toast.LENGTH_SHORT).show();
            }
            else{
                tvMsg.setText(msg);
            }
        });
    }
}