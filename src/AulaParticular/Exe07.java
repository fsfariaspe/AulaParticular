package AulaParticular;

import java.util.Scanner;

/*7.	Faça um algoritmo em Java que ler 3 números fracionários do teclado (lembrar de colocar
        as informações do que é para ser feito para o usuário), ao final informar ao usuário se o
        primeiro é maior do que a soma dos dois últimos.*/
public class Exe07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro número fracionado");
        double num1 = sc.nextDouble();
        System.out.println("Digite o segundo número fracionado");
        double num2 = sc.nextDouble();
        System.out.println("Digite o terceiro número fracionado");
        double num3 = sc.nextDouble();

        if(num1 > (num2 + num3)) {
            System.out.println("O primeiro número é maior do que a soma dos dois últimos");
        } else {
            System.out.println("O primeiro número NÃO é maior do que a soma dos dois últimos");
        }


        sc.close();
    }
}
