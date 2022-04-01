package AulaParticular;

import java.util.Scanner;

/*5.	Faça um algoritmo em Java que ler um valor e escrever se é positivo
        ou negativo (considere o valor zero como positivo).*/
public class Exe05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número");
        double num1 = sc.nextDouble();

        if (num1 >= 0) {
            System.out.println("É positivo!");
        } else {
            System.out.println("É negativo!");
        }


        sc.close();

    }
}
