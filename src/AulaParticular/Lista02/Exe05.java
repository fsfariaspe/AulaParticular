package AulaParticular.Lista02;

import java.util.Scanner;

/*5.	Faça um algoritmo em Java que ler um número e mostrar o
        fatorial, o calculo da fatorial deve ser feito em uma função. */
public class Exe05 {
    public static void main(String[] args) {
        int num = 0;

        System.out.println("Digite um número inteiro para calcular o fatorial: ");
        num = ler(num);
        int fat = num;
        System.out.println("Fatorial de: " + num + "!");

        while (num > 1) {
            fat *= num - 1;
            System.out.print(num);
            System.out.print(" * ");
            num--;
        }
        System.out.print("1 = " + fat + "\n");
        System.out.println("Fim");
    }

    public static int ler(int i) {
        Scanner sc = new Scanner(System.in);
        i = sc.nextInt();
        return i;
    }
}
