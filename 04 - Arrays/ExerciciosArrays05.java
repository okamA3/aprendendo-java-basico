package academy.devdojo.maratonajava.introducao;

  /*      Crie um array com 10 números inteiros (fixos ou digitados pelo usuário).
        Exiba:
        A soma dos números pares
        A quantidade de pares no array
   */

import java.util.Scanner;

public class ExerciciosArrays05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] array = new int[10];
        int soma = 0;
        int contador = 0;

        for (int i = 0; i < array.length; i++) {
            System.out.println("Digite o valor do vetor: ");
            array[i] = scan.nextInt();
            }
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                soma += array[i];
                contador++;
            }
        }
        System.out.println("A quantidade de vetores pares é igual a: "+contador);
        System.out.println("A soma total dos vetores pares é igual a: "+soma);
        }
    }

