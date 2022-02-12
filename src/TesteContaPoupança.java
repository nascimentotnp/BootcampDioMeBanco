public class TesteContaPoupança {
    public static void main(String[] args) {

        ContaPoupança contaPoupança = new ContaPoupança("1641", "12345-5");
        contaPoupança.depositar(200);
        try {
            contaPoupança.sacar(250.00);
        } catch (SaldoInsuficienteException ex) {
            System.out.println("Ex: " + ex.getMessage());
        }
        System.out.println("R$"+contaPoupança.getSaldo());
    }
}

