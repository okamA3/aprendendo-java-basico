package academy.devdojo.maratonajava.introducao;
 /*       Crie um array de 5 números inteiros, com valores fixos (ex: {10, 20, 30, 40, 50}),
        e calcule a soma total de todos os elementos do array.
        Exiba o resultado final no console.

  */


public class ExerciciosArrays02 {
    public static void main(String[] args) {

        int array[] = {10, 20, 30, 40, 50};
        int soma = 0;

        for (int i = 0; i < array.length; i++) {
            soma += array[i];
        }
        System.out.println("A soma de todos os valores do array é igual a: "+soma);
    }
}
