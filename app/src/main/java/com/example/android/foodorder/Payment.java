package com.example.android.foodorder;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

public class Payment extends AppCompatActivity {
    private Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);

        spinner = findViewById(R.id.spinnerID);

        List<String> placeList= new ArrayList<>();
        placeList.add("Card");
        placeList.add("Cash On Delivery");

        ArrayAdapter<String> spinnerAdapter = new ArrayAdapter<>(this,android.R.layout.simple_dropdown_item_1line,placeList);
        spinner.setAdapter(spinnerAdapter);

    }
}
