package academy.devdojo.maratonajava.introducao;

/*Crie um programa que:

        Peça ao usuário uma senha (ex: "1234")

        O usuário terá no máximo 3 tentativas

        Se acertar, exiba: "Acesso liberado!"

        Se errar todas, exiba: "Acesso bloqueado."

 */
import java.util.Objects;
import java.util.Scanner;


public class ExerciciosEstruturasCondiconais04 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String senha = "1234";
        String tentativa = "";
        int numTentativas = 0 ;

        System.out.println("Seja, bem vindo! Para acessar, por favor, digite sua senha: ");

        do {
            tentativa = scan.next();
            if (Objects.equals(tentativa, senha)) {
                System.out.println("Senha correta! Acesso liberado!");
                break;
            } else {
                System.out.println("Senha incorreta, tente novamente!");
                numTentativas++;
            }
        } while (numTentativas < 3);
        System.out.println("Acesso bloqueado!");
    }
}
