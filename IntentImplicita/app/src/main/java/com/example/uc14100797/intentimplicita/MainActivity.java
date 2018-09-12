package com.example.uc14100797.intentimplicita;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.GridView;

public class MainActivity extends Activity implements View.OnClickListener {

    Button buttonEnviar;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonEnviar = findViewById(R.id.buttonEnviar);
        buttonEnviar.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        intent = new Intent();

        intent.setAction(intent.ACTION_SEND);
        intent.putExtra(intent.EXTRA_TEXT, "Olá, tudo bem?");
        intent.setType("text/plain");

        startActivity(intent);
    }
}
