package aula;

public class VariaveisEmJava {
    public static void main(String [] args){
        // As variaveis em java são tipadas
       // inteiro
        int numeroInt ;
        numeroInt = 10;
        System.out.println(numeroInt);

        // tipo float
        float numeroFloat = 10.2f ;
        System.out.println(numeroFloat);

        //bom para usar se nao tem restricao de memoria
        double numeroFloatDouble = 10.66; // nao precisa do f na frente
        System.out.println(numeroFloatDouble);

        // char - UM caractere
        char letra =  'a';
        System.out.println(letra);

        // string
        String cpf = "089.294.044-13";
        System.out.println(cpf);

        // bool
        boolean condicaoBool = 1 == 2;
        if (condicaoBool){
            System.out.println("Essa condicao é:" + condicaoBool);
        }else{
            System.out.println("valores diferentes");
        }
    }
}
