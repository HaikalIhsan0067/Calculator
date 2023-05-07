package com.example.mycalculatortest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText nilai1 = (EditText) findViewById(R.id.nilai1);
        EditText nilai2 = (EditText) findViewById(R.id.nilai2);
        EditText Display = (EditText) findViewById(R.id.Display);

        //        kode pomrograman untuk button tambah
        Button btnTambah = (Button) findViewById(R.id.btnTambah);

        btnTambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String stringNilai1 = nilai1.getText().toString();
                double numerickNilai1 = Double.valueOf(stringNilai1);

                String stringNilai2 = nilai2.getText().toString();
                double numerickNilai2 = Double.valueOf(stringNilai2);

                Double numerickHasil = numerickNilai1 + numerickNilai2;

                String stringHasil = numerickHasil.toString();
                Display.setText(stringHasil);

            }
        });

        //        kode pomrograman untuk button kurang
        Button btnKurang = (Button) findViewById(R.id.btnKurang);

        btnKurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String stringNilai1 = nilai1.getText().toString();
                double numerickNilai1 = Double.valueOf(stringNilai1);

                String stringNilai2 = nilai2.getText().toString();
                double numerickNilai2 = Double.valueOf(stringNilai2);

                Double numerickHasil = numerickNilai1 - numerickNilai2;

                if(stringNilai1)

                String stringHasil = numerickHasil.toString();
                Display.setText(stringHasil);
            }
        });

        //        kode pomrograman untuk button kali
        Button btnKali = (Button) findViewById(R.id.btnKali);

        btnKali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String stringNilai1 = nilai1.getText().toString();
                double numerickNilai1 = Double.valueOf(stringNilai1);

                String stringNilai2 = nilai2.getText().toString();
                double numerickNilai2 = Double.valueOf(stringNilai2);

                Double numerickHasil = numerickNilai1 * numerickNilai2;

                String stringHasil = numerickHasil.toString();
                Display.setText(stringHasil);
            }
        });

        //        kode pomrograman untuk button bagi
        Button btnBagi = (Button) findViewById(R.id.btnBagi);

        btnBagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String stringNilai1 = nilai1.getText().toString();
                double numerickNilai1 = Double.valueOf(stringNilai1);

                String stringNilai2 = nilai2.getText().toString();
                double numerickNilai2 = Double.valueOf(stringNilai2);

                Double numerickHasil = numerickNilai1 / numerickNilai2;

                String stringHasil = numerickHasil.toString();
                Display.setText(stringHasil);
            }
        });

        //        kode pomrograman untuk button hapus
        Button btnHapus = (Button) findViewById(R.id.btnHapus);

        btnHapus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nilai1.setText("");
                nilai2.setText("");
                Display.setText("");
            }
        });

        //        kode pomrograman untuk button exit
        Button btnExit = (Button) findViewById(R.id.btnExit);

        btnExit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

    }
}