package com.example.android.miwok;

public class ColoresActivity extends AbstractPalavraActivity {


    /**
     *  addPalavras - metodo que adiciona no array "palavras" que será mostrado na tela
     *  pacote drawable - onde contém as imagens mostradas nas telas
     *  pacote raw - onde está os arquivos de audio usados como a lingua Wiwok
     */
    protected  void addPalavras(){
        palavras.add(new Palavras("vermelho", "weṭeṭṭi", R.drawable.color_red, R.raw.color_red));
        palavras.add(new Palavras("Verde", "chokokki", R.drawable.color_green, R.raw.color_green));
        palavras.add(new Palavras("Marrom", "ṭakaakki", R.drawable.color_brown, R.raw.color_brown));
        palavras.add(new Palavras("Cinza", "ṭopoppi", R.drawable.color_gray, R.raw.color_gray));
        palavras.add(new Palavras("Preto", "kululli", R.drawable.color_black, R.raw.color_black));
        palavras.add(new Palavras("Branco", "kelelli", R.drawable.color_white, R.raw.color_white));
        palavras.add(new Palavras("Amarelo empoeirado", "ṭopiisә", R.drawable.color_dusty_yellow, R.raw.color_dusty_yellow));
        palavras.add(new Palavras("Amarelo mustarda", "chiwiiṭә", R.drawable.color_mustard_yellow, R.raw.color_mustard_yellow));
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
     *  metodo getBackgroundColor rretona o fundo referente a categoria cores
     * @return
     */
    @Override
    protected int getBackgroundColor() {
        return R.color.categoria_cores;
    }
}
