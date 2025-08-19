package academy.devdojo.java01java;

public class Auls06EstruturaDeRepeticao05 {
    //dao o valor de um carro, descupra em quanats vezes ele pode ser parcelado.
    //condição valor da parcerla >=1000
    public static void main(String[] args) {
        double valorTotal = 30000;
        for (int parcela = (int) valorTotal; parcela >= 1; parcela--) {
            double valorParcela = valorTotal / parcela;
            if(valorParcela <1000){
                continue;
            }
            System.out.println("parcela " + parcela + "R$ " + valorParcela);
        }
    }
}
