package aula;

import java.util.Scanner;

public class Condicionais {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int aux = 110;
        if(aux >= 100){
            System.out.println("Esse valor é menor ou igual a 100");
        }else if(aux < 50){
            System.out.println("Esse valor está menor que a metade de 100");

        }else{
            System.out.println("Esse valor está maior que a metade de 100");

        }

        int valor = 11;
        if(valor >= 10 && valor <= 100){
            System.out.println("estou no  valor entre 10 e 100");
        }
        int codigo;
        System.out.println("Digite o codigo : ");
        codigo = sc.nextInt();
        // switch ( vai verificar varios valores )
        switch (codigo){
            case 1 :
                System.out.println("vc digitou 1!!");
            break;
            case 2:
                System.out.println("vc digitou 2!!");
            break;
            default:
                System.out.println("esse valor é inexistente!");
            break;
        }
}
}
