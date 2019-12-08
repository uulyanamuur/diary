package com.example.diary2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Raspisanie extends Activity {

    private Button btn_ponedelnik;
    private Button btn_vtornik;
    private Button btn_sreda;
    private Button btn_chetverg;
    private Button btn_pyatnica;
    private Button btn_subbota;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.raspisanie);

        btn_ponedelnik = (Button) findViewById(R.id.ponedelnik);
        btn_vtornik = (Button) findViewById(R.id.vtornik);
        btn_sreda = (Button) findViewById(R.id.sreda);
        btn_chetverg = (Button) findViewById(R.id.chetverg);
        btn_pyatnica = (Button) findViewById(R.id.pyatnica);
        btn_subbota = (Button) findViewById(R.id.subbota);

        //Описываем процесс перехода с MainActivity в SecondActivity,
        // который будет происходить при нажатии на нашу кнопку:

        btn_vtornik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Raspisanie.this, Vtornik.class);
                startActivity(intent);
            }
        });

        btn_ponedelnik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Raspisanie.this, Ponedelnik.class);
                startActivity(intent);
            }
        });

        btn_sreda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Raspisanie.this, Sreda.class);
                startActivity(intent);
            }
        });

        btn_chetverg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Raspisanie.this, Chetverg.class);
                startActivity(intent);
            }
        });

        btn_pyatnica.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Raspisanie.this, Pyatnica.class);
                startActivity(intent);
            }
        });

        btn_subbota.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Raspisanie.this, Subbota.class);
                startActivity(intent);
            }
        });
    }
}