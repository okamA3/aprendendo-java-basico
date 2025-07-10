package academy.devdojo.maratonajava.introducao;

/*
        Crie um array de 5 números inteiros com valores fixos (ex: {10, 20, 30, 40, 50})
        Imprima os elementos do último até o primeiro, ou seja, do índice 4 até o 0.
 */

public class ExerciciosArrays04 {
    public static void main(String[] args) {
        int array[] = new int[5];
        array = new int[]{1, 2, 3, 4, 5};

        for (int i = array.length; i >= 0 ; i--) {
            System.out.println(array[i-1]);
        }
    }
}
