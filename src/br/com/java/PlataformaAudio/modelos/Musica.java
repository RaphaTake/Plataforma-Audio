package br.com.java.PlataformaAudio.modelos;

public class Musica extends Audio{

    private String artista;
    private String album;

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    @Override
    public int getNumeroDeReproducao(){
        if(this.getNumeroDeReproducao() > 500){
            return 10;
        }else{
            return 8;
        }
    }
}
