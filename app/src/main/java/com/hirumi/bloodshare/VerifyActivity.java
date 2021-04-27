package com.hirumi.bloodshare;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class VerifyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
//        Nama              : M Hilmy Naufal
//        Kelas             : If-2
//        NIM               : 10118046
//        Tanggal Pengerjaan: 27 April 2021
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verify);

        TextView textView = (TextView) findViewById(R.id.goMain);

        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(VerifyActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}