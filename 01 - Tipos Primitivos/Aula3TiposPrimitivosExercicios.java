package academy.devdojo.maratonajava.introducao;

import java.util.Scanner;

public class Aula3TiposPrimitivosExercicios {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double soma, subtracao, multiplicacao, divisao;

        System.out.println("Digite um número qualquer: ");
        double num1 = scan.nextDouble();

        System.out.println("Digite outro número qualquer: ");
        double num2 = scan.nextDouble();

        soma = num2+num1;
        subtracao = num2-num1;
        multiplicacao = num2*num1;
        divisao = num2/num1;

        System.out.println("Soma: "+soma);
        System.out.println("Subtração: "+subtracao);
        System.out.println("Multiplicação: "+multiplicacao);
        System.out.println("Divisão: "+divisao);

    }

}
