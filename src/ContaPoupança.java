public class ContaPoupança extends Conta {

    public ContaPoupança(String agencia, String numero) {
        super(agencia, numero);
    }

    @Override
    public void sacar(double valor) throws SaldoInsuficienteException{
        if (this.saldo < valor) {

            throw new SaldoInsuficienteException("Saldo insuficiente para essa operação, confira o valor da conta R$"
                    + this.getSaldo() + " O Valor para retirada é de R$" + valor);
        }

            this.saldo -=  valor;
            System.out.println("O seu saldo atualizado após o seu Saque é R$" + this.getSaldo());

            System.out.println();

        }
    }




