package academy.devdojo.maratonajava.introducao;

import java.util.Scanner;

public class ExercíciosEstruturasCondicionais06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numero;

        System.out.println("Digite um número inteiro de '1' a '7': ");
        numero = scan.nextInt();

        switch (numero) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda-Feira");
                break;
            case 3:
                System.out.println("Terça-Feira");
                break;
            case 4:
                System.out.println("Quarta-Feira");
                break;
            case 5:
                System.out.println("Quinta-Feira");
                break;
            case 6:
                System.out.println("Sexta-Feira");
                break;
            case 7:
                System.out.println("Sábado");
                break;
            default:
                System.out.println("Dia da semana inválido");
        }
    }
}
