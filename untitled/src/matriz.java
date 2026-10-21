import java.util.Scanner;

public class matriz {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double[][] matriz = new double[2][2];

        System.out.println("Ingresa los valores de la matriz 2x2:");


        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = teclado.nextDouble();
            }
        }

        double determinante = (matriz[0][0] * matriz[1][1]) - (matriz[0][1] * matriz[1][0]);

        System.out.println("\nLa matriz ingresada es:");
        System.out.println("| " + matriz[0][0] + "   " + matriz[0][1] + " |");
        System.out.println("| " + matriz[1][0] + "   " + matriz[1][1] + " |");

        // Mostrar el resultado final
        System.out.println("\nEl determinante de la matriz es: " + determinante);

        teclado.close();
    }
}
