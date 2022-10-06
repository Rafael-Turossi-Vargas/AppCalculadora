package br.ulbra.appcalc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView edtValor1, edtValor2;
    Button btnSomar, btnSubtrair, btnMultiplicar, btnDividir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtValor1 = findViewById(R.id.edtV1);
        edtValor2 = findViewById(R.id.edtV2);
        btnSomar = findViewById(R.id.btnSomar);
        btnSubtrair = findViewById(R.id.btnSubtrair);
        btnMultiplicar = findViewById(R.id.btnMultiplicar);
        btnDividir = findViewById(R.id.btnDividir);

        btnSomar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double valor1, valor2, soma;
                valor1 = Double.parseDouble(edtValor1.getText().toString());
                valor2 = Double.parseDouble(edtValor2.getText().toString());
                soma = valor1 + valor2;

                Toast.makeText(MainActivity.this, "A soma dos valores é: " + soma, Toast.LENGTH_LONG).show();
            }
        });
        btnSubtrair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double valor1, valor2, Subtrair;
                valor1 = Double.parseDouble(edtValor1.getText().toString());
                valor2 = Double.parseDouble(edtValor2.getText().toString());
                Subtrair = valor1 - valor2;

                Toast.makeText(MainActivity.this, "A subtração dos valores é: " + Subtrair, Toast.LENGTH_LONG).show();
            }
        });
        btnMultiplicar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double valor1, valor2, Multiplicar;
                valor1 = Double.parseDouble(edtValor1.getText().toString());
                valor2 = Double.parseDouble(edtValor2.getText().toString());
                Multiplicar = valor1 * valor2;

                Toast.makeText(MainActivity.this, "A Multiplicação dos valores é: " + Multiplicar, Toast.LENGTH_LONG).show();
            }
        });
        btnDividir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double valor1, valor2, Dividir;
                valor1 = Double.parseDouble(edtValor1.getText().toString());
                valor2 = Double.parseDouble(edtValor2.getText().toString());
                Dividir = valor1 / valor2;

                Toast.makeText(MainActivity.this, "A Divisão dos valores é: " + Dividir, Toast.LENGTH_LONG).show();
            }
        });
    }
}