package AulaParticular.Lista01;

import java.util.Scanner;


/*2.	Faça um algoritmo em Java que ler 2 números inteiros do teclado (lembrar de colocar as informações
        do que é para ser feito para o usuário) os coloque em variáveis A e B. A seguir (utilizando apenas atribuições
        entre variáveis) troque os seus conteúdos fazendo com que o valor que está em A passe para B e vice-versa.
        Ao final, escrever os valores que ficaram armazenados nas variáveis.*/
public class Exe02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro número inteiro");
        double num1 = sc.nextDouble();
        System.out.println("Digite o segundo número inteiro");
        double num2 = sc.nextDouble();
        double num3 = num2;

        num2 = num1;
        num1 = num3;
        System.out.println(num1);
        System.out.println(num2);


        sc.close();
    }
}
