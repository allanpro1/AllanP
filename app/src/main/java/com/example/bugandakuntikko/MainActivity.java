package com.example.bugandakuntikko;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button button6;
    private Button button7;
    private Button button8;
    private Button button9;
    private Button button10;
    private Button button11;
    private Button button12;
    private Button button13;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button6 = (Button) findViewById(R.id.button6);
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             engero();
            }
        });
        button7 = (Button) findViewById(R.id.button7);
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ebisoko();
            }
        });
        button8 = (Button) findViewById(R.id.button8);
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                amannya();
            }
        });
        button9 = (Button) findViewById(R.id.button9);
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ennaku();
            }
        });
        button10 = (Button) findViewById(R.id.button10);
        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                emyezi();
            }
        });
        button11 = (Button) findViewById(R.id.button11);
        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ekitiibwa();
            }
        });
        button12 = (Button) findViewById(R.id.button12);
        button12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                amasaza();
            }
        });
        button13 = (Button) findViewById(R.id.button13);
        button13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Ekika();
            }
        });

    }
 public void engero(){
     Intent intent = new Intent(this, engero.class);
     startActivity(intent);
 }
 public void ebisoko(){
        Intent intent = new Intent(this, ebisoko.class);
        startActivity(intent);
 }
 public void amannya(){
        Intent intent = new Intent(this, amannya.class);
        startActivity(intent);
 }
    public void ennaku(){
        Intent intent = new Intent(this, ennaku.class);
        startActivity(intent);
    }
    public void emyezi(){
        Intent intent = new Intent(this, emyezi.class);
        startActivity(intent);
    }
    public void ekitiibwa(){
        Intent intent = new Intent(this, ekitiibwa.class);
        startActivity(intent);
    }

    public void amasaza(){
        Intent intent = new Intent(this, Amasaza.class);
        startActivity(intent);
    }

    public void Ekika(){
        Intent intent = new Intent(this, Ekika.class);
        startActivity(intent);
    }
}




