package AulaParticular.Lista02;

import java.util.Scanner;

/*2.	Faça um algoritmo em Java que ler um valor e em uma função verifica se o número é par ou ímpar.*/
public class Exe02 {
    public static void main(String[] args) {
        System.out.println("Digite um número");
        int num = 0;
        num = ler(num);

        if (num % 2 == 0){
            System.out.println("PAR");
        } else {
            System.out.println("ÍMPAR");
        }
        System.out.println("Fim!");
    }
    public static int ler (int i) {
        Scanner sc = new Scanner(System.in);
        i = sc.nextInt();
        sc.close();
        return i;
    }
}
