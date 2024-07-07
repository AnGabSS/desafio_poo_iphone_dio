package model;

public class Iphone {

    private String modelo;

    private ReprodutorMusical reprodutor;

    private AparelhoTelefonico aparelho;

    private Navegador navegador;

    public Iphone(String modelo, ReprodutorMusical reprodutor, AparelhoTelefonico aparelho, Navegador navegador) {
        this.modelo = modelo;
        this.reprodutor = reprodutor;
        this.aparelho = aparelho;
        this.navegador = navegador;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public ReprodutorMusical getReprodutor() {
        return reprodutor;
    }

    public void setReprodutor(ReprodutorMusical reprodutor) {
        this.reprodutor = reprodutor;
    }

    public AparelhoTelefonico getAparelho() {
        return aparelho;
    }

    public void setAparelho(AparelhoTelefonico aparelho) {
        this.aparelho = aparelho;
    }

    public Navegador getNavegador() {
        return navegador;
    }

    public void setNavegador(Navegador navegador) {
        this.navegador = navegador;
    }
}
