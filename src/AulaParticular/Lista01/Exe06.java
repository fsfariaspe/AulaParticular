package AulaParticular.Lista01;

import java.util.Scanner;

/*6.	Faça um algoritmo em Java que Ler dois valores (considere que não
        serão lidos valores iguais) e escrever o maior deles.*/
public class Exe06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro número");
        double num1 = sc.nextDouble();
        System.out.println("Digite o segundo número");
        double num2 = sc.nextDouble();

        while(num1 == num2) {
            System.out.println("Não são permitidos números iguais, por favor digite outro número");
            num2 = sc.nextDouble();
        }

        if (num1 > num2) {
            System.out.println(num1);
        }else {
            System.out.println(num2);
        }


        sc.close();
    }
}
