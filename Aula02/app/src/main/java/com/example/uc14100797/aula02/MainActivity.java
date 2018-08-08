package com.example.uc14100797.aula02;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity implements View.OnClickListener {

    Button btnClique;
    Button btnClique2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnClique = findViewById(R.id.btnClique);
        btnClique.setOnClickListener(this);

        btnClique2 = findViewById(R.id.btnClique);
        btnClique2.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btnClique:
            Toast.makeText(this, "Olá mundo!", Toast.LENGTH_LONG).show();
            break;
            case R.id.btnClique2:
            Toast.makeText(this, "Olá mundo2!", Toast.LENGTH_LONG).show();
            break;
        }
    }
}
