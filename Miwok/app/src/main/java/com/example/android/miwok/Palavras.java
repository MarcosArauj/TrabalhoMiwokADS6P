package com.example.android.miwok;

public class Palavras {
    private String mtraducaoPadrao;
    private String mtraducaoMiwok;
    private int mReferenciaImagem;
    private int mReferenciaAudio;

    /**
     *  metodo que recebe as traduçoes de cada palavra e a referencia do audio de cada palavra
     * @param traducaoPadrao
     * @param traducaoMiwok
     * @param referenciaAudio
     */
    public Palavras(String traducaoPadrao, String traducaoMiwok, int referenciaAudio) {
        mtraducaoPadrao = traducaoPadrao;
        mtraducaoMiwok = traducaoMiwok;
        mReferenciaAudio = referenciaAudio;
    }

    /**
     *
     * @param traducaoPadrao
     * @param traducaoMiwok
     * @param referenciaImagem
     * @param referenciaAudio
     */
    public Palavras(String traducaoPadrao, String traducaoMiwok, int referenciaImagem, int referenciaAudio) {
        mtraducaoPadrao = traducaoPadrao;
        mtraducaoMiwok = traducaoMiwok;
        mReferenciaImagem = referenciaImagem;
        mReferenciaAudio = referenciaAudio;
    }

    /**
     * retorna a tradução padrão de cada palavra
     * @return
     */
    public String getTraducaoPadrao() {
        return mtraducaoPadrao;
    }

    /**
     * retorna a tradução em Miwok
     * @return
     */
    public String getTraducaoMiwok() {
        return mtraducaoMiwok;
    }

    /**
     * retorna a referencia da imagem usada em cada situação
     * @return
     */
    public int getReferenciaImagem() {
        return mReferenciaImagem;
    }

    /**
     * retorna a referencia do audio da redução em Miwok
     * @return
     */
    public int getReferenciaAudio() {
        return mReferenciaAudio;
    }
}
