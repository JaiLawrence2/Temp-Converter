package com.example.temperatureconverter;

import androidx.appcompat.app.AppCompatActivity;
import com.example.temperatureconverter.databinding.ActivityMainBinding;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    double C;
    double F;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        binding.button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText input = binding.fInput;
                EditText input2 = binding.cInput;
                //TextView t = binding.output;
               String Celsius = input2.getText().toString();
                String Fahren = input.getText().toString();

                if (Celsius.equals("")){
                    F = Double.parseDouble(Fahren);
                    double C = (F - 32) * 5/9;
                    C = Double.parseDouble(String.format("%.2f",C));
                    input2.setText(String.valueOf(C));
                }
                else if (Fahren.equals("")){
                    C = Double.parseDouble(Celsius);
                    double F = (C * 9/5) + 32;
                    F = Double.parseDouble(String.format("%.2f",F));
                    input.setText(String.valueOf(F));
                }
                else{
                    F = Double.parseDouble(Fahren);
                    double C = (F - 32) * 5/9;
                    C = Double.parseDouble(String.format("%.2f",C));
                    input2.setText(String.valueOf(C));
                }


            }

        });

    }

}