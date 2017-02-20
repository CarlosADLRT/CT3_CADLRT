package com.example.laboratorio.ct3_cadlrt;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button mSuma;
    Button mResta;
    Button mMulti;
    Button mDiv;
    Button m1;
    Button m2;
    Button m3;
    Button m4;
    Button m5;
    Button m6;
    Button m7;
    Button m8;
    Button m9,m0,mIgual;
    ImageButton imageButton;
    TextView textView;
    Double a;
    Double b,c;
    int ope;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mSuma= (Button) findViewById(R.id.suma);
        mResta= (Button) findViewById(R.id.resta);
        mMulti= (Button) findViewById(R.id.multiplicacion);
        mDiv= (Button) findViewById(R.id.division);
        m1= (Button) findViewById(R.id.uno);
        m2= (Button) findViewById(R.id.dos);
        m3= (Button) findViewById(R.id.tres);
        m4= (Button) findViewById(R.id.cuatro);
        m5= (Button) findViewById(R.id.cinco);
        m6= (Button) findViewById(R.id.seis);
        m7= (Button) findViewById(R.id.siete);
        m8= (Button) findViewById(R.id.ocho);
        m9= (Button) findViewById(R.id.nueve);
        m0= (Button) findViewById(R.id.cero);
        mIgual= (Button) findViewById(R.id.igual);
        imageButton= (ImageButton) findViewById(R.id.erase);
        textView= (TextView) findViewById(R.id.textView);
        textView.setText("");

    }



    public void onClick(View view) {
        String text=textView.getText().toString();
        String val="";
        if(!text.isEmpty()) {
            val = text.substring(text.length() - 1, text.length());

        }

        switch (view.getTag().toString()) {
            case "1":
                    if (val.equals("+")||val.equals("*")||val.equals("-")||val.equals("/")) {
                        textView.setText("");
                    }

                textView.setText(textView.getText()+"1");


                break;
            case "2":
                if (val.equals("+")||val.equals("*")||val.equals("-")||val.equals("/")) {
                    textView.setText("");
                }
                textView.setText(textView.getText()+"2");
                break;
            case "3":
                if (val.equals("+")||val.equals("*")||val.equals("-")||val.equals("/")) {
                    textView.setText("");
                }
                textView.setText(textView.getText()+"3");
                break;
            case "4":
                if (val.equals("+")||val.equals("*")||val.equals("-")||val.equals("/")) {
                    textView.setText("");
                }
                textView.setText(textView.getText()+"4");
                break;
            case "5":
                if (val.equals("+")||val.equals("*")||val.equals("-")||val.equals("/")) {
                    textView.setText("");
                }
                textView.setText(textView.getText()+"5");
                break;
            case "6":
                if (val.equals("+")||val.equals("*")||val.equals("-")||val.equals("/")) {
                    textView.setText("");
                }
                textView.setText(textView.getText()+"6");
                break;
            case "7":
                if (val.equals("+")||val.equals("*")||val.equals("-")||val.equals("/")) {
                    textView.setText("");
                }
                textView.setText(textView.getText()+"7");
                break;
            case "8":
                if (val.equals("+")||val.equals("*")||val.equals("-")||val.equals("/")) {
                    textView.setText("");
                }
                textView.setText(textView.getText()+"8");
                break;
            case "9":
                if (val.equals("+")||val.equals("*")||val.equals("-")||val.equals("/")) {
                    textView.setText("");
                }
                textView.setText(textView.getText()+"9");
                break;
            case "0":
                if (val.equals("+")||val.equals("*")||val.equals("-")||val.equals("/")) {
                    textView.setText("");
                }
                textView.setText(textView.getText()+"0");
                break;
            case "+":
                a=Double.parseDouble(textView.getText().toString());
                textView.setText(textView.getText()+"+");

                ope=1;
                break;
            case "-":
                a=Double.parseDouble(textView.getText().toString());
                textView.setText(textView.getText()+"-");

                ope=2;
                break;
            case "/":
                a=Double.parseDouble(textView.getText().toString());
                textView.setText(textView.getText()+"/");

                ope=4;
                break;
            case "x":
                a=Double.parseDouble(textView.getText().toString());
                textView.setText(textView.getText()+"*");

                ope=3;
                break;
            case "erase":
                if (textView.length()>0)
                textView.setText(textView.getText().subSequence(0,textView.getText().length()-1));
                break;
            case ".":
                textView.setText(textView.getText()+".");
                break;
            case "=":

                b=Double.parseDouble(textView.getText().toString());

                switch (ope) {
                    case 1:
                        c=a+b;
                        break;
                    case 2:
                        c=a-b;
                        break;
                    case 3:
                        c=a*b;

                        break;
                    case 4:
                        c=a/b;
                        break;
                }


                textView.setText(String.valueOf(c));
                ope=5;
                break;
        }
    }
}
