package academy.devdojo.maratonajava.introducao;

// Peça ao usuário para digitar um número entre 1 e 10.
//Use um laço for para imprimir a tabuada desse número de 1 a 10.

import java.util.Scanner;

public class ExerciciosLacosDeRepeticao03 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número inteiro de 1 a 10: ");
        int numero = scan.nextInt();
        int resultado;

        if (numero <= 10 && numero >= 1) {
            for (int i = 1; i <= 10; i++) {
                resultado = numero * i;
                System.out.println(+numero + "*" + i + "=" + resultado);
            }
        } else {
                System.out.println("Número inválido!");
            }
        }
}