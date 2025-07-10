package academy.devdojo.maratonajava.introducao;

// Sistema informa se o número digitado pelo usuário é positivo, negativo ou neutro.

import java.util.Scanner;


public class ExercíciosEstruturasCondicionais {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double numero;

        System.out.println("Digite um número qualquer: ");
        numero = scan.nextDouble();

        if (numero < 0) {
            System.out.println("O número: "+numero+" é negativo.");
        } else if(numero == 0){
            System.out.println("O número: "+numero+" é neutro.");
        }else{
            System.out.println("O número: "+numero+" é positivo.");
        }
        scan.close();
    }
}
