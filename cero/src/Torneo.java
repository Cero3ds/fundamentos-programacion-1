import java.util.Scanner;

public class Torneo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int puntos = 0;
        int puntosTotales = 0;
        int masd = 0;
        int menosde = 0;


        for (int i = 1; i <=7; i++) {
            System.out.println("partida:" + i);
            System.out.println("dime cuantos puntos conseguiste");
            puntos = teclado.nextInt();
            puntosTotales = puntosTotales + puntos;

            if (puntos >= 1000){
                masd++;
            }else {
                menosde++;
            }

        }
        double promedio = puntosTotales / 7;
        System.out.println("Puntos Totales: " + puntosTotales);
        System.out.println("Promedio de puntos: " + promedio );
        System.out.println("Partidas de mas de 1000 puntos: " + masd);
        System.out.println("Partidas de menos de 1000 puntos: " + menosde);
    }
}
