package com.droxs.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    double num;
    String a;
    String b;
    double result;
    String op;
    TextView pantalla=(TextView)findViewById(R.id.pantalla);
    Button bt;
    boolean sw=false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void igual(View view) {
        switch (op){
            case "+":result=Double.parseDouble(a)+Double.parseDouble(b);break;
            case "-":result=Double.parseDouble(a)-Double.parseDouble(b);break;
            case "*":result=Double.parseDouble(a)*Double.parseDouble(b);break;
            case "/":result=Double.parseDouble(a)/Double.parseDouble(b);break;
        }
        pantalla.setText(result+"");
        sw=false;
    }

    public void resta(View view) {
        op="-";
        if(sw){
            b = pantalla.getText().toString();
            sw=false;
        }else{
            a = pantalla.getText().toString();
            sw=true;
        }
    }

    public void siete(View view) {
        if(sw){
            bt=(Button)findViewById(R.id.button);
            num=Double.parseDouble(pantalla.getText().toString())*10;
            num=num+Double.parseDouble(bt.getText().toString());
            b=num+"";
            pantalla.clearComposingText();
            pantalla.setText(b);
        }else{
            bt=(Button)findViewById(R.id.button);
            num=Double.parseDouble(pantalla.getText().toString())*10;
            num=num+Double.parseDouble(bt.getText().toString());
            a=num+"";
            pantalla.clearComposingText();
            pantalla.setText(a);
        }
    }

    public void suma(View view) {
        op="+";
        if(sw){
            b = pantalla.getText().toString();
            sw=false;
        }else{
            a = pantalla.getText().toString();
            sw=true;
        }
    }

    public void cero(View view) {
        if(sw){
            bt=(Button)findViewById(R.id.button);
            num=Double.parseDouble(pantalla.getText().toString())*10;
            num=num+Double.parseDouble(bt.getText().toString());
            b=num+"";
            pantalla.clearComposingText();
            pantalla.setText(b);
        }else{
            bt=(Button)findViewById(R.id.button);
            num=Double.parseDouble(pantalla.getText().toString())*10;
            num=num+Double.parseDouble(bt.getText().toString());
            a=num+"";
            pantalla.clearComposingText();
            pantalla.setText(a);
        }
    }

    public void punto(View view) {
        if(sw){
            b=b+".0";
            pantalla.clearComposingText();
            pantalla.setText(b);
        }else{
            bt=(Button)findViewById(R.id.button);
            num=Double.parseDouble(pantalla.getText().toString())*10;
            num=num+Double.parseDouble(bt.getText().toString());
            a=a+".0";
            pantalla.clearComposingText();
            pantalla.setText(a);
        }
    }
}
