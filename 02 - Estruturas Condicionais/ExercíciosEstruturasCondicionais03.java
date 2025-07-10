package academy.devdojo.maratonajava.introducao;

/*Construir uma calculadora que receba dois números decimais e um
operador matemático digitado pelo usuário (+, -, *, /)
e realize o cálculo com base nesse operador.
 */

import java.util.Scanner;

public class ExercíciosEstruturasCondicionais03 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double num1, num2, resultado = 0;
        String sinal;

        System.out.println("Digite um número qualquer: ");
        num1 = scan.nextDouble();

        System.out.println("Digite a opreção desejada, ADIÇÃO(+), SUBTRAÇÃO(-), MULTIPLICAÇÃO(*) ou DIVISÃO(/): ");
        sinal = scan.next();

        System.out.println("Digite outro número qualquer: ");
        num2 = scan.nextDouble();

        if (sinal.equals("+") || sinal.equals("-") || sinal.equals("*") || sinal.equals("/")) {
            if (sinal.equals("+")) {
                resultado = num1 + num2;
            } else if (sinal.equals("-")) {
                resultado = num1 - num2;
            } else if (sinal.equals("*")) {
                resultado = num1 * num2;
            } else if (sinal.equals("/")) {
                if (num2 == 0) {
                    System.out.println("Não é possível dividir por 0");
                } else {
                    resultado = num1 / num2;
                }
            }
            System.out.println("O resultado de "+num1+" "+sinal+" "+num2+" é igual a: "+resultado+".");

        } else {
            System.out.println("Sinal inválido");
        }


        
        scan.close();





    }
}
