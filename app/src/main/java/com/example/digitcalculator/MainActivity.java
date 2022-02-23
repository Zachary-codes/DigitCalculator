package com.example.digitcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btnSum;
    TextView txtNumOne, txtNumTwo;
    TextView lblSum;
    int iCount = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSum = findViewById(R.id.btnSum);
        txtNumOne = findViewById(R.id.txtNumOne);
        txtNumTwo = findViewById(R.id.txtNumTwo);
        lblSum = (TextView)findViewById(R.id.lblSum);

        btnSum.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                //code goes here...

                try {
                    double numOne = Double.parseDouble(txtNumOne.getText().toString());
                    double numTwo = Double.parseDouble(txtNumTwo.getText().toString());

                    double sum = numOne + numTwo;

                    lblSum.setText("The sum is " + sum);
                }catch (Exception ex) {
                    Toast.makeText(getBaseContext(), ex.getMessage(), Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}