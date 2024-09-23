import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Olá, bem-vindo ao FLPBank");

        System.out.println("Por favor, qual o número da sua agência? ");
        int agencia = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha restante após nextInt()

        System.out.println("Por favor, insira o número da sua conta: ");
        String contaCorrente = scanner.nextLine();

        System.out.println("Por favor, insira seu nome completo:");
        String nomeCompleto = scanner.nextLine();

        System.out.println("Qual o saldo esperado para saque?");
        float saldo = scanner.nextFloat();

        System.out.println("Olá " + nomeCompleto + ", obrigado por cadastrar sua conta em nosso banco. Sua agência é a "
                + agencia + ", conta de número " + contaCorrente + " e o saldo R$" + saldo
                + " já está disponível para saque.");
        scanner.close();
    }
}
