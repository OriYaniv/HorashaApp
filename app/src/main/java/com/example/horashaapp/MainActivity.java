package com.example.horashaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView tvData;
    private Button btnGetData;
    private GasolineVehicle gasolineVehicle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initUI();
        initListeners();
    }

    private void initUI() {
        tvData = findViewById(R.id.tvData);
        btnGetData = findViewById(R.id.btnGetData);

        gasolineVehicle = new GasolineVehicle("Suzuki", 40);
    }

    private void initListeners() {
        btnGetData.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnGetData:
                gasolineVehicle.addFuel(10);
                tvData.setText(gasolineVehicle.getManufacturer() + "\n" + gasolineVehicle.getFuel());
                break;
        }
    }

}