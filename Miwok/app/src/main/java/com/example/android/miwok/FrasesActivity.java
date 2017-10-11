package com.example.android.miwok;

public class FrasesActivity extends AbstractPalavraActivity {

    /**
     *  addPalavras - metodo que adiciona no array "palavras" que será mostrado na tela
     *  pacote drawable - onde contém as imagens mostradas nas telas
     *  pacote raw - onde está os arquivos de audio usados como a lingua Wiwok
     */

    protected void addPalavras() {
        palavras.add(new Palavras("Onde você está indo?", "minto wuksus", R.raw.phrase_where_are_you_going));
        palavras.add(new Palavras("Qual o seu nome?", "tinnә oyaase'nә", R.raw.phrase_what_is_your_name));
        palavras.add(new Palavras("Meu nome é...", "oyaaset...", R.raw.phrase_my_name_is));
        palavras.add(new Palavras("Como está se sentindo?", "michәksәs?", R.raw.phrase_how_are_you_feeling));
        palavras.add(new Palavras("Estou me sentido bem.", "kuchi achit", R.raw.phrase_im_feeling_good));
        palavras.add(new Palavras("Você está vindo?", "әәnәs'aa?", R.raw.phrase_are_you_coming));
        palavras.add(new Palavras("Sim, estou indo.", "hәә’ әәnәm", R.raw.phrase_yes_im_coming));
        palavras.add(new Palavras("Estou indo.", "әәnәm", R.raw.phrase_im_coming));
        palavras.add(new Palavras("Vamos.", "yoowutis", R.raw.phrase_lets_go));
        palavras.add(new Palavras("Venha aqui.", "әnni'nem", R.raw.phrase_come_here));


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
     *  metodo getBackgroundColor rretona o fundo referente a categoria frases
     * @return
     */
    @Override
    protected int getBackgroundColor() {
        return R.color.categria_frases;
    }
}
