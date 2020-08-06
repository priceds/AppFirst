package com.example.appfirst;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
private Button show_btn;
private EditText txt_input;
private EditText txt_show;
private TextView txt_Label;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt_input=(EditText)findViewById(R.id.txt_input);
        txt_show=(EditText)findViewById(R.id.txt_show);
        show_btn=(Button)findViewById(R.id.btn_show);
        txt_Label=(TextView)findViewById(R.id.txt_Label);
        show_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num = Integer.parseInt(txt_input.getText().toString());
                factorial(num);
            }
        });
    }

 private void factorial(double num)
 {
     int factorial=1,i;
     for(i=1;i<=num;i++)
     {
         factorial=factorial*i;
     }
    txt_show.setText("Factorial:"+factorial);
 }
}