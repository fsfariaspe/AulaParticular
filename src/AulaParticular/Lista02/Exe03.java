package AulaParticular.Lista02;

import java.util.Scanner;

/*3.	Faça um algoritmo em Java que Ler dois valores (considere que não serão
        lidos valores iguais) e escrever o maior deles, usar função.*/
public class Exe03 {
    public static void main(String[] args) {
            int num1 = 0;
            int num2 = 0;

        do {
            System.out.println("Digite o 1º número");
            num1 = ler(num1);
            System.out.println("Digite o 2º número");
            num2 = ler(num2);
            if (num1 > num2 & num1 != num2) {
                System.out.println("O número " + num1 + " é maior.");
                break;
            } else if (num1 < num2 & num1 != num2) {
                System.out.println("O número " + num2 + " é maior.");
                break;
            }
            System.out.println("Não é permitido digitar números iguais");

        }while (num1 == num2);
        System.out.println("Fim!");
    }
    public static int ler (int i) {
        Scanner sc = new Scanner(System.in);
        i = sc.nextInt();
        return i;
    }
}
