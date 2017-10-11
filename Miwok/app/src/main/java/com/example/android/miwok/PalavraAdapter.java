package com.example.android.miwok;

import android.app.Activity;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class PalavraAdapter extends ArrayAdapter<Palavras> {

    private int backgroundColor = R.color.categoria_cores;

    public PalavraAdapter(Activity context, ArrayList<Palavras> palavras) {
        super(context, 0, palavras);
    }

    public void setBackgroundColor(int color) {
        backgroundColor = color;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listViewItem = convertView;

        /**
         * Aqui Verifica se a lista está sendo reutilizada, caso contrário crie-a.
         */
        if (listViewItem == null) {
            listViewItem = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        listViewItem.setBackgroundColor(ContextCompat.getColor(getContext(), backgroundColor));

        Palavras currentPalavras = getItem(position);

        TextView miwokWord = (TextView) listViewItem.findViewById(R.id.miwok_word);
        TextView defaultWord = (TextView) listViewItem.findViewById(R.id.english_word);
        ImageView img = (ImageView) listViewItem.findViewById(R.id.imageview);

        miwokWord.setText(currentPalavras.getTraducaoMiwok());
        defaultWord.setText(currentPalavras.getTraducaoPadrao());

        if (currentPalavras.getReferenciaImagem() == 0) {
            img.setVisibility(View.GONE);
        } else {
            img.setVisibility(View.VISIBLE);
            img.setImageResource(currentPalavras.getReferenciaImagem());
        }

        return listViewItem;
    }
}
