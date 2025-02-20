package br.com.java.PlataformaAudio.modelos;

public class Podcast extends Audio {

    private String host;
    private int episodio;


    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public int getEpisodio() {
        return episodio;
    }

    public void setEpisodio(int episodio) {
        this.episodio = episodio;
    }

    @Override

    public int getClassificacao(){
        if(this.getNumeroDeCurtidas() > 1000){
            return 10;
        } else{
            return 8;
        }
    }
}
