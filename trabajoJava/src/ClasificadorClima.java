import java.util.Scanner;

public class ClasificadorClima {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("ingresa el numero de grados");
        int Grados = teclado.nextInt();
        if (Grados < 10){
          System.out.println("Frio Extremo");
        }else
            if(Grados >= 10 &&  Grados <= 20){
          System.out.println("Clima Fresco");      
            } else if (Grados>=21 && Grados<=30){
          System.out.println("clima agradable");
            } else if (Grados > 30){
                System.out.println("calor extremo");
            }
    }
}
