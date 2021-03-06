package com.hirumi.bloodshare;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class AlmostActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
//        Nama              : M Hilmy Naufal
//        Kelas             : If-2
//        NIM               : 10118046
//        Tanggal Pengerjaan: 27 April 2021
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_almost);

        Button button = (Button) findViewById(R.id.goVerify);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AlmostActivity.this, VerifyActivity.class);
                startActivity(intent);
            }
        });
    }
}