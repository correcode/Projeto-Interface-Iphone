import java.util.Scanner;

public class Iphone implements MusicPlayer, Call, InternetNavigator{
    Scanner sc = new Scanner(System.in);

    private String musicaAtual;
    private boolean tocandoMusica = false;

    @Override
    public void tocar() {
        if (musicaAtual != null) {
            System.out.println("Tocando musica : " + musicaAtual);
            tocandoMusica = true;
        } else {
            System.out.println("Nenhuma musica selecionada");
        }
    }

    @Override
    public void pausar() {
        if (tocandoMusica = true) {
            System.out.println("Pause [1] :");
            int pause = sc.nextInt();
            switch (pause) {
                case 1 -> {
                    System.out.println("Musica pausada..");
                }
                default -> {
                    System.out.print("Opcao invalida..");
                }
            }
        }
    }

    @Override
    public void selecionarMusicar(String musica) {
        this.musicaAtual = musica;
        System.out.println("Musica selecionada :" + musica);
    }

    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para :" + numero);
    }

    @Override
    public void atender() {
        System.out.println("Estao te ligando :: para atender tecle [1].");
        int atendendo = sc.nextInt();
        if (atendendo == 1) {
            System.out.println("Ligacao atendida..");
        } else {
            System.out.println("Opcao invalida..");
        }
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Voce tem uma mensagem de voz, para ouvir tecle [2]");
        int ouvir = sc.nextInt();
        if (ouvir == 2) {
            System.out.println("Ola preciso muito falar com voce, assim que possivel me retorne!");
        } else {
            System.out.println("Opcao invalida..");
        }
    }


    @Override
    public void exibirPagina(String url) {
        System.out.println("Navegando no site : " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionar nova aba tecle [3]:");
        int novaAba = sc.nextInt();
        if (novaAba == 3) {
            System.out.println("Nova aba aberta, digite seu novo URL");
            String url = sc.next();
            System.out.println("Navegando no site : " + url);
        } else {
            System.out.println("Opcao invalida.");
        }

    }

    @Override
    public void atualizarPagina() {
        System.out.println("Para atualizar a pagina tecle [5]: ");
        int atualizarPagina = sc.nextInt();
        if (atualizarPagina == 5) {
            System.out.println("Pagina atualizada.");
        } else {
            System.out.println("Opcao invalida.");
        }
    }
}