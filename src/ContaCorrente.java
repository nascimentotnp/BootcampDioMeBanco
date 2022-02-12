public class ContaCorrente extends Conta implements Tributos {

    public ContaCorrente(String agencia, String numero) {
        super(agencia, numero);

    }

    @Override
    public void sacar(double valor) throws SaldoInsuficienteException{

        if (this.saldo < valor) {

           throw new SaldoInsuficienteException("Saldo insuficiente para essa operação, confira o valor da conta R$"
                    + this.getSaldo() + " O Valor para retirada é de R$" + valor);
        }

        this.saldo -=  valor + 0.25;


        System.out.println("O seu saldo atualizado após o seu Saque é R$" + this.getSaldo());

        System.out.println();

    }


    @Override
    public double getValorImposto() {
        return super.saldo * 0.01;
    }
}





