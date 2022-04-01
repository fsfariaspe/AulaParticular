package AulaParticular;


import java.util.Scanner;

/*3.	Faça um algoritmo em Java que ler o salário mensal atual de um funcionário e o
        percentual de reajuste. Calcular e escrever o valor do novo salário.*/
public class Exe03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o salário mensal");
        double salario = sc.nextDouble();
        System.out.println("Digite o percentual de reajuste");
        double reajuste = sc.nextDouble();

        double resultado = salario + ((reajuste /100) * salario);
        System.out.println("O novo salário é: R$ " + resultado );


        sc.close();
    }
}
