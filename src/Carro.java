public class Carro extends Vehiculos {

    private int numPuertas;

    public Carro() {
    }

    public Carro(String modelo, String marca, int year, double precioBase, int numPuertas) {
        super(modelo, marca, year, precioBase);
        this.numPuertas = numPuertas;
    }

    public int getNumPuertas() {
        return numPuertas;
    }

    public void setNumPuertas(int numPuertas) {
        this.numPuertas = numPuertas;
    }

    @Override
    public String toString() {
        return
                " Numero de Puertas: " + numPuertas +
                " Marca: " + marca +
                " Modelo: " + modelo +
                " Año: " + year +
                " Precio Base: " + precioBase;
    }
}
