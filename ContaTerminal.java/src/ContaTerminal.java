import java.util.Scanner;

public class ContaTerminal {

    private String numero;
    private String agencia;
    private String nomeCliente;
    private double saldo;

    public ContaTerminal(String numero, String agencia, String nomeCliente, double saldo) {
        this.numero = numero;
        this.agencia = agencia;
        this.nomeCliente = nomeCliente;
        this.saldo = saldo;
    }

    public void consultarSaldo(double valor) {
        saldo += valor;
        System.out.println("Seu saldo atual é: R$" + saldo);
    }

    public void sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque realizado com sucesso! Seu saldo atual é: R$" + saldo);
        } else {
            System.out.println("Saldo insuficiente.Este saque não pode ser realizado!");
        }
    }

    public void depositar(double valor) {
        saldo += valor;
        System.out.println("Depósito realizado com sucesso. Seu saldo atual é: R$" + saldo);
    }


    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem Vindo ao Banco Java");

        System.out.println("Digite o número da conta: ");
        String numero = scanner.next();
        System.out.println("Digite a agência: ");
        String agencia = scanner.next();
        System.out.println("Digite o nome do cliente: ");
        String nomeCliente = scanner.next();
        System.out.println("Digite o saldo inicial: ");
        double saldoInicial = scanner.nextDouble();     
        ContaTerminal conta = new ContaTerminal(numero, agencia, nomeCliente, saldoInicial);


        System.out.println("Escolha uma opção para continuar: ");   
        System.out.println("1 - Consultar saldo");
        System.out.println("2 - Fazer um depósito");
        System.out.println("3 - Fazer um saque");
        
        int opcao = scanner.nextInt();
        while (( opcao > 0 ) && ( opcao < 4 )){
            if (opcao == 1){
                conta.consultarSaldo();
            } else if (opcao == 2){
                double valor = scanner.nextDouble();
                conta.depositar(double valor);
            }  else {
                double valor = scanner.nextDouble();
                conta.sacar(double valor);
            }
        }
                     
    scanner.close();
    }
    
}
