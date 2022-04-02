package AulaParticular;

import java.util.Scanner;

/*16.	Faça um algoritmo em Java que ler o nome de 2 times e o número de gols marcados na
        partida (para cada time). Escrever o nome do vencedor. Caso não haja vencedor deverá
        ser impressa a palavra EMPATE.*/
public class Exe16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome do primeiro time");
        String time1 =  sc.next();
        System.out.println("Digite o número de gols do primeiro time");
        double gol1 =  sc.nextDouble();

        System.out.println("Digite o nome do segundo time");
        String time2 =  sc.next();
        System.out.println("Digite o número de gols do segundo time");
        double gol2 =  sc.nextDouble();

        System.out.println("Número de gols do " + time1 + " : " + gol1 + " gol(s)");
        System.out.println("Número de gols do " + time2 + " : " + gol2 + " gol(s)");


        if (gol1 > gol2) {
            System.out.println("O vencedor é: " + time1 + " com " + gol1 + " gols!");
        } else if (gol2 > gol1) {
            System.out.println("O vencedor é: " + time2 + " com " + gol2 + " gols!");
        } else {
            System.out.println("Não houve vencedores, o resultado foi EMPATE");
        }

        sc.close();
    }
}
