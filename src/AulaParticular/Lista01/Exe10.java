package AulaParticular.Lista01;

/*10.	Faça um algoritmo em Java que informa todos os números de 1000 a 1999
        que quando divididos por 11 obtemos resto = 5.*/
public class Exe10 {
    public static void main(String[] args) {

        int num = 1000;
        while (num < 2000){
            if (num % 11 == 5){
                System.out.println(num);
            }
            num++;
        }
        System.out.println("FIM!");

    }
}
