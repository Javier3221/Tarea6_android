package com.example.tarea6;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
public class login extends Activity {
    private TextView tvR;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
        tvR = (TextView) findViewById(R.id.resivir);
        Bundle var1 = getIntent().getExtras();
        String nombre = var1.getString("texto");
        tvR.setText("Bienvenido señor " + nombre);
    }
}
