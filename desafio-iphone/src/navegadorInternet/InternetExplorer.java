package navegadorInternet;

public class InternetExplorer implements INavegadorInternet {
    @Override
    public void exibirPagina() {
        System.out.println("Abrindo pagina no navegador no internet explorer.");

    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba no navegador no internet explorer.");

    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando a pagina do navegador no internet explorer.");
    }

    public InternetExplorer() {
        System.out.println("Usando o navegador Internet Explorer");
    }
}
