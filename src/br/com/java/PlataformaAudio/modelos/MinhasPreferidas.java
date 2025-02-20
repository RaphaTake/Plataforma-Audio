package br.com.java.PlataformaAudio.modelos;

public class MinhasPreferidas{

    public void inclui(Audio audio){
        if(audio.getClassificacao() >= 9){
            System.out.println(audio.getTitulo() + " é considerado uma ótima musica!");
        }else {
            System.out.println(audio.getTitulo() + " é uma boa opção para se pensar!");
        }
    }
}
