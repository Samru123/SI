package com.example.si;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
Button button;
EditText editText;
EditText editText2;
EditText editText3;
String s1,s2,s3;
float si;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=findViewById(R.id.button);
        editText=findViewById(R.id.editText);
        editText2=findViewById(R.id.editText2);
        editText3=findViewById(R.id.editText3);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s1=editText.getText().toString().trim();
                s2=editText2.getText().toString().trim();
                s3=editText3.getText().toString().trim();
                if(s1.isEmpty()||s2.isEmpty()||s3.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Invalid Number", Toast.LENGTH_SHORT).show();
                }


                else
                {
                    float p = Float.parseFloat(s1);
                    float r = Float.parseFloat(s2);
                    float n = Float.parseFloat(s3);

                    si=(p*r*n)/100;

                    //ans= (String) toString(com.example.factorial.MainActivity.fact);
                    //editText.setText(ans);

                    Toast.makeText(MainActivity.this, "SI:" + si, Toast.LENGTH_SHORT).show();
                }
            }


        });
    }
}
