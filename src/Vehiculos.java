public class Vehiculos {
    protected String marca, modelo;
    protected int year;
    protected double precioBase;

    public Vehiculos() {
    }

    public Vehiculos(String marca, String modelo, int year, double precioBase) {
        this.marca = marca;
        this.modelo = modelo;
        this.year = year;
        this.precioBase = precioBase;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    @Override
    public String toString() {
        return "Vehiculos " +
                "Marca: " + marca +
                "Modelo= " + modelo +
                "Año= " + year +
                "Precio Base=" + precioBase;

    }


}
