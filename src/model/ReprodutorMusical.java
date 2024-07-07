package model;

public class ReprodutorMusical {

    private String musica;

    public void tocar(){
        System.out.println("Tocando musica: " + musica);
    }

    public void pausar(){
        System.out.println("Musica pausada");
    }

    public void selecionarMusica(String musica){
        System.out.println("Musica selecionada: " + musica);
        this.musica = musica;
    }
}
