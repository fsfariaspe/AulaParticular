package AulaParticular;

import java.util.Scanner;

/* 1.	Faça um algoritmo em Java que ler um valor (do teclado) e escrever (na tela) o seu antecessor. */
public class Exe01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número");
        double num1 = sc.nextDouble();


        System.out.println("O número digitado foi " + num1 + " e o seu antecessor é: " + --num1 + " e " + (2+num1));





        sc.close();
    }

}
