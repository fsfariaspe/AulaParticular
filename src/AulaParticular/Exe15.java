package AulaParticular;

import java.util.Scanner;

/*15.	Faça um algoritmo em Java que ler 3 valores (A, B e C) representando
        as medidas dos lados de um triângulo e escrever se formam ou não um
        triângulo. OBS: para formar um triângulo, o valor de cada lado deve
        ser menor que a soma dos outros 2 lados. */
public class Exe15 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Para formar um triângulo " + " \n" + "Digite o 1º número");
        int a = ler.nextInt();
        System.out.println("Digite o 2º número");
        int b = ler.nextInt();
        System.out.println("Digite o 3º número");
        int c = ler.nextInt();

        if (a < (b + c) & b < (a + c) & c < (a + b)) {
            System.out.println("É um triângulo");
        } else {
            System.out.println("Não é um triângulo");
        }
        System.out.println("Fim!");

        ler.close();
    }
}
