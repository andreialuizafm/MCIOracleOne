public class ContaBancaria{
    private int numeroConta;
    private double saldo;
    private String titular;

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }
    public double adicionaSaldo(double deposito){
        saldo = saldo + deposito;
        return saldo;
    }

    @Override
    public String toString() {
        return "ContaBancaria{" +
                "\n" + "numeroConta=" + numeroConta +
                "\n" + "saldo=" + saldo +
                "\n" + "titular='" + titular + '\'' +
                '}';
    }

    public static void main(String[] args){
        ContaBancaria conta = new ContaBancaria();
        conta.numeroConta = 1234;
        conta.titular = "Alex Alves";
        conta.saldo = 1000.00;
        conta.adicionaSaldo(1500.00);
        System.out.println(conta);
    }
}

