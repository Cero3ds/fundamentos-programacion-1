import java.util.Scanner;

public class RentaDeBicicletas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("SISTEMA DE RENTA DE BICICLETAS ");
        System.out.println("1. Bicicleta Urbana:     $40 por hora");
        System.out.println("2. Bicicleta De Montaña: $60 por hora");
        System.out.println("3. Bicicleta Eléctrica:  $90 por hora");
        System.out.print("Ingrese el número del tipo de bicicleta: ");
        int opcbicicleta = scanner.nextInt();

        double tarifa = 0.0;
        String TipoB = "";
        boolean opcionValida = true;

        switch (opcbicicleta) {
            case 1:
                tarifa = 40.0;
                TipoB = "Urbana";
                break;
            case 2:
                tarifa = 60.0;
                TipoB = "Montaña";
                break;
            case 3:
                tarifa = 90.0;
                TipoB = "Eléctrica";
                break;
            default:
                opcionValida = false;
                break;
        }

        if (opcionValida) {
            System.out.print("Cuantas horas la rentaras?: ");
            int horas = scanner.nextInt();

            if (horas > 0) {
                System.out.print("cuentas con  membresía? (true o false): ");
                boolean tieneMembresia = scanner.nextBoolean();

                double subtotal = tarifa * horas;
                double descuento = 0.0;

                if (tieneMembresia) {
                    descuento = subtotal * 0.20;
                }

                double total = subtotal - descuento;

                System.out.println("Tipo de bicicleta: " + TipoB);
                System.out.println("Subtotal: $" + subtotal);
                System.out.println("Descuento: $" + descuento);
                System.out.println("Total a pagar: $" + total);

            } else {
                System.out.println("Error: La cantidad de horas debe ser mayor que cero.");
            }
        } else {
            System.out.println("Opción no válida");
        }

        scanner.close();
    }
}

