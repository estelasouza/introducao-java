package aula;
// essa é a área para importar arquivos

import java.util.Scanner;  // lib que tira print

// import java.util.*; -> importaria tudo sobre a biblioteca


public class ReceberInformacoes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // como receber o input
        int x ;
        double y;
        String s;

        System.out.println("Digite um numero ");
        x = sc.nextInt(); // so acc valor inteiro
        System.out.println("o numero que vc digitou foi : "+ x);

        y = sc.nextDouble();
        System.out.println("o numero que vc digitou foi : "+ y);

        s = sc.next();
        System.out.println("A string que vc digitou foi : "+s);

    }
}
