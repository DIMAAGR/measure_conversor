package measureConverter.view;

import java.util.Scanner;

import measureConverter.enums.ViewOption;

public class ConversorView {

    private Scanner scanner = new Scanner(System.in);
    public int actualPage = 0;

    public void displayConversionOptions() {
        System.out.println("========================================================================");
        System.out.println("Bem vindo ao conversor! selecione uma das áreas abaixo:");
        System.out.println("1 - Comprimento");
        System.out.println("2 - Temperatura");
        System.out.println("3 - Peso");
        System.out.println("4 - Sair");
        System.out.println("========================================================================");
        System.out.print("Digite um número: ");
    }

    public ViewOption getSelectedConversionOption() {
        actualPage = scanner.nextInt();

        switch (actualPage) {
            case 1:
                clearView();
                return ViewOption.LENGHT;
            case 2:
                clearView();
                return ViewOption.TEMPERATURE;
            case 3:
                clearView();
                return ViewOption.WEIGHT;
            case 4:
                clearView();
                return ViewOption.EXIT;
            default:
                clearView();
                return ViewOption.NONE;
        }
    }

    public void clearView() {
        // Imprimir 50 linhas em branco para simular a limpeza da tela
        for (int i = 0; i < 50; i++) {
            System.out.println();
        }

    }

}

/*
 * System.out.println(
 * "========================================================================");
 * System.out.println("Bem vindo ao conversor! selecione uma das áreas abaixo:"
 * );
 * System.out.println("1 - Celcius");
 * System.out.println("2 - Fahrenheit");
 * System.out.println("3 - Kelvin");
 * System.out.println("4 - Metros");
 * System.out.println("5 - Polegadas");
 * System.out.println("6 - Sair");
 * System.out.println(
 * "========================================================================");
 * System.out.print("Digite um número: ");
 */