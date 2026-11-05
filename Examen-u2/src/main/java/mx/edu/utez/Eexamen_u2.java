package mx.edu.utez;
import java.util.Scanner;

public class Eexamen_u2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int producto = 100;
        int recebcionesE = 0;
        int retirosE = 0;
        int rechazocap = 0;
        int accionest =0;


        while (true){
            System.out.println(" Menu de opciones ");
            System.out.println("1.Recibir");
            System.out.println("2. Retirar");
            System.out.println("3. consultar");
            System.out.print("4.Finalizar");
            int opc = scanner.nextInt();

            switch (opc) {
                case 1:
                    while(true) {
                        System.out.println("dame la cantidad a recibir ");
                        int recibir = scanner.nextInt();
                        if (recibir > 0) {
                            producto = producto + recibir;
                            if (producto <= 100) {

                                System.out.println("la nueva cantidad de existencias es: " + producto);
                                recebcionesE++;
                                if (producto < 30){System.out.println("Inventario bajo");}
                                break;
                            }
                            else {
                                System.out.println("Capacidad excedida");
                                rechazocap++;
                                continue;
                            }
                        } else {
                            System.out.println("la cantidad no puede ser cero o menor que 0 ");
                            continue;
                        }
                    }
                    break;
                case 2:
                    while (true) {
                        System.out.println("dame la cantidad a retirar  ");
                        int retiro = scanner.nextInt();
                        if (retiro > 0) {
                            if (producto > retiro) {
                                producto = producto - retiro;
                                System.out.println("la nueva cantidad de existencias es: " + producto);
                                retirosE++;
                                if (producto < 30){System.out.println("Inventario bajo");}
                                break;
                            } else {
                                System.out.println("Existencias insuficientes");
                                rechazocap++;
                                continue;
                            }
                        }else { System.out.println("la cantidad no puede ser cero o menor que 0 ");
                            continue;
                        }

                    }
                    break;
                case 3:
                    System.out.println("existencias actuales:" + producto);

                    break;
                case 4:
                    System.out.println("Registro de movimientos");
                    System.out.println("recibidos exitosos: " + recebcionesE);
                    System.out.println("retiros exitosos: " + retirosE);
                    System.out.println("rechazos por capacidad: " + rechazocap);
                    accionest= recebcionesE + retirosE + rechazocap;
                    System.out.println("movimientos totales: " + accionest );
                    break;

                default:
                    System.out.println("opcion no valida");
                    break;
            }if (opc ==4){
                break;
            }




        }

    }
}
