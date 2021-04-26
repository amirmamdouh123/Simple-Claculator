package org.codeforiraq.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
EditText no1,no2;
Button plus , neg,div,times;
TextView res,result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

dif();
plus.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        res.setText("Result :");

        String str1,str2;
str1=no1.getText().toString();
str2=no2.getText().toString();
int x;
x=Integer.parseInt(str1)+Integer.parseInt(str2);
   res.append(String.valueOf(x));
    }
});

neg.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        res.setText("Result :");

        String str1,str2;
        str1=no1.getText().toString();
        str2=no2.getText().toString();
        int x =Integer.parseInt(str1)-Integer.parseInt(str2);
        res.append(String.valueOf(x));
    }
});

        times.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             res.setText("Result :");
                String str1,str2;
                str1=no1.getText().toString();
                str2=no2.getText().toString();
                int x =Integer.parseInt(str1)*Integer.parseInt(str2);
                res.append(String.valueOf(x));

            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                res.setText("Result :");

                String str1,str2;
                str1=no1.getText().toString();
                str2=no2.getText().toString();
                int x =Integer.parseInt(str1)/Integer.parseInt(str2);
                res.append(String.valueOf(x));
            }
        });



    }
  void  dif(){

        no1=findViewById(R.id.no1);
        no2=findViewById(R.id.no2);
      plus=findViewById(R.id.plus);
      neg=findViewById(R.id.neg);
      div=findViewById(R.id.div);
      times=findViewById(R.id.times);
      res=findViewById(R.id.res);

    }

}