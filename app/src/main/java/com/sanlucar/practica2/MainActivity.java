package com.sanlucar.practica2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.snackbar.SnackbarContentLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button BtnSiguiente= (Button) findViewById(R.id.BtnSiguiente);
        EditText ETNombrePersona = findViewById(R.id.textoNombre);
        DatePicker DPFechaNacimiento = findViewById(R.id.DPFechanacimiento);
        EditText ETTelefono= findViewById(R.id.ETelefono);
        EditText ETEmail= findViewById(R.id.EEmail);
        EditText ETDescripcion=findViewById(R.id.EDescripcion);
        String Nombre = getIntent().getStringExtra("Nombre");
        int Año= getIntent().getIntExtra("AFechaNacimiento",0);
        int Mes= getIntent().getIntExtra("MFechaNacimiento",0);
        int Dia= getIntent().getIntExtra("DFechaNacimiento",0);
        String Telefono = getIntent().getStringExtra("Telefono");
        String Email = getIntent().getStringExtra("Email");
        String Descripcion = getIntent().getStringExtra("Descripcion");
        ETNombrePersona.setText(Nombre);
        DPFechaNacimiento.updateDate(Año,Mes,Dia);
        ETTelefono.setText(Telefono);
        ETEmail.setText(Email);
        ETDescripcion.setText(Descripcion);



        BtnSiguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String Nombre= ETNombrePersona.getText().toString();
                String Telefono=ETTelefono.getText().toString();
                String Email=ETEmail.getText().toString();
                int AFechaNacimiento=DPFechaNacimiento.getYear();
                int MFechaNacimiento=DPFechaNacimiento.getMonth();
                int DFechaNacimiento=DPFechaNacimiento.getDayOfMonth();
                String Descripcion=ETDescripcion.getText().toString();


                Intent intent = new Intent(MainActivity.this,confirmar.class);
                intent.putExtra("Nombre",Nombre);
                intent.putExtra("Telefono",Telefono);
                intent.putExtra("Email",Email);
                intent.putExtra("Descripcion",Descripcion);
                intent.putExtra("AFechaNacimiento",AFechaNacimiento);
                intent.putExtra("MFechaNacimiento",MFechaNacimiento);
                intent.putExtra("DFechaNacimiento",DFechaNacimiento);


                startActivity(intent);
                finish();

            }
        });

    }
}