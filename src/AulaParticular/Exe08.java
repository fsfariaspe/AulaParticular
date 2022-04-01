package AulaParticular;

import java.util.Scanner;

/*8.	Faça um algoritmo em Java que ler 3 inteiros do teclado os valores em qualquer
        ordem (lembrar de colocar as informações do que é para ser feito para o usuário),
        ao final mostre ao usuário os valores em ordem crescente e decrescente. */
public class Exe08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro número inteiro");
        double num1 = sc.nextDouble();
        System.out.println("Digite o segundo número inteiro");
        double num2 = sc.nextDouble();
        System.out.println("Digite o terceiro número inteiro");
        double num3 = sc.nextDouble();

        if (num1 > num2 && num2 > num3) {
            System.out.println("Ordem crescente: " + num3 + " - " + num2 + " - " + num1);
            System.out.println("Ordem decrescente: " + num1 + " - " + num2 + " - " + num3);
        } else if (num2 > num1 && num1 > num3) {
            System.out.println("Ordem crescente: " + num3 + " - " + num1 + " - " + num2);
            System.out.println("Ordem decrescente: " + num2 + " - " + num1 + " - " + num3);
        } else if (num3 > num1 && num1 > num2) {
            System.out.println("Ordem crescente: " + num2 + " - " + num1 + " - " + num3);
            System.out.println("Ordem decrescente: " + num3 + " - " + num1 + " - " + num2);
        } else if (num1 > num3 && num3 > num2) {
            System.out.println("Ordem crescente: " + num2 + " - " + num3 + " - " + num1);
            System.out.println("Ordem decrescente: " + num1 + " - " + num3 + " - " + num2);
        } else if (num2 > num3 && num3 > num1) {
            System.out.println("Ordem crescente: " + num1 + " - " + num3 + " - " + num2);
            System.out.println("Ordem decrescente: " + num2 + " - " + num3 + " - " + num1);
        } else if (num3 > num2 && num2 > num1) {
            System.out.println("Ordem crescente: " + num1 + " - " + num2 + " - " + num3);
            System.out.println("Ordem decrescente: " + num3 + " - " + num2 + " - " + num1);
        }

        sc.close();
    }
}
