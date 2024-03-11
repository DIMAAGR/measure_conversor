package measureConverter.view;

import java.util.Scanner;

public class ConversorView {

    private Scanner scanner = new Scanner(System.in);
    public int actualPage = 0;
    private boolean doExecuteProgram = true;

    public int selectConversionOption() {
        do {
            System.out.println("========================================================================");
            System.out.println("Bem vindo ao conversor! selecione uma das medidas/metricas abaixo:");
            System.out.println("1 - Celcius");
            System.out.println("2 - Fahrenheit");
            System.out.println("3 - Kelvin");
            System.out.println("4 - Metros");
            System.out.println("5 - Polegadas");
            System.out.println("6 - Sair");
            System.out.println("========================================================================");
            System.out.print("Digite um número: ");

            // A execução do método showSelectableConversionsView() deve ser feita pelo
            // método showAllConversionsAvailable(). Isso porque
            // showSelectableConversionsView() é responsável por apresentar as opções ao
            // usuário e lidar com a seleção feita por ele, enquanto
            // showAllConversionsAvailable() é responsável por exibir a lista de conversões
            // disponíveis e solicitar uma escolha ao usuário.
            //
            // Assim, faz sentido que a exibição das opções e a interação com o usuário
            // sejam tratadas dentro do mesmo método, showAllConversionsAvailable(), que
            // está mais diretamente relacionado com essa funcionalidade específica da view.
            // Isso mantém a responsabilidade bem definida e ajuda a evitar a mistura de
            // lógica dentro da classe ConversorView.
            return getSelectedConversion();
        } while (doExecuteProgram);
    }

    public int getSelectedConversion() {
        actualPage = scanner.nextInt();

        switch (actualPage) {
            case 1:
                clearView();
                return 1;
            case 2:
                clearView();
                return 2;
            case 3:
                clearView();
                return 3;
            case 4:
                clearView();
                return 4;
            case 5:
                clearView();
                return 5;
            case 6:
                doExecuteProgram = false;
                clearView();
                return 6;
            default:
                clearView();
                return 0;
        }
    }

    public void clearView() {
        // Imprimir 50 linhas em branco para simular a limpeza da tela
        for (int i = 0; i < 50; i++) {
            System.out.println();
        }

    }

}
