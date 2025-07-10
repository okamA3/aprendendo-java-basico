package academy.devdojo.maratonajava.introducao;

/*Peça ao usuário uma nota entre 0 e 10, e classifique:
>= 7: Aprovado
>= 5 e < 7: Recuperação
< 5: Reprovado
Fora do intervalo: "Nota inválida"
 */

import java.util.Scanner;


public class ExercíciosEstruturasCondicionais04 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double nota, resultado;
        String situacao = null;
        boolean condicao = true;

        System.out.println("Digite a nota do aluno: ");
        nota = scan.nextDouble();

        if (nota > 10) {
            System.out.println("Nota inválida");
            condicao = false;
        } else if (nota >= 7) {
            situacao = "Aprovado!";
        } else if (nota >= 5 && nota < 7) {
            situacao = "em Recuperação";
        } else if (nota < 5) {
            situacao = "Reprovado";
        } else if (nota < 0) {
            System.out.println("Nota inválida");
            condicao = false;
        }
        if(condicao) {
            resultado = Math.round(nota*10.0)/10.0;
            System.out.println("Nota final: "+resultado);
            System.out.println("O aluno está "+situacao);
        }
    }
}
