package exercicios;

import javax.swing.text.Style;

public class ExercicioAula01 {
    public static void main(String[] args) {
        // imprima todos os num de 150 a 300
        int valor = 150;
        while(valor <= 300){
            System.out.println(valor);
            valor +=  1;
        }

        //todos os multiplos de 3 entre 1 e 100
        valor =1;
        do{
            int multiplo = valor %  3;
            if(multiplo == 0){
                System.out.println(valor);
            }
            valor +=1;

        }while (valor <100);

        // imprimir fatoriais de 1 a 10
        int Fat = 0;
        int valorFat = 5;
        int somatorio = 1;
        while(valorFat >=   0){


            if( Fat ==0){
                System.out.println("O valor do fat de 0 é : "+1);
                Fat += 1;

            }else{

                somatorio = somatorio * Fat;
                System.out.println("O valor do Fat de "+ Fat+" é " +somatorio);
                Fat += 1;

            }
            valorFat -=1;

            }


        // fibbionacci (questao 5 )
        int fibbionacci = 0;
        int anterior = 1;
        while(fibbionacci <= 100){

            System.out.printf(fibbionacci+", ");
            fibbionacci += anterior;
            anterior = fibbionacci - anterior;
        }

        System.out.println("");

        // dado um x
        int x = 13;
        while(x > 1 ){
            if(x%2==0){
                x = x/2;
            }else{
                x = x*3 + 1;
            }

            if(x ==1){
                System.out.printf(x+"E");

            }else{
                System.out.printf(x+"->");

            }
        }

        // for encadeado
        int Linha = 1;
        while(Linha < 5){
            int Coluna = 1;
            System.out.println("");

            while(Coluna <= Linha){
                int valorTotal = Coluna * Linha;
                System.out.printf(valorTotal + " ");
                Coluna += 1;
            }
            Linha += 1;
        }

        // fibbonacci com duas variaveis (questao extra)


        // calcular área do retangulo
        double base, altura, area;
        base = 10.2;
        altura = 20;

        area = base * altura;

        System.out.printf("\n A area é : "+ area);


        }
    }

