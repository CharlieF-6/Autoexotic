import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        List<Vehiculos> listaVehiculos = new ArrayList<>();

        Scanner teclado = new Scanner(System.in);
        int opc;

        do {
            System.out.println("""
                    Gestion de vehiculos
            1.Agregar carros
            2.Agregar motocicletas
            3.Mostrar informacion
            4.Salir""");

            System.out.println("Ingrese una opcion: ");
            opc = teclado.nextInt();

            switch (opc){
                case 1 ->{
                    String modelo,marca;
                    int year, numPuertas;
                    double precioBase;
                    System.out.println("Agregar datos del carro ");
                    teclado.nextLine();
                    System.out.println("Ingrese la marca del carro: ");
                    marca = teclado.nextLine();
                    System.out.println("Ingrese el modelo del carro: ");
                    modelo = teclado.nextLine();
                    System.out.println("Ingrese la cantidad de puertas del carro:");
                    numPuertas = teclado.nextInt();
                    System.out.println("Ingrese el año del carro:");
                    year = teclado.nextInt();
                    System.out.println("Ingrese el precio base del carro: ");
                    precioBase = teclado.nextDouble();
                    listaVehiculos.add(new Carro(marca,modelo, year, precioBase, numPuertas));
                    System.out.println("¡Carro registrado con exito!");
                }

                case 2->{
                    String modelo,marca;
                    int year, cilindraje;
                    double precioBase;
                    System.out.println("Agregar datos de la motocicleta ");
                    teclado.nextLine();
                    System.out.println("Ingrese la marca de la motocicleta: ");
                    marca = teclado.nextLine();
                    System.out.println("Ingrese el modelo de la motocicleta: ");
                    modelo = teclado.nextLine();
                    System.out.println("Ingrese el cilindraje de la motocicleta:");
                    cilindraje = teclado.nextInt();
                    System.out.println("Ingrese el año de la motocicleta:");
                    year = teclado.nextInt();
                    System.out.println("Ingrese el precio base de la motocicleta: ");
                    precioBase = teclado.nextDouble();
                    listaVehiculos.add(new Motocicleta(marca,modelo, year, precioBase, cilindraje));
                    System.out.println("¡Motocicleta registrada con exito!");
                }

                case 3->{
                    System.out.println("""
                    Mostrando informacion
            1.Datos de los carros registrados
            2.Datos de las motos registradas
            3.Datos de todos los vehiculos
            """);

                    System.out.println("Ingrese una opcion: ");
                    opc = teclado.nextInt();
                    switch (opc) {
                        case 1 -> {
                            for (Vehiculos e : listaVehiculos) {
                                if (e instanceof Carro) {
                                    System.out.println(e.toString());
                                }
                            }
                        }
                        case 2 -> {
                            for (Vehiculos e : listaVehiculos) {
                                if (e instanceof Motocicleta) {
                                    System.out.println(e.toString());
                                }
                            }
                        }

                        case 3 -> {
                            for (Vehiculos e : listaVehiculos) {
                                System.out.println(e.toString());
                            }
                        }
                        default -> System.out.println("Opcion no valida");
                    }

                }
                case 4 -> System.out.println("Saliendo del programa");

                default -> System.out.println("Opcion no valida");
            }
        }while (opc !=4);

    }
}