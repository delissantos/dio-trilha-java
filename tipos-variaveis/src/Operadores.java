public class Operadores {
    
    public static void main(String[] args) {
        String nomeUm = "delis";
        String nomeDois = "delis";

        System.out.println(nomeUm == nomeDois);


        int numero1 =1;
        int numero2 =2;

        boolean simNao = numero1 == numero2;
        if (numero1 < numero2){
            System.out.println("a nossa condição eh verdadeira");
        }

        System.out.println("numeroUm é igual numeroDois? " + simNao);

        simNao = numero1 != numero2; 

        System.out.println("eai" + simNao);

        simNao = numero1 > numero2;

        System.out.println("oii" + simNao);
    }
}
