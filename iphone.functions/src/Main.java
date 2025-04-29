import java.util.Scanner;

public class Main  {
    public static void main(String[] args) {
        Iphone meuIphone = new Iphone();
        Scanner sc = new Scanner(System.in);

        boolean voltar = false;

        System.out.println("\n====Bem vindo ao seu Iphone====");

        do {
            System.out.println("\n1._Music Player_");
            System.out.println("\n2._Call_");
            System.out.println("\n3._Internet Navigator_");
            System.out.println("\nDigite sua opcao:");
            int opcao = sc.nextInt();

            switch (opcao) {
                case 1 -> {
                    boolean sairdDoPlayer = false;
                    do {
                        System.out.println("\n==========Music Option============");
                        System.out.println("\n1._Tocar Musica");
                        System.out.println("\n2._Pausa Musica");
                        System.out.println("\n3._Selecionar Musica");
                        System.out.println("\n4._Voltar para o menu anterior");
                        System.out.println("\nDigite sua opcao:");
                        opcao = sc.nextInt();
                        switch (opcao) {
                            case 1 -> meuIphone.tocar();
                            case 2 -> meuIphone.pausar();
                            case 3 -> meuIphone.selecionarMusicar("Link Park - 'Numb'.");
                            case 4 -> sairdDoPlayer = true;
                            default -> System.out.println("\nOpcao invalida");
                        }
                    } while (!sairdDoPlayer);
                }
                case 2 -> {
                    boolean sairDoCall = false;
                    do {
                        System.out.println("\n==========Call Option============");
                        System.out.println("\n1._Fazer Ligacao");
                        System.out.println("\n2._Atender Ligacao");
                        System.out.println("\n3._Ouvir Caixa Postal");
                        System.out.println("\n4._Voltar para o menu anterior");
                        System.out.println("\nDigite sua opcao:");
                        opcao = sc.nextInt();
                        switch (opcao) {
                            case 1 -> meuIphone.ligar("41-99884455");
                            case 2 -> meuIphone.atender();
                            case 3 -> meuIphone.iniciarCorreioVoz();
                            case 4 -> sairDoCall = true;
                            default -> System.out.println("\nOpcao invalida");
                        }
                    } while (!sairDoCall);
                }
                case 3 -> {
                    boolean sairNavigation = false;
                    do {
                        System.out.println("\n==========Navigation Internet Option============");
                        System.out.println("\n1._Exibir Pagina");
                        System.out.println("\n2._Adicionar Nova Aba");
                        System.out.println("\n3._Atualizar Pagina Atual");
                        System.out.println("\n4._Voltar para o menu anterior");
                        System.out.println("\nDigite sua opcao:");
                        opcao = sc.nextInt();
                        switch (opcao) {
                            case 1 -> meuIphone.exibirPagina("http://google.com");
                            case 2 -> meuIphone.adicionarNovaAba();
                            case 3 -> meuIphone.atualizarPagina();
                            case 4 -> sairNavigation = true;
                            default -> System.out.println("\nOpcao invalida");
                        }
                    } while (!sairNavigation);
                }
            }

        } while (!voltar);
    }

}