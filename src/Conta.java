

public abstract class Conta {

    protected double saldo;
    private String agencia;
    private String numero;
    private Cliente titular;
    private static int total = 0;

    public Conta(String agencia, String numero){
        //Conta.total++;
        //System.out.println("O total de contas é " + Conta.total);
        this.agencia = agencia;
        this.numero = numero;
        System.out.println("Parabéns, seja bem-vindo ao ByteBank, sua conta criada é a "
                + this.numero + " na agência "+ this.agencia);
    }

    public void depositar(double valor) {
        this.saldo = this.saldo + valor;
        System.out.println("O seu saldo atualizado após depósito é R$" + this.getSaldo());
    }

    public abstract void sacar(double valor);

    public boolean transferir(double valor, Conta destino) {
        if(this.saldo >= valor) {
            destino.depositar(valor);
            this.saldo -= valor;
            System.out.println("O seu saldo atualizado após transferência é R$" + this.getSaldo());
            return true;
        } else {
            System.out.println("Saldo insuficiente para essa operação, confira o valor desejado ");
            return false;
        }
    }

    public double getSaldo(){
        return this.saldo;
    }

    public String getNumero(){
        return this.numero;
    }

    public void setNumero(String numero){
        if(numero == " ") {
            System.out.println("A conta não pode ser vazia");
            return;
        }
        this.numero = numero;
    }

    public String getAgencia(){
        return this.agencia;
    }

    public void setAgencia(String agencia){
       if(agencia == "") {
           System.out.println("O número da agência não pode ser vazio");
           return;
       }
       this.agencia = agencia;
    }

    public void setTitular(Cliente titular){
        this.titular = titular;
    }

    public Cliente getTitular(){
        return this.titular;
    }

    public static int getTotal(){
        return Conta.total;
    }

}