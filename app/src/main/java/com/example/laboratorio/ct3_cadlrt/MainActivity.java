package com.example.laboratorio.ct3_cadlrt;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
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
        
    }
}
