public class ContaBancaria {

    private final String titular;
    private double saldo;
    private final int numeroConta;
    // Métodos: depositar, sacar, consultarSaldo

    public ContaBancaria(String titular, int numeroConta){
        this.titular = titular;
        this.numeroConta = numeroConta;
        this.saldo = 0.0;
    }

    public void depositar(double valor){
        if (valor <= 0){
            System.out.println("Valor inválido para depósito.");
        } else {
            saldo += valor;
            System.out.println("Depósito de R$" + valor + " realizado com sucesso.");
        }
    }

    public void sacar(double valor){
        if (valor <= 0){
            System.out.println("Valor inválido para saque.");
        } else if (valor > saldo){
            System.out.println("Saldo insuficiente para saque.");
        }else { 
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado com sucesso");
        }
    }

    public double consultarSaldo(){
        return saldo;
    }

    public String getTitular(){
        return titular;
    }

    public int getNumeroConta (){
        return numeroConta;
    }

    public void exibirExtrato(){
        System.out.println("Extrato da conta:");
        System.out.println("Titular: " + titular);
        System.out.println("Número da conta: " + numeroConta);
        System.out.println("Saldo atual: R$" + saldo);
    }

}
/*Funcionalidades:

Depositar valor (não pode ser negativo)
Sacar valor (verificar se há saldo)
Consultar saldo
Exibir extrato */
