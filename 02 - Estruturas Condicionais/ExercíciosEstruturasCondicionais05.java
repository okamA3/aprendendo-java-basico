package academy.devdojo.maratonajava.introducao;

/* Peça ao usuário para digitar três números inteiros, representando os lados de um triângulo.
        Seu programa deve:

        ✅ Etapa 1: Verificar se os lados formam um triângulo
        Um triângulo é válido se a soma de dois lados for sempre maior que o terceiro.
        Isso deve ser verdade para as três combinações.

        ✅ Etapa 2: Determinar o tipo de triângulo:
        Equilátero → os 3 lados são iguais

        Isósceles → 2 lados iguais

        Escaleno → todos diferentes

        ❌ Se não formar triângulo:
        Exiba: "Os lados não formam um triângulo válido."

 */

import java.util.Scanner;


public class ExercíciosEstruturasCondicionais05 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int lado1, lado2, lado3;
        boolean condicao = true;
        String tipoTrinagulo = "null";

        System.out.println("Digite a medida do lado 1 do triângulo: ");
        lado1 = scan.nextInt();

        System.out.println("Digite a medida do lado 2 do triângulo: ");
        lado2 = scan.nextInt();

        System.out.println("Digite a medida do lado 3 do triângulo: ");
        lado3 = scan.nextInt();

        int somaLado1e2 = lado1 + lado2;
        int somaLado1e3 = lado1 + lado3;
        int somaLado3e2 = lado3 + lado2;


        if (somaLado1e2 <= lado3 || somaLado3e2 <= lado1 || somaLado1e3 <= lado2) {
            condicao = false;
        }
        if (lado1 == lado2 && lado2 == lado3) {
            tipoTrinagulo = "Equilátero";
        } else if (lado1 == lado2 || lado2 == lado3) {
            tipoTrinagulo = "Isósceles";
        } else {
            tipoTrinagulo = "Escaleno";
        }

        if (condicao) {
            System.out.println("Você formou um triângulo: "+tipoTrinagulo);
        } else {
            System.out.println("Os lados não formam um triângulo válido.");
        }

    }
}

