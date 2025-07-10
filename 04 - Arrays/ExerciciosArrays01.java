package academy.devdojo.maratonajava.introducao;

import java.util.Scanner;

public class ExerciciosArrays01 {
    public static void main(String[] args) {
         // Crie um array de 5 números inteiros e imprima todos os valores usando um for
        Scanner scan = new Scanner(System.in);
        int array[] = new int[4];
        array = new int[]{1, 2, 3, 4, 5};

        for (int num : array) {
            System.out.println(num);
        }
    }
}
