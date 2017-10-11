package com.example.android.miwok;

public class NumerosActivity extends AbstractPalavraActivity {

    /**
     *  addPalavras - metodo que adiciona no array "palavras" que será mostrado na tela
     *  pacote drawable - onde contém as imagens mostradas nas telas
     *  pacote raw - onde está os arquivos de audio usados como a lingua Wiwok
     */
    protected void addPalavras() {
        palavras.add(new Palavras("um", "lutti", R.drawable.number_one, R.raw.number_one));
        palavras.add(new Palavras("dois", "otiiko", R.drawable.number_two, R.raw.number_two));
        palavras.add(new Palavras("três", "tolookosu", R.drawable.number_three, R.raw.number_three));
        palavras.add(new Palavras("quatro", "oyyisa", R.drawable.number_four, R.raw.number_four));
        palavras.add(new Palavras("cinco", "massokka", R.drawable.number_five, R.raw.number_five));
        palavras.add(new Palavras("seis", "temmokka", R.drawable.number_six, R.raw.number_six));
        palavras.add(new Palavras("sete", "kenekaku", R.drawable.number_seven, R.raw.number_seven));
        palavras.add(new Palavras("oito", "kawinta", R.drawable.number_eight, R.raw.number_eight));
        palavras.add(new Palavras("nove", "wo’e", R.drawable.number_nine, R.raw.number_nine));
        palavras.add(new Palavras("dez", "na’aacha", R.drawable.number_ten, R.raw.number_ten));
    }

    /**
     *  metodo getActivityId retorna o layout formatado no arquivo palavra_list
     * @return
     */
    @Override
    protected int getActivityId() {
        return R.layout.palavra_list;
    }

    /**
     *  metodo getBackgroundColor rretona o fundo referente a categoria numeros
     * @return
     */
    @Override
    protected int getBackgroundColor() {
        return R.color.categoria_numeros;
    }
}
