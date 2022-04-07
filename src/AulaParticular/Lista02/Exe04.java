package AulaParticular.Lista02;

import java.util.Scanner;

/*4.	Faça um algoritmo em Java que ler um número inteiro do teclado
        (lembrar de colocar as informações do que é para ser feito para o usuário),
        este número representa uma nota.
        Mostre o conceito da nota. A= 90 à 100; B= 80 à 89; C= 70 à 79; D = 60 à 69; E= 0 à 59.
        Verificar se a nota é válida, o conceito deve ser verificado em uma função.
*/
public class Exe04 {
    public static void main(String[] args) {
        int nota = 0;

        do {
            System.out.println("Digite uma nota entre 0 e 100");
            nota = ler(nota);

            if (nota >= 90 & nota < 101) {
                System.out.println("O conceito da sua nota é: A");
            } else if (nota >= 80 & nota < 90) {
                System.out.println("O conceito da sua nota é: B");
            } else if (nota >= 70 & nota < 80) {
                System.out.println("O conceito da sua nota é: C");
            } else if (nota >= 60 & nota <= 69) {
                System.out.println("O conceito da sua nota é: D");
            } else if (nota >= 0 & nota <= 59) {
                System.out.println("O conceito da sua nota é: E");
            }
        } while (nota < 0 || nota > 100);
        System.out.println("FIM!");
    }

    public static int ler(int i) {
        Scanner sc = new Scanner(System.in);
        i = sc.nextInt();
        return i;
    }
}
