public class Main {
    public static void main(String[] args){
        Pessoa pessoal = new Pessoa("Tiago", 20, 1.75);
        pessoal.exibirInfo();

        ContaBancaria conta = new ContaBancaria("Tiago", 24001623);
        conta.depositar(1500);
        conta.sacar(200);
        conta.exibirExtrato();
        System.out.println("Saldo atual: R$" + conta.consultarSaldo());
        
    }
} 
    

