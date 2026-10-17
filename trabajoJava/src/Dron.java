import java.util.Scanner;

public class Dron {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("que por centaje de bateria tiene el dron?");
        int bat = teclado.nextInt();
        int cont = 1;
        if (bat >7) {
            bat = bat-7;
            while (bat >= 7) {
                System.out.println("minuto: " + cont + " -> " + bat + "% ");
                cont++;
                bat = bat-7;
            }
            System.out.println("minuto: " + cont + " -> " + bat + "% ");
            System.out.println("Se agoto la bateria");
        } else {
            System.out.println("bateria insuficiente");
        }
    }
}
