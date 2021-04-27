package com.hirumi.bloodshare;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.appcompat.widget.Toolbar;

import androidx.appcompat.app.AppCompatActivity;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        Toolbar toolbar = findViewById(R.id.registerToolbar);
//        toolbar.setTitleTextColor(getColor(R.color.title));
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("");
        getSupportActionBar().setIcon(R.drawable.ic_baseline_arrow_back_24);
        getSupportActionBar().setElevation(10);
        Spinner spinnerJob = findViewById(R.id.spinnerJob);
        Spinner spinnerBlood = findViewById(R.id.spinnerBlood);
        Spinner spinnerReshus = findViewById(R.id.spinnerReshus);

        ArrayAdapter adapterJob = ArrayAdapter.createFromResource(this, R.array.job, R.layout.spinner_list);

        adapterJob.setDropDownViewResource(R.layout.spinner_list);
        spinnerJob.setAdapter(adapterJob);

        ArrayAdapter adapterBlood = ArrayAdapter.createFromResource(this, R.array.bloodtype, R.layout.spinner_list);

        adapterBlood.setDropDownViewResource(R.layout.spinner_list);
        spinnerBlood.setAdapter(adapterBlood);

        ArrayAdapter adapterReshus = ArrayAdapter.createFromResource(this, R.array.reshus, R.layout.spinner_list);

        adapterReshus.setDropDownViewResource(R.layout.spinner_list);
        spinnerReshus.setAdapter(adapterReshus);

        Button goAlmost = findViewById(R.id.goAlmost);

        goAlmost.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toAlmostActivity();
            }
        });
    }

    public void toAlmostActivity() {
        Intent intent = new Intent(this, AlmostActivity.class);
        startActivity(intent);
    }
}