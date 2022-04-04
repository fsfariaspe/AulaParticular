package AulaParticular;

/*14.	Faça um algoritmo em Java que imprima todos os múltiplos de 3, entre 1 e 100.*/
public class Exe14 {
    public static void main(String[] args) {
        int num = 1;
        while (num <= 100) {
            if (num % 3 == 0) {
                System.out.println(num);
            }
            num++;
        }
        System.out.println("Fim!");
    }
}
