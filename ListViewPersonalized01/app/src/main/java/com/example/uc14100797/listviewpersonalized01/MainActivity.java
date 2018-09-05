package com.example.uc14100797.listviewpersonalized01;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends Activity {

    ListView listViewCar;
    ArrayAdapter arrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        arrayAdapter = new ArrayAdapter(
                this, android.R.layout.simple_list_item_1,
                getResources().getStringArray(R.array.arrayCars)
        );

        listViewCar = findViewById(R.id.listViewCar);
        listViewCar.setAdapter(arrayAdapter);
    }
}
