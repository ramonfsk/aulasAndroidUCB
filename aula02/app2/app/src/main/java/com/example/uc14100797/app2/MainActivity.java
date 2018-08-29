package com.example.uc14100797.app2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity implements View.OnClickListener {

    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onClick(View view){

        Carro carro = new Carro();
        carro.setFabricante("FIAT");
        carro.setModelo("UNO");

        intent = new Intent();

        startActivity(intent);
    }
}
