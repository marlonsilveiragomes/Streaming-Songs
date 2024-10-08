package br.com.marlon.minhasmusicas.pricipal;

import br.com.marlon.minhasmusicas.modelos.MinhasPreferidas;
import br.com.marlon.minhasmusicas.modelos.Musica;
import br.com.marlon.minhasmusicas.modelos.Podcast;

public class Principal {
    public static void main(String[] args) {
        Musica minhaMusica = new Musica();
        minhaMusica.setTitulo("Forever");
        minhaMusica.setCantor("Kiss");


        for (int i = 0; i < 1000; i++) {
            minhaMusica.reproduzur();
        }

        for (int i = 0; i < 50; i++) {
            minhaMusica.curte();

        }

        Podcast meuPodcast = new Podcast();
        meuPodcast.setTitulo("BolhaDev");
        meuPodcast.setApresentador("Marcus Mendes");

        for (int i = 0; i < 5000; i++) {
            meuPodcast.reproduzur();
        }
        for (int i = 0; i < 1000; i++) {
            meuPodcast.curte();
        }
        MinhasPreferidas preferidas = new MinhasPreferidas();
        preferidas.inclui(meuPodcast);
        preferidas.inclui(minhaMusica);


    }
}
