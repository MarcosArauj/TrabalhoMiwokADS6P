package com.example.android.miwok;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import static com.example.android.miwok.R.id.colors;
import static com.example.android.miwok.R.id.family;
import static com.example.android.miwok.R.id.numbers;
import static com.example.android.miwok.R.id.phrases;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        /**
         *Define o conteúdo da atividade para der usado o arquivo de layout activity_main.xml
         */
        setContentView(R.layout.activity_main);

        /**
         * variavel numero referencia a Classe NumerosActivity
         * variavel familia referencia a Classe FamiliaActivity
         * variavel cores referencia a Classe CoresActivity
         * variavel frases referencia a Classe FrasesActivity
         */
        TextView numeros = (TextView) findViewById(numbers);
        TextView familia = (TextView) findViewById(family);
        TextView cores = (TextView) findViewById(colors);
        TextView frases = (TextView) findViewById(phrases);

        /**
         * metodos setOnClickListener - chamar a tela se sua referida classe idesntidicadas dentro
         * do Intent
         */
        assert numeros != null;
        numeros.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent numbersIntent = new Intent(MainActivity.this, NumerosActivity.class);
                startActivity(numbersIntent);
            }
        });

        assert familia != null;
        familia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent familyIntent = new Intent(MainActivity.this, FamiliaActivity.class);
                startActivity(familyIntent);
            }
        });

        assert cores != null;
        cores.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent colorsIntent = new Intent(MainActivity.this, ColoresActivity.class);
                startActivity(colorsIntent);
            }
        });

        assert frases != null;
        frases.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent phrasesIntent = new Intent(MainActivity.this, FrasesActivity.class);
                startActivity(phrasesIntent);
            }
        });

    }
    
}
