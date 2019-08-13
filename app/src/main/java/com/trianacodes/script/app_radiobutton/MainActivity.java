package com.trianacodes.script.app_radiobutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
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


    }
}
