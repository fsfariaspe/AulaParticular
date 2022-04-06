package AulaParticular.Lista01;

import java.util.Scanner;

/*17.	Faça um algoritmo em Java que ler um número inteiro (lembrar de colocar as informações
        do que é para ser feito para o usuário), ao final, imprime um triângulo de asteriscos
        com o tamanho definido pelo número que foi lido. Exemplo:
        Digite o tamanho para seu triângulo: 3
        *
        **
        ***
*/
public class Exe17 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite o tamanho do seu triângulo");
        int num = ler.nextInt();
        String padrao = "";


        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }

        ler.close();
        System.out.println("Fim!");
    }
}

//        Resolução de Deivson
//        for (int i = 1; i <= num; i++){
//            padrao+= "*";
//            System.out.println(padrao);
//        }
