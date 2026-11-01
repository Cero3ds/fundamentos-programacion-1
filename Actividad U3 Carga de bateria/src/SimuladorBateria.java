import java.util.Scanner;

public class SimuladorBateria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        System.out.println("--- Simulador de Carga de Batería ---");


        while (continuar) {
            System.out.print("\nIntroduce el porcentaje inicial de la batería (0-100): ");
            int porcentajeInicial = scanner.nextInt();


            if (porcentajeInicial < 0 || porcentajeInicial > 100) {
                System.out.println("Error: El porcentaje debe estar entre 0 y 100.");
            } else {
                int minutos = calcularMinutos(porcentajeInicial);
                System.out.println("Batería inicial de " + porcentajeInicial + "%: " + minutos + " minutos.");
            }

            System.out.print("\n¿Deseas realizar otra simulación? (1 = Sí, 0 = No): ");
            int opcion = scanner.nextInt();

            if (opcion == 0) {
                continuar = false;
            }
        }

        System.out.println("Carga simulación. ¡Hasta luego!");
        scanner.close();
    }

    public static int calcularMinutos(int porcentaje) {
        int minutos = 0;

        while (porcentaje < 100) {
            porcentaje += 8;
            minutos++;

            if (porcentaje > 100) {
                porcentaje = 100;
            }
        }


        return minutos;
    }
}