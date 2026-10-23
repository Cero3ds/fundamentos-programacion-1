import java.util.Scanner;

public class estacionamiento {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int autosd = 0;
        int numAutos = 0;
        double total = 0;

        System.out.println("Sistema de estacionamiento");
        System.out.println("ingresa la cantidad de horas estacionado (coloca 0 para terminar)");

        for (int horas = teclado.nextInt(); horas !=0;) {

            if (horas <0){
                System.out.println("Error");
                System.out.println("no se permiten numeros negativos");
            } else {
                double cobro = horas * 15;

                if (horas > 5) {
                    cobro -= 10.0;
                    autosd++;
                    System.out.println("descuento de $10 aplicado ");
                }
                numAutos++;
                total+=cobro;
                System.out.println("tu total a pagar es de: "+ cobro);
            }
            System.out.println("ingresa el total de horas estacionado (coloca 0 para terminar )");
            horas = teclado.nextInt();
        }

        System.out.println("Resumen del dia");
        System.out.println("total de automoviles atendidos: " + numAutos);
        System.out.println("total recaudado: " + total);
        System.out.println("autos totales con descuento: " + autosd);
        double promedio = total / numAutos;
        System.out.println("promedio de pago por auto :" + promedio);
    }
}
