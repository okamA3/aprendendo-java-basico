package academy.devdojo.maratonajava.introducao;

    // Peça 10 números e diga qual o maior e qual o menor.

import java.util.Scanner;

public class ExerciciosArrays07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] vetor = new int[10];
        int menor = 0, maior = 0;

        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Digite um número inteiro: ");
            vetor[i] = scan.nextInt();
            maior = vetor[i];
        }

        for (int i = 9; i > 0; i--) {
            if (maior > vetor[i]) {
                menor = vetor[i];
            } else {
                maior = vetor[i-1];
            }
        }
        System.out.println(maior);
    }
}
