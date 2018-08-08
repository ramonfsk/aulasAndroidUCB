package com.example.uc14100797.app2;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SegundaActivity extends Activity implements View.OnClickListener {

    EditText editText;
    Button btnEstimate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);

        editText = findViewById(R.id.fuelValue);
        editText.getText().toString();

        btnEstimate = findViewById(R.id.btnEstimate);
    }

    @Override
    public void onClick(View view) {
        String result = editText.getText().toString();

        Toast.makeText(this, result, Toast.LENGTH_LONG).show();
    }
}
