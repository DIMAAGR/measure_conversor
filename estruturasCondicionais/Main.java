package estruturasCondicionais;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String nome;
        int serie, idade;
        boolean estaNoEnsinoMedio = false; // ???????????? porque não pode ser só bool???

        // Scanner é a classe que você usa para ler coisas
        // System.in é o tipo de dado que o Scanner espera receber
        // nesse caso o Scanner espera receber um dado escrito pelo usuário

        Scanner scanner = new Scanner(System.in);
        System.out.print("Olá, Primeiro digite seu nome: ");
        nome = scanner.nextLine(); // LÊ STRINGS

        // acho que diferente de estruturas sequenciais eu descobri como que faz
        // pra usar %d, %s, %f, e tal no java usando o printf que nem no C
        System.out.printf("Bem vindo %s!\nPor favor digite a sua idade: ", nome);
        String idadeStr = scanner.nextLine();

        // SEI QUE N É PRA USAR ISSO NAS ESTRUTURAS CONDICIONAIS JÁ QUE EU TÔ VENDO
        // JUSTAMENTE ESTRUTURAS CONDICIONAIS... MAS O QUE EU PODERIA FAZER?
        // EU SOU PROGRAMADOR, SEU USAR AS COISAS BASICAS QUE TODA LINGUAGEM TEM
        try {
            idade = Integer.parseInt(idadeStr);
        } catch (Exception e) {
            System.out.println("Ops! é necessário que você digite somente número, feche o programa e tente novamente!");
            System.out.println("(ARE U TAPADO?)");

            scanner.close();
            return;
        }

        if (idade >= 18) {
            System.out.println("Parabéns, você é maior de idade, poderá continuar a utilizar o programa!");
        } else {
            System.out.println("Ops! é necessário que você seja de maior para continuar a usar o programa!");

            scanner.close();
            return;
        }

        System.out.print("Agora, por favor, digite sua série ");
        System.out.print("(caso você esteja no ensino médio, digite M-X onde X é o ano que você está cursando):");
        String serieStr = scanner.nextLine();

        try {
            // olha só que legal usar arrays
            String[] serieStrSplitted = serieStr.split("-");

            // AO COMPARAR STRINGS EM JAVA POR FAVOR UTILIZE O INFELIZ DO .EQUALS()
            if (serieStrSplitted[0].equals("M")) {
                estaNoEnsinoMedio = true;
            }

            serie = Integer.parseInt(serieStrSplitted[1]);
        } catch (Exception e) {
            System.out.println("Ops! algum erro desconhecido ocorreu!");
            System.out.println("Por favor reinicie o programa e tente novamente!");
            System.out.println("ERROR: " + e.getMessage());

            scanner.close();
            return;
        }

        if (!estaNoEnsinoMedio && serie < 5) {
            System.out.println("você está no ENSINO FUNDAMENTAL 1");
        } else if (serie > 5 && serie < 9) {
            System.out.println("você está no ENSINO FUNDAMENTAL 2");
        } else {
            System.out.println("você está no ENSINO MÉDIO!");
        }
        scanner.close();

    }
}
