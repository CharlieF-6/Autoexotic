public class Motocicleta extends Vehiculos {

    private int cilindraje;

    public Motocicleta() {
    }

    public Motocicleta(String marca, String modelo, int year, double precioBase, int cilindraje) {
        super(modelo, marca, year, precioBase);
        this.cilindraje = cilindraje;
    }

    public int getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(int cilindraje) {
        this.cilindraje = cilindraje;
    }

    @Override
    public String toString() {
        return
                " Cilindraje: " + cilindraje +
                " Marca: " + marca +
                " Modelo: " + modelo +
                " Año: " + year +
                " Precio Base: " + precioBase;
    }
}
