package com.example.dam_uc3_quispediego;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.btnEntrar);
        button.setOnClickListener(view -> Toast.makeText(this,"Entrar",Toast.LENGTH_SHORT).show());
            //    makeText(this, "Clic en el Botón 1", Toast.LENGTH_SHORT).show());

        Button button2 = findViewById(R.id.btnRegistrar);
        button2.setOnClickListener(view -> Toast.makeText(this, "Se envió sus datos", Toast.LENGTH_SHORT).show());
    }

}
