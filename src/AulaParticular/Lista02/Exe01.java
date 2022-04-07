package AulaParticular.Lista02;

import java.util.Scanner;

/*1.	Faça um algoritmo em Java que ler um valor (do teclado) e
        escrever (na tela) o seu antecessor, usando função.*/
public class Exe01 {
    public static void main(String[] args) {

        int num = 0;
        System.out.println("Digite um número: ");
        num = ler(num);
        int ant = num - 1;

        System.out.println("O antecessor de " + num + " é " + ant + "\n" + "Fim!");

    }
    public static int ler (int i) {
        Scanner sc = new Scanner(System.in);
        i = sc.nextInt();
        sc.close();
        return i;
    }

}
