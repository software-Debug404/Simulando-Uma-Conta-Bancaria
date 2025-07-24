import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o número da Agência (Ex: 067-8):");
        String agencia = scanner.nextLine();

        System.out.println("Agora, digite o número da Conta (Ex: 1021):");
        int numero = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Digite o seu nome completo:");
        String nomeCliente = scanner.nextLine();

        System.out.println("Digite o saldo inicial:");
        double saldo = scanner.nextDouble();
        System.out.println();
        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo  %.2f já está disponível para saque.", nomeCliente, agencia, numero, saldo
        );

        scanner.close();
    }
}