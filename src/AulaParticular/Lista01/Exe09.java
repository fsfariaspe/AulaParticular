package AulaParticular.Lista01;


import java.util.Scanner;

/*9.	Faça um algoritmo em Java que ler um número inteiro do teclado (lembrar de colocar
        as informações do que é para ser feito para o usuário), este número representa uma nota.
        Mostre o conceito da nota. A= 90 à 100; B= 80 à 89; C= 70 à 79; D = 60 à 69; E= 0 à 59.
        Verificar se a nota é válida.
*/
public class Exe09 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double nota;

        do {
            System.out.println("Digite uma nota entre 0 e 100");
            nota = ler.nextDouble();

        } while (nota < 0 || nota > 100);


        if (nota >= 90 & nota <= 100) {
            System.out.println("O conceito da sua nota é: A");
        } else if (nota >= 80 & nota <= 89) {
            System.out.println("O conceito da sua nota é: B");
        } else if (nota >= 70 & nota <= 79) {
            System.out.println("O conceito da sua nota é: C");
        } else if (nota >= 60 & nota <= 69) {
            System.out.println("O conceito da sua nota é: D");
        } else if (nota >= 0 & nota <= 59) {
            System.out.println("O conceito da sua nota é: E");
        }
        System.out.println("FIM!");

        ler.close();
    }
}
