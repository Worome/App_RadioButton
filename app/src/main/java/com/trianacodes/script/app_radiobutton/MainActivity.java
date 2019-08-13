package com.trianacodes.script.app_radiobutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText et_num1, et_num2;
    private TextView tv_resultado;
    private RadioButton rbSum, rbRes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et_num1 = findViewById(R.id.et_numero1);
        et_num2 = findViewById(R.id.et_numero2);
        tv_resultado = findViewById(R.id.tv_resultado);
        rbSum = findViewById(R.id.rb_suma);
        rbRes = findViewById(R.id.rb_resta);

    }

    public void Calculo(View view){

        int valor1 = Integer.parseInt(et_num1.getText().toString());
        int valor2 = Integer.parseInt(et_num2.getText().toString());

        if (rbSum.isChecked()){
            Suma(valor1, valor2);
        } else {
            Resta(valor1, valor2);
        }

    }

    public int Suma (int v1, int v2){

        return v1 + v2;

    }

    public int Resta (int v1, int v2){

        return v1 - v2;

    }

}
