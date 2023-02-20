package com.sanlucar.practica2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class confirmar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirmar);
        TextView TvNombre = findViewById(R.id.TvNombrePersona);
        String Nombre = getIntent().getStringExtra("Nombre");
        TvNombre.setText(Nombre);
        int Año= getIntent().getIntExtra("AFechaNacimiento",0);
        int Mes= getIntent().getIntExtra("MFechaNacimiento",0);
        int Dia= getIntent().getIntExtra("DFechaNacimiento",0);
        TextView FechaNacimiento = findViewById(R.id.TvFechaNacimientoPersona);
        FechaNacimiento.setText(Año+"/"+Mes+"/"+Dia);
        TextView TelefonoPersona= findViewById(R.id.TelefonoPersona);
        String Telefono = getIntent().getStringExtra("Telefono");
        TelefonoPersona.setText(Telefono);
        TextView TvEmailPersona= findViewById(R.id.TvEmailPersona);
        String Email = getIntent().getStringExtra("Email");
        TvEmailPersona.setText(Email);
        TextView TvDescripcion=findViewById(R.id.TvDescripcion);
        String Descripcion = getIntent().getStringExtra("Descripcion");
        TvDescripcion.setText(Descripcion);


        Button BtnEditarDatos= (Button) findViewById(R.id.btnEditarDatos);


        BtnEditarDatos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent intent = new Intent(confirmar.this,MainActivity.class);
                intent.putExtra("Nombre",Nombre);
                intent.putExtra("Telefono",Telefono);
                intent.putExtra("Email",Email);
                intent.putExtra("Descripcion",Descripcion);
                intent.putExtra("AFechaNacimiento",Año);
                intent.putExtra("MFechaNacimiento",Mes);
                intent.putExtra("DFechaNacimiento",Dia);


                startActivity(intent);
                finish();

            }
        });
    }
}