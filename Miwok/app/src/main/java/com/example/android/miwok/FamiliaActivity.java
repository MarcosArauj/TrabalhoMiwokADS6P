package com.example.android.miwok;

public class FamiliaActivity extends AbstractPalavraActivity {

    /**
     *  addPalavras - metodo que adiciona no array "palavras" que será mostrado na tela
     *  pacote drawable - onde contém as imagens mostradas nas telas
     *  pacote raw - onde está os arquivos de audio usados como a lingua Wiwok
     */
    protected void addPalavras() {
        palavras.add(new Palavras("pai", "әpә", R.drawable.family_father, R.raw.family_father));
        palavras.add(new Palavras("mãe", "әṭa", R.drawable.family_mother, R.raw.family_mother));
        palavras.add(new Palavras("filho", "angsi", R.drawable.family_son, R.raw.family_son));
        palavras.add(new Palavras("filha", "tune", R.drawable.family_daughter, R.raw.family_daughter));
        palavras.add(new Palavras("irmão mais velho", "taachi", R.drawable.family_older_brother, R.raw.family_older_brother));
        palavras.add(new Palavras("irmão mais novo", "chalitti", R.drawable.family_younger_brother, R.raw.family_younger_brother));
        palavras.add(new Palavras("irmã mais velha", "teṭe", R.drawable.family_older_sister, R.raw.family_older_sister));
        palavras.add(new Palavras("irmã mais nova", "kolliti", R.drawable.family_younger_sister, R.raw.family_younger_sister));
        palavras.add(new Palavras("avó", "ama", R.drawable.family_grandmother, R.raw.family_grandmother));
        palavras.add(new Palavras("avô", "paapa", R.drawable.family_grandfather, R.raw.family_grandfather));

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
     *  metodo getBackgroundColor rretona o fundo referente a categoria familia
     * @return
     */
    @Override
    protected int getBackgroundColor() {
        return R.color.categoria_familia;
    }

}
