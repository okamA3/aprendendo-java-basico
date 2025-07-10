package academy.devdojo.maratonajava.introducao;

// Some todos os números de 1 até 100 e imprima o resultado final na tela.


public class ExerciciosLacosDeRepeticao02 {
    public static void main(String[] args) {

        int contador = 1;
        int soma = 0;

        while (contador <= 100) {
            soma += contador;
            contador++;
        }
        System.out.println("A soma total dos números é igual a: "+soma);
    }
}
