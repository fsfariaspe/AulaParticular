package AulaParticular;

/*13.	Faça um algoritmo em Java que imprima a soma de 1 até 1000.*/
public class Exe13 {
    public static void main(String[] args) {
        int num = 0;
        int soma;
        while (num < 1000) {
            soma = num + 1;
            System.out.println(soma);
            num++;
        }
        System.out.println("Fim!");
    }
}
