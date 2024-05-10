package reprodutorMusical;

public class Mp3Player implements IReprodutorMusical{
    @Override
    public void pausarMusica() {
        System.out.println("Colocando a musica em modo de espera no MP3.");
    }

    @Override
    public void tocarMusica() {
        System.out.println("Reproduzindo a musica selecionada no MP3.");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecionando uma musica para reprodução no MP3.");
    }

    public Mp3Player() {
        System.out.println("Usando o aparelho MP3 Player");
    }
}
