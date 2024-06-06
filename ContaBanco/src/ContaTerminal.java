import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o número da conta: ");
        int numero = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Por favor, digite o número da agência: ");
        String agencia = scanner.nextLine();

        System.out.println("Por favor digite o nome do cliente: "); 
        String nomeCliente = scanner.nextLine();

        System.out.println("Por favor digite o saldo: ");
        double saldo = scanner.nextDouble();

        String mensagem = "Olá " + nomeCliente + "! Obrigado por criar uma conta em nosso banco, sua agência é "+ agencia+  ", conta " + numero + " e seu saldo de R$ " + saldo +" ja está disponivel para saque."; 

        System.out.println(mensagem);

        scanner.close(); 

    }
}
