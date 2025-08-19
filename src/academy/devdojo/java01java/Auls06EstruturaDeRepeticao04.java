package academy.devdojo.java01java;

public class Auls06EstruturaDeRepeticao04 {
    //dao o valor de um carro, descupra em quanats vezes ele pode ser parcelado.
    //condição valor da parcerla >=1000
    public static void main(String[] args) {
        double valorTotal = 30000;
        for (int parcela = 1; parcela <= valorTotal; parcela++) {
            double valorParcela = valorTotal / parcela;
            if (valorParcela < 1000) {
                break;
            }
            System.out.println("parcela " + parcela + "R$ " + valorParcela);
        }
    }
}
