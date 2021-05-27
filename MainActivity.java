package com.example.appseries;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    ArrayList<Series> arrayList;

    //
    final String SINOPSE_THE = "O mutante Geralt de Rívia é um caçador de monstros que luta para encontrar seu lugar em um mundo onde as pessoas, muitas vezes, são mais perversas do que as criaturas selvagens.";
    final String SINOPSE_GAMBITO = "Uma órfã prodígio do xadrez luta contra vícios enquanto enfrenta os maiores enxadristas do mundo.";
    final String SINOPSE_RAINHA = "A história de uma mulher que luta para se tornar a rainha de um cartel de drogas. Teresa Mendoza é forçada a fugir e a procurar refúgio nos Estados Unidos depois que seu namorado, um traficante, é assassinado.";
    final String SINOPSE_LA = "Um grupo de nove ladrões, liderados por um Professor, prepara o roubo do século na Casa da Moeda da Espanha, com o objetivo de fabricar o próprio dinheiro em quantidades incalculáveis e nunca antes vista.";

    ArrayAdapter<Series> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //ESTANCIAR OBJETOS
        listView = findViewById(R.id.id_listview);
        arrayList = new ArrayList<>();
        arrayList.add(new Series("The Witcher", 8, SINOPSE_THE, R.drawable.witcher, "thewitcher"));
        arrayList.add(new Series("Rainha do Sul", 5, SINOPSE_RAINHA, R.drawable.rainha, "rainhadosul"));
        arrayList.add(new Series("O Gambito da Rainha", 1, SINOPSE_GAMBITO, R.drawable.gambito, "gambito"));
        arrayList.add(new Series("La Casa de Papel", 2, SINOPSE_LA, R.drawable.lacasa, "lacasa"));

        adapter = new SeriesAdapter(this,arrayList);
        listView.setAdapter(adapter);

        //COMANDO PARA A CLASSE DETALHE FUNCIONAR
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Series seroeSelecionada = arrayList.get(position);
                Intent it = new Intent(MainActivity.this,DetalheActivity.class);

                it.putExtra("serie", seroeSelecionada);
                startActivity(it);


            }
        }
        );

    }
}