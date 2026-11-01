import java.util.Scanner;

public class EnvioDePaquetes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("SISTEMA DE GENERACIÓN DE ETIQUETAS");


        System.out.println("    Datos del Paquete   ");
        System.out.print("Ingrese el número de guía: ");
        String guia = scanner.nextLine();
        System.out.print("Ingrese la ciudad de destino: ");
        String destino = scanner.nextLine();
        System.out.print("Ingrese el peso del paquete (en kg): ");
        double peso = scanner.nextDouble();


        mostrarEtiqueta(guia, destino, peso);

    }

    public static void mostrarEtiqueta(String numeroGuia, String destino, double peso) {
        System.out.println("                                    ");
        System.out.println("         ETIQUETA DE ENVÍO         ");
        System.out.println("                                      ");
        System.out.println("Número de guía : " + numeroGuia);
        System.out.println("Destino        : " + destino);
        System.out.println("Peso           : " + peso + " kg");

    }
}