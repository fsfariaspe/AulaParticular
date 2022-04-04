package AulaParticular;

import java.util.Scanner;

/*11.	Faça um algoritmo em Java que ler um número e mostra o fatorial. */
public class Exe11 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite um número inteiro para calcular o fatorial: ");
        int num = ler.nextInt();
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

        ler.close();
    }
}
