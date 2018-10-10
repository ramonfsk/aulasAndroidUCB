package com.example.uc14100797.kotlin;

import android.app.Activity;
import android.os.Bundle;

public class MainActivity extends Activity {

    val url = "https://olinda.bcb.gov.br/olinda/servico/PTAX/versao/v1/odata/Moedas?format=json";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
}
