package com.example.appseries;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetalheActivity extends AppCompatActivity {

    ImageView imagem;
    TextView titulo;
    TextView numTemporadas;
    TextView sinopse;

    Intent it;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalhe);

        //OBJETOS ESTANCIADOS
        titulo = findViewById(R.id.id_detalhe_titulo);
        numTemporadas = findViewById(R.id.id_detalhe_num_temp);
        sinopse = findViewById(R.id.id_detalhe_sinopse);
        imagem = findViewById(R.id.id_detalhe_imagem);


        it = getIntent();

        if (it.hasExtra("serie")){
            Series serie = (Series) it.getSerializableExtra("serie");
            titulo.setText(serie.getTitulo());
            numTemporadas.setText(numTemporadas.getText()+""+serie.getNumTemp());
            sinopse.setText(serie.getSinopse());

            Drawable drawable = getImagem(serie.getNomeImg());
            imagem.setImageDrawable(drawable);
        }


    }

    private Drawable getImagem(String nomeImg) {
        Resources resources = DetalheActivity.this.getResources();
        int intDoImagem = resources.getIdentifier(nomeImg,"drawable", DetalheActivity.this.getPackageName());
        return  resources.getDrawable(intDoImagem);
    }
}