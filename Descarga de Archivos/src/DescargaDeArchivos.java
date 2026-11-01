import java.util.Scanner;

public class DescargaDeArchivos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double peso = -1;
        double velocidadDescarga = 0;

        System.out.println("   Estimador de Tiempo de Descarga    ");

        while (peso < 0) {
            System.out.print("Introduce el tamaño del archivo en MB: ");
            peso = scanner.nextDouble();

            if (peso < 0) {
                System.out.println("Error: El tamaño del archivo no puede ser negativo");
            }
        }

        while (velocidadDescarga <= 0) {
            System.out.print("Introduce la velocidad de descarga en MB/s: ");
            velocidadDescarga = scanner.nextDouble();

            if (velocidadDescarga <= 0) {
                System.out.println("Error: La velocidad de descarga debe ser mayor que cero");
            }
        }

        double tiempoEstimado = calcularTiempo(peso, velocidadDescarga);

        System.out.println("Resumen:");
        System.out.println("Archivo de " + peso + " MB a " + velocidadDescarga + " MB/s: " + tiempoEstimado + " segundos.");

        scanner.close();
    }

    public static double calcularTiempo(double tamano, double velocidad) {
        return tamano / velocidad;
    }
}