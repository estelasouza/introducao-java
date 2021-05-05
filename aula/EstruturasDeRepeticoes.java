package aula;

public class EstruturasDeRepeticoes {
    public static void main(String[] args) {

        int valor = 0;
        while(valor < 10){
            System.out.println("ola!!");
            valor += 1;
        }


        int valorTotalFat = 5;
        int fat = valorTotalFat - 1;
        do{

            valorTotalFat = valorTotalFat * fat ;
            fat -=1 ;

        }while (fat > 0 );
        System.out.println("A resposta desse fat é : " + valorTotalFat );


        for(int i = 0; i < 5; i++){
            System.out.println("to no for no print");
        }

        int ContadorFat = 1;
        for(int i=6; i > 0; i--){
            ContadorFat = i * ContadorFat;
        }
        System.out.println("A resposta do fat feito no for é "+ContadorFat);
        // variaveis declaradas dentro de um escopo
        // não sao reconhecidas fora dele

    }
}
