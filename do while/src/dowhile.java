import java.util.Scanner;

public class dowhile {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int opc = 0;
        int Puntos = 100;

        do {
            System.out.println("Menu");
            System.out.println("1.Ganar 20 puntos");
            System.out.println("2.Gastar 15 puntos");
            System.out.println("3.Consultar puntos");
            System.out.println("4.Salir");

            if (teclado.hasNextInt()){
                opc = teclado.nextInt();

                switch (opc){
                    case 1:
                        Puntos += 20;
                        System.out.println("Sumaste 20 puntos");
                        break;
                    case 2:
                        if (Puntos >= 15){
                            Puntos -= 15;
                            System.out.println("Gastaste 15 puntos");
                        }else {
                            System.out.println("No tienes suficientes puntos para gastar ");
                        }
                        break;
                    case 3:
                        System.out.println("Puntos Totales: "+ Puntos);
                        break;
                    case 4:
                        System.out.println("Hasta luego");
                        break;
                    default:
                        System.out.println("Opcion invalida ");
                        System.out.println("Escoje una opcion del 1-4");
                }

            }else {
                System.out.println("Opcion no valida");
                teclado.next();
            }

        } while (opc != 4);
        System.out.println("Puntos Finales");
        System.out.println(Puntos);

    }
}
