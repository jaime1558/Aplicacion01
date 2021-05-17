package com.example.aplicacion01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class salud extends AppCompatActivity {

    EditText etNombre, etPeso, etAltura;
    Button btnCalcular, btnLimpiar;
    RadioButton rbVaron, rbMujer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_salud);

        etNombre = (EditText) findViewById(R.id.txtNombre);
        etPeso = (EditText) findViewById(R.id.txtPeso);
        etAltura = (EditText) findViewById(R.id.txtAltura);
        btnCalcular = (Button) findViewById(R.id.bCalcular);
        btnLimpiar = (Button) findViewById(R.id.bLimpiar);
        rbVaron = (RadioButton) findViewById(R.id.rHombre);
        rbMujer = (RadioButton) findViewById(R.id.rMujer);

        btnLimpiar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Limpiar();
            }
        });

        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CalcularIMC();
            }
        });
    }
    private void Limpiar ()
    {
        etNombre.setText("");
        etAltura.setText("");
        etPeso.setText("");
    }

    private String MensajeIMC ( double IMC)
    {
        String mensaje = "";
        if (IMC < 16)
            mensaje = "Peso bajo muy grave";
        else if (IMC >= 16 & IMC < 17)
            mensaje = "Peso bajo grave";
        else
            mensaje = "Otro tipo de IMC";
        return mensaje;
    }
    private void CalcularIMC ()
    {
        String nombre = etNombre.getText().toString();
        Double altura = Double.valueOf(etAltura.getText().toString());
        Double peso = Double.valueOf(etPeso.getText().toString());
        double IMC = peso / Math.pow(altura, 2);

        Toast.makeText(this, "Tu IMC es" + String.format("%.2f", IMC) + MensajeIMC(IMC), Toast.LENGTH_LONG).show();
        if (rbMujer.isChecked() == true)
            Toast.makeText(this,"ERES MUJER" , Toast.LENGTH_SHORT).show();
        else if (rbVaron.isChecked() == true)
            Toast.makeText(this,"ERES VARON",Toast.LENGTH_SHORT).show();
        else
            Toast.makeText(this,"No eligio género",Toast.LENGTH_SHORT).show();
    }
}
