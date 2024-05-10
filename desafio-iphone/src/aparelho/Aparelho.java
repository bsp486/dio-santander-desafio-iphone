package aparelho;

import aparelhoTelefonico.CelularBasico;
import navegadorInternet.InternetExplorer;
import reprodutorMusical.Mp3Player;
import smartPhone.SmartPhone;

public class Aparelho {
    public static void main(String[] args) {
        CelularBasico motorola = new CelularBasico();
        motorola.antederLigacao();
        motorola.fazerLigacao();
        motorola.iniciarCorreioVoz();
        System.out.println("--------------------------------------------------------");
        InternetExplorer ie = new InternetExplorer();
        ie.exibirPagina();
        ie.adicionarNovaAba();
        ie.atualizarPagina();
        System.out.println("--------------------------------------------------------");
        Mp3Player mp3Player = new Mp3Player();
        mp3Player.selecionarMusica();
        mp3Player.tocarMusica();
        mp3Player.pausarMusica();
        System.out.println("--------------------------------------------------------");
        SmartPhone iPhone = new SmartPhone();
        System.out.println("Usando um IPhone.");
        iPhone.antederLigacao();
        iPhone.fazerLigacao();
        iPhone.iniciarCorreioVoz();
        iPhone.exibirPagina();
        iPhone.adicionarNovaAba();
        iPhone.atualizarPagina();
        iPhone.selecionarMusica();
        iPhone.tocarMusica();
        iPhone.pausarMusica();
    }
}
