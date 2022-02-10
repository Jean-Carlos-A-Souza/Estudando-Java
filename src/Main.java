public class Main {
    public static void main(String[] args){
        Conta cc = new ContaCorrente();
        Conta cp = new ContaPoupanca();

        cc.depositar(15000);

        cc.transferir(8000, cp);

        cc.emprestimo(1500);

        cp.emprestimo(2500);

        cc.imprimirExtrato();
        cp.imprimirExtrato();
    }
}
