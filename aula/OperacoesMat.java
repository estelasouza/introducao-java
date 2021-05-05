package aula;

public class OperacoesMat {
    public static void main(String [] args){

        int numero = 5;
        int numero_2 = 15;
        // operações matematicas

        //soma
        int resultado_soma = numero + numero_2;
        System.out.println(resultado_soma);

        //subtracao
        int resultado_subtracao = numero_2 - numero;
        System.out.println(resultado_subtracao);

        // multiplicacao
        int resultado_multiplicacao = numero_2 * numero;
        System.out.println(resultado_multiplicacao);

        // divisao
        int resultado_divisao = resultado_soma / resultado_subtracao;
        System.out.println(resultado_divisao);

        // modulo (resto da divisao)
        int resultado_modulo =resultado_multiplicacao % resultado_divisao ;
        System.out.println(resultado_modulo);

    }
}
