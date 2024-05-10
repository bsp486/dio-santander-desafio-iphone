package smartPhone;

import aparelhoTelefonico.IAparelhoTelefonico;
import navegadorInternet.INavegadorInternet;
import reprodutorMusical.IReprodutorMusical;

public class SmartPhone implements IAparelhoTelefonico, INavegadorInternet, IReprodutorMusical {
    @Override
    public void fazerLigacao() {
        System.out.println("fazendo uma ligação telefonica.");
    }

    @Override
    public void antederLigacao() {
        System.out.println("Atendendo uma ligação telefonica.");

    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Abrindo correio de voz.");
    }

    @Override
    public void exibirPagina() {
        System.out.println("Abrindo pagina no navegador.");

    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba no navegador.");

    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando a pagina do navegador.");
    }

    @Override
    public void pausarMusica() {
        System.out.println("Colocando a musica em modo de espera.");
    }

    @Override
    public void tocarMusica() {
        System.out.println("Reproduzindo a musica selecionada.");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecionando uma musica para reprodução.");
    }

    public SmartPhone() {
        System.out.println("Criando um Smart Phone para uso");
    }
}
