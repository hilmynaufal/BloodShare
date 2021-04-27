package com.hirumi.bloodshare;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
//        Nama              : M Hilmy Naufal
//        Kelas             : If-2
//        NIM               : 10118046
//        Tanggal Pengerjaan: 27 April 2021
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        TextView goRegister = findViewById(R.id.goRegister);

        goRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toRegisterActivity();
            }
        });
    }

    public void toRegisterActivity() {
        Intent intent = new Intent(this, RegisterActivity.class);
        startActivity(intent);
    }
}
