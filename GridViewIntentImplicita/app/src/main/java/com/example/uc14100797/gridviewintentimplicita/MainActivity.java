package com.example.uc14100797.gridviewintentimplicita;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;

public class MainActivity extends Activity implements AdapterView.OnItemClickListener {

    ArrayAdapter arrayAdapter;
    GridView gridView;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] arrayImgs = {"Maps", "Call", "Share", "UCB"};
        gridView = findViewById(R.id.gridView);
        arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, arrayImgs);
        gridView.setAdapter(arrayAdapter);
        gridView.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        intent = new Intent();

        switch (i){
            case 0:
                intent.setAction(intent.ACTION_ALL_APPS);
                break;
            case 1:
                intent.setAction(intent.ACTION_SEND);
                intent.putExtra(intent.ACTION_CALL, "5561993511261");
                intent.setType("text/plain");
                break;
            case 2:
                break;
            default:
        }

        startActivity(intent);
    }
}
