import java.util.Scanner;

public class RentaCamaras {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double tarifa = 0;
        int horas = 0;

        System.out.println("    Sistema de Alquiler de Cámaras    ");


        while (true) {
            System.out.print("Introduce la tarifa de alquiler por hora: $");
            tarifa = scanner.nextDouble();
            if (tarifa > 0) {
                break;
            }
            System.out.println("Error: La tarifa debe ser mayor que cero");
        }


        while (true) {
            System.out.print("Introduce la cantidad de horas de uso: ");
            horas = scanner.nextInt();
            if (horas > 0) {
                break;
            }
            System.out.println("Error: Las horas deben ser mayores que cero");
        }

        double total = calcularRenta(tarifa, horas);

        mostrarComprobante(total);

        scanner.close();
    }

    public static double calcularRenta(double tarifa, int horas) {
        return tarifa * horas;
    }

    public static void mostrarComprobante(double total) {
        System.out.println("");
        System.out.println("    Comprobante de Renta    ");
        System.out.printf("Total a pagar: $%.2f", total);

    }
}