package com.example.uc14100797.examplelistview;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends Activity implements AdapterView.OnItemClickListener {

    ListView listView;
    ArrayAdapter arrayAdapter;
    ArrayList arrayImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        arrayImage = new ArrayList();
        arrayImage.add(R.drawable.models);

        arrayAdapter = new ArrayAdapter(
                this, android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.arrayCars)
        );

        listView = findViewById(R.id.list);
        listView.setAdapter(arrayAdapter);
        listView.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        Toast.makeText(this,"Um item foi clicado!", Toast.LENGTH_LONG).show();
    }
}
