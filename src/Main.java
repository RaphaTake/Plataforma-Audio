import br.com.java.PlataformaAudio.modelos.MinhasPreferidas;
import br.com.java.PlataformaAudio.modelos.Musica;
import br.com.java.PlataformaAudio.modelos.Podcast;

public class Main {

    public static void main(String[] args) {



        //Objetos Musica
        Musica musica = new Musica();
        musica.setTitulo("Not Like Us");
        musica.setAlbum("Not Like Us");
        musica.setArtista("Kendrick Lamar");
        System.out.println("Musica escolhida: " + musica.getTitulo() + "\nÁlbum: " + musica.getAlbum() + "\nArtista: " + musica.getArtista());

        for (int i = 0; i < 1000; i++){
            musica.reproduz();
        }

        for (int i = 0; i < 1000; i++){
            musica.curte();
        }


        //Objetos Podcast
        Podcast podcast = new Podcast();
        podcast.setTitulo("Codando em Java: POO");
        podcast.setHost("Javeiros natos");
        podcast.setEpisodio(1);
        System.out.println("Podcast escolhido: " + podcast.getTitulo() + "\nEpisódio: " + podcast.getEpisodio() + "\nNome do canal: " + podcast.getHost());

        for (int i = 0; i < 1000; i++){
            musica.reproduz();
        }

        for (int i = 0; i < 1000; i++){
            musica.curte();
        }

        MinhasPreferidas minhasPreferidas = new MinhasPreferidas();
        minhasPreferidas.inclui(musica);
        minhasPreferidas.inclui(podcast);

    }
}