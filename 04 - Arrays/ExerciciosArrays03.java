package academy.devdojo.maratonajava.introducao;
/*
        Crie um array com 3 notas do tipo double.
        Calcule a média das notas e imprima o resultado.


 */

import java.util.Scanner;

public class ExerciciosArrays03 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double array[] = new double[3];
        double soma = 0, media = 0;

        for (double i : array) {
            System.out.println("Digite a nota do aluno: ");
            array[(int) i] = scan.nextDouble();
            soma += array[(int) i];
        }
        media = Math.round((soma / array.length) * 10) / 10;

        System.out.println("A média do aluno é: " + media);
    }
}
