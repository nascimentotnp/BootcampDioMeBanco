public class TesteImposto {

    public static void main(String[] args) {
        ContaCorrente contaCorrente = new ContaCorrente("0001", "15654-0");
        contaCorrente.depositar(3000);
        SeguraoDeVida seguroDeVida = new SeguraoDeVida();


        CalculadorDeImposto imposto = new CalculadorDeImposto();
        imposto.calculadora(contaCorrente);
        imposto.calculadora(seguroDeVida);

        System.out.println("o seu Imposto a ser pago é de R$" + imposto.getImpostoFederal());
    }
}
