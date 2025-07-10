package academy.devdojo.maratonajava.introducao;

    // Solicite 5 notas do usuário, armazene em um array e calcule a média.

import java.util.Scanner;

public class ExerciciosArrays06 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double[] notas = new double[5];
        double total = 0;

        for (int i = 0; i < notas.length; i++) {
            System.out.println("Digite a nota do aluno: ");
            notas[i] = scan.nextDouble();
            total += notas[i];
        }
        System.out.println("A média do aluno é igual a: "+total/notas.length);
    }
}
