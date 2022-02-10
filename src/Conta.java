public abstract class Conta implements IConta{

    private static int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    protected int agencia;
    protected int numero;
    protected double saldo;

    protected double emprestimo;
    protected double juros = 1.4;

    protected double lmtcartao;


    public Conta() {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
    }


    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getEmprestimo() {
        return emprestimo;
    }

    public double getJuros() {
        return juros;
    }

    public double getLmtcartao() {
        return lmtcartao;
    }

    @Override
    public void sacar(double valor) {
        this.saldo = saldo - valor;
    }

    @Override
    public void depositar(double valor) {
        this.saldo = saldo + valor;
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
            this.sacar(valor);
            contaDestino.depositar(valor);
    }
    @Override
    public void emprestimo(double emprestimo) {
        this.emprestimo = emprestimo * juros;
    }


    protected void ImprimirInfosConta() {
        System.out.println(String.format("Agencia: %d", this.agencia));
        System.out.println(String.format("Numero: %d", this.numero));
        System.out.println(String.format("Emprestimo do Banco: %.2f", this.emprestimo));
        System.out.println(String.format("Limite de Cartao: %.2f", this.lmtcartao = saldo * 0.68));
        System.out.println(String.format("Saldo Atual: %.2f", this.saldo));
    }

}
