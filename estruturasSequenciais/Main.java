
// O package segue como o nome da pasta, caso ela estivesse
// dentro de package > com > EstruturasSequencias
// você o definiria como package.com.EstruturasSequenciais
package estruturasSequenciais;

import java.util.Scanner;

// =================================================================================================
// CALCULADORA SIMPLES!
// =================================================================================================

public class Main {

    public static void main(String[] args) {

        // o Scanner espera como um parâmetro uma entrada de dados, que pode ser um
        // buffer,
        // um TEXTO (sim um texto), um arquivo ou uma entrada do usuário pelo console

        // nesse caso vamos usar o System.in, para que o nosso scanner leia a entrada de
        // dados que o usuário inserir
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira um número: ");
        double numero1 = scanner.nextDouble();

        System.out.println("Insira mais um número: ");
        double numero2 = scanner.nextDouble();

        double soma = numero1 + numero2;
        double subtracao = numero1 - numero2;
        double multiplicacao = numero1 * numero2;
        double divisao = numero1 / numero2;
        double resto = numero1 % numero2;

        // infelizmente pelo que eu pesquisei só da pra formatar as casas decimais dessa
        // forma
        // :'(

        System.out.println("SOMA: " + String.format("%.2f", soma));
        System.out.println("SUBTRAÇÃO: " + String.format("%.2f", subtracao));
        System.out.println("MULTIPLICAÇÃO: " + String.format("%.2f", multiplicacao));
        System.out.println("DIVISÃO: " + String.format("%.2f", divisao));
        System.out.println("RESTO: " + String.format("%.2f", resto));

        scanner.close();
    }
}