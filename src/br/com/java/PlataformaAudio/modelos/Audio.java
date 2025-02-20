package br.com.java.PlataformaAudio.modelos;

public class Audio {

    private String titulo;
    private int duracao;
    private String autor;
    private int dataLancamento;
    private int numeroDeCurtidas;
    private int numeroDeReproducao;
    private int classificacao;

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getDataLancamento() {
        return dataLancamento;
    }

    public void setDataLancamento(int dataLancamento) {
        this.dataLancamento = dataLancamento;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void curte(){
        this.numeroDeCurtidas++;
    }

    public void reproduz(){
        this.numeroDeReproducao++;
    }

    public int getNumeroDeCurtidas() {
        return numeroDeCurtidas;
    }

    public int getNumeroDeReproducao() {
        return numeroDeReproducao;
    }

    public int getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(int classificacao) {
        this.classificacao = classificacao;
    }


}
