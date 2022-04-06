package AulaParticular.Lista01;

/*20.	Faça um algoritmo em Java que escreva um algoritmo para imprimir
        os 10 primeiros números inteiros maiores que 100. */
public class Exe20 {
    public static void main(String[] args) {
        int num = 100;
        int cont = 101;
        while (cont <= (num + 10)){
            System.out.println(cont);
            cont++;
        }
        System.out.println("Fim!");
    }
}
