public class TesteConta {
    public static void main(String[] args) {
        ContaCorrente contaCorrente = new ContaCorrente("1641", "01009988-4");
        contaCorrente.depositar(300);
        try{
            contaCorrente.sacar(250.00);
        }catch(SaldoInsuficienteException error) {
            System.out.println("Ex: " + error.getMessage());
        }
        System.out.println("R$"+contaCorrente.getSaldo());

    }
}







