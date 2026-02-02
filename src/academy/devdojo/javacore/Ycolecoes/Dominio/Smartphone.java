package academy.devdojo.javacore.Ycolecoes.Dominio;

public class Smartphone {
    private String serialNumber;
    private String marca;

    //reflexivo: x.equals(x) tem q ser true para tudo que for diferente de null
    //simétrico: para x e y diferentes de null, se x.equals(y) == true logo, y.equals(x) == true
    //transitividade: para x,y,z diferentes de null, se x.equal(y) == true e x.equals(z) ==  true logo, y.equal(z) == treu
    // Consistente: x.equals(x) sewmpre retorna true se x for diferente de null
    //para x diferente de null, x.equals(null) tem q retornar false.

    @Override
    public boolean equals(Object obj) {
       if (obj == null) return false;
        if (this == obj ) return true;
        if(this.getClass() != obj.getClass()) return false;
        Smartphone smartphone = (Smartphone)obj;
        return serialNumber != null && serialNumber.equals(smartphone.serialNumber);
    }

    // se x.equals(y) == true, y.hashCode() == x.hashCode()
    // y.hashCode() == x.hashCode() não necessariamente o equasl de y.equals(x) tem q ser true
    //w.equals(y) == false
    //y.hahsCode() != x.hashCode() x.equal(Y) devera ser false


    @Override
    public int hashCode() {
        return serialNumber == null ? 0 : this.serialNumber.hashCode();
    }

    public Smartphone(String serialNumber, String marca) {
        this.serialNumber = serialNumber;
        this.marca = marca;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}
