package com.example.appseries;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;

    public class SeriesAdapter extends ArrayAdapter<Series> {

        private final Context context;
        private final ArrayList<Series> itens;

        public SeriesAdapter(Context context, ArrayList<Series> itens){
            super(context, R.layout.layout_listview, itens);
            this.context=context;
            this.itens=itens;
        }

        //este método será utilizado para converter o Produto.java em xml
        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

            //O LayoutInflater é usado para instanciar conteudo em xml
            LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

            //objeto linha é para a linha do listview
            View linha = layoutInflater.inflate(R.layout.layout_listview, parent, false);

            ImageView imagem = linha.findViewById(R.id.id_detalhe_imagem);
            TextView titulo = linha.findViewById(R.id.titulo);

            imagem.setImageResource(itens.get(position).getImagem());
            titulo.setText(itens.get(position).getTitulo());

            return linha;
        }
    }

