package AulaParticular.Lista01;

import java.util.Scanner;

/*4.	Faça um algoritmo em Java que ler um valor e escrever a mensagem É MAIOR QUE 10! se
        o valor lido for maior que 10, caso contrário escrever NÃO É MAIOR QUE 10! */
public class Exe04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número");
        double num1 = sc.nextDouble();

        if (num1 > 10){
            System.out.println("É MAIOR QUE 10!");
        } else {
            System.out.println("NÃO É MAIOR QUE 10!");
        }


        sc.close();
    }
}
