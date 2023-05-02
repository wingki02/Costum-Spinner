package com.wingki_202102318.customspinner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private Spinner spinner1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner1 = (Spinner)findViewById(R.id.spinner1);

        List<String> negaraList = new ArrayList<>();
        negaraList.add("Albania");
        negaraList.add("Belgia");
        negaraList.add("Hungary");
        negaraList.add("Iran");
        negaraList.add("Slovenia");

        NegaraAdapter na = new NegaraAdapter(getApplicationContext(), negaraList);
        spinner1.setAdapter(na);
    }
}