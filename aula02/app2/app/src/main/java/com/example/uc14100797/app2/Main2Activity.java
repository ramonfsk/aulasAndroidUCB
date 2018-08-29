package com.example.uc14100797.app2;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends Activity {

    private TextView tvNome;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        tvNome = findViewById(R.id.tvNome);

        String nome = getIntent().getStringExtra(name: "nome");

        Carro carro = (Carro) getIntent().getSerializableExtra(name: "objCarro");

        tvNome.setText(carro.getFabricante());
    }
}
