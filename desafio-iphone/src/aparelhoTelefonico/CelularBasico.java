package aparelhoTelefonico;

public class CelularBasico implements IAparelhoTelefonico{

    @Override
    public void fazerLigacao() {
        System.out.println("fazendo uma ligação telefonica no celular.");
    }

    @Override
    public void antederLigacao() {
        System.out.println("Atendendo uma ligação telefonica no celular.");

    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Abrindo correio de voz no celular.");
    }

    public CelularBasico() {
        System.out.println("Usando o aparelho de celuar basico");
    }
}
