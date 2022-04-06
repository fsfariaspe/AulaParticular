package AulaParticular.Lista01;

import java.security.SecureRandom;
import java.util.Scanner;

/*18.	Faça um algoritmo em Java que utilize as duas linhas iniciais no método Main() sejam:
        Random rnd = new Random(); //Inicia Aleatório
        int x = rnd.nextInt(100); //Gera um número aleatório (0 – 99)
        Faça um laço de repetição que solicite ao usuário digitar um número (lembrar de colocar
        as informações do que é para ser feito para o usuário). O laço encerra quando o usuário
        acertar o número sorteado. Se o número do usuário for menor que o oculto (sorteado),
        escrever: “MAIOR”, se o número do usuário for maior que o oculto (sorteado), escrever:
        “MENOR”. Ao final deve ser mostrado que acertou e quantas tentativas foram feitas.
*/
public class Exe18 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        SecureRandom srnd = new SecureRandom();
        int x = srnd.nextInt(100);
        int vezes = 0;
        int sorteado;

        do {
            System.out.println("Qual foi o número sorteado?");
            sorteado = ler.nextInt();

            if (sorteado > x) {
                System.out.println("MENOR!" + "\n" + "-------------------");
            } else if (sorteado < x){
                System.out.println("MAIOR!" + "\n" + "-------------------");
            }
            vezes++;
        } while (sorteado != x);
        System.out.println("Você acertou em: " + vezes + " tentativas!");
        System.out.println("Fim!");
    }
}
