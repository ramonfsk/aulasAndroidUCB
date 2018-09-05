package com.example.uc14100797.listviewpersonalized01;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.example.uc14100797.listviewpersonalized01.adapter.AdapterCar;
import com.example.uc14100797.listviewpersonalized01.model.Car;

import java.util.ArrayList;

public class MainActivity extends Activity implements AdapterView.OnItemClickListener{

    ListView listViewCar;
    AdapterCar arrayAdapter;
    ArrayList<Car> carros;
    Car carro;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*arrayAdapter = new AdapterCar(this, android.R.layout.simple_list_item_1,
                getResources().getStringArray(R.array.arrayCars)
        );*/

        carros = new ArrayList<Car>();
        carro = new Car();

        carro.setModelo("uno");
        carro.setFabricante("FIAT");
        carro.setCodFabricante(R.drawable.logofiat);

        carros.add(carro);

        carro = new Car();
        carro.setModelo("models");
        carro.setFabricante("TESLA");
        carro.setCodFabricante(R.drawable.tesla_logo);

        carros.add(carro);

        arrayAdapter = new AdapterCar(MainActivity.this, carros);

        listViewCar = findViewById(R.id.listViewCar);
        listViewCar.setAdapter(arrayAdapter);
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        Toast.makeText(this,"Um item foi clicado!", Toast.LENGTH_LONG).show();
    }
}
