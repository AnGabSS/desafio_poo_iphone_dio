import model.AparelhoTelefonico;
import model.Iphone;
import model.Navegador;
import model.ReprodutorMusical;

public class Main {
    public static void main(String[] args) {

        ReprodutorMusical reprodutor = new ReprodutorMusical();
        AparelhoTelefonico aparelho = new AparelhoTelefonico();
        Navegador navegador = new Navegador();

        Iphone iphone = new Iphone("15 pro max", reprodutor, aparelho, navegador);


        iphone.getReprodutor().selecionarMusica("Radiohead - No Surprises");
        iphone.getReprodutor().tocar();
        iphone.getReprodutor().pausar();

        iphone.getAparelho().ligar("40028922");
        iphone.getAparelho().atender();
        iphone.getAparelho().iniciarCorreioVoz();

        iphone.getNavegador().exibirPagina("www.google.com.br");
        iphone.getNavegador().atualizarPagina();
        iphone.getNavegador().adicionarNovaAba();

    }
}