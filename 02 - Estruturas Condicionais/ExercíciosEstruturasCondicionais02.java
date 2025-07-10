package academy.devdojo.maratonajava.introducao;

//Sistema informa se o número digitado pelo usuário é par ou ímpar

import java.util.Scanner;


public class ExercíciosEstruturasCondicionais02 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double numero;

        System.out.println("Digite um número qualquer:");
        numero = scan.nextDouble();

        if (numero == 0) {
            System.out.println("O número: " + numero + " é neutro");
        } else if (numero % 2 == 0) {
            System.out.println("O número: " + numero + " é par");
        } else {
            System.out.println("O número: "+numero+" é impar");
        }
        scan.close();
    }
}
