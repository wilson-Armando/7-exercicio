package com.example.exerccio8;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btn_Calcular;
    EditText txt_Preço,txt_Lucro,txt_Imposto;
    TextView txt_Resultado1,txt_Resultado2,txt_Resultado3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_Calcular.findViewById(R.id.btn_calcular);
        txt_Imposto.findViewById(R.id.txt_imposto);
        txt_Lucro.findViewById(R.id.txt_lucro);
        txt_Preço.findViewById(R.id.txt_preço);

        btn_Calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float  percentual_Imposto,percentual_Lucro;

                float preço_Veiculo=Float.parseFloat(txt_Preço.getText().toString());
                percentual_Imposto=Float.parseFloat(txt_Imposto.getText().toString());
                percentual_Lucro=Float.parseFloat(txt_Lucro.getText().toString());

                //linha a
                float a =preço_Veiculo*percentual_Lucro/100;
                txt_Resultado1.setText(String.valueOf(a));

                //linha b
                float b =preço_Veiculo*percentual_Imposto/100;
                txt_Resultado2.setText(String.valueOf(b));

                //linha c
                float c= preço_Veiculo+a+b;
                txt_Resultado3.setText(String.valueOf(c));

            }
        });
    }
}