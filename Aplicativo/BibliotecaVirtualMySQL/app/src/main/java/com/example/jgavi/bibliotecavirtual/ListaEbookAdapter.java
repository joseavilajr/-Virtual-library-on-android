package com.example.jgavi.bibliotecavirtual;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class ListaEbookAdapter extends BaseAdapter {
    private Context context;
    private ArrayList<Ebook> list;

    public ListaEbookAdapter(Context ctx, ArrayList<Ebook> lista2){
        context = ctx;
        list = lista2;
    }


    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Ebook getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v = null;
        if (convertView == null){
            LayoutInflater inflater = ((Activity)context).getLayoutInflater();
            v = inflater.inflate(R.layout.titulo_lista, null);
        } else{
            v = convertView;
        }

        //Usuario usuario = getItem(position);
        Ebook titulo = getItem(position);

        TextView itemTitulo = (TextView) v.findViewById(R.id.textTituloList);
        TextView itemAutor = (TextView) v.findViewById(R.id.textAutorList);
        TextView itemEdicao = (TextView) v.findViewById(R.id.textEdicaoList);
        TextView itemAno = (TextView) v.findViewById(R.id.textAnoList);
        TextView itemCurso = (TextView) v.findViewById(R.id.textCursoList);


        itemTitulo.setText(titulo.getTitulo());
        itemAutor.setText(titulo.getAutor());
        itemEdicao.setText(titulo.getEdicao());
        itemAno.setText(titulo.getAno());
        itemCurso.setText(titulo.getCurso());



        return v;
    }
}
