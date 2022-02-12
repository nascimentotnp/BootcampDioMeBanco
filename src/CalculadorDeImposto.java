public class CalculadorDeImposto {

    private double impostoFederal;

    public void calculadora(Tributos tributos){
        double valor = tributos.getValorImposto();
        this.impostoFederal += valor;

        }

    public double getImpostoFederal(){
        return impostoFederal;
    }

}
