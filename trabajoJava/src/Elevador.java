import java.util.Scanner;

public class Elevador {
    public static void main(String[] args) {
        Scanner teclado =  new Scanner(System.in);

        System.out.println("En que piso estamos?");
        int pisoActual = teclado.nextInt();
        System.out.println("A que piso deseas ir?");
        int pisoDeseado = teclado.nextInt();

if (pisoActual == 0 || pisoDeseado ==0) {
    System.out.println("EL PISO CERO NO ES ACCESIBLE");
 }else
        if (pisoActual < 0 || pisoDeseado <0) {
            System.out.println("EL PISO -CERO NO ES ACCESIBLE");
        }

else
{ if(pisoDeseado<11)
  {
    if (pisoActual > pisoDeseado)
     {   pisoActual = pisoActual-1;
        while (pisoActual >= pisoDeseado)
          {
            System.out.println(pisoActual);
              pisoActual--;
          }
          System.out.println("bajamos con exito");
     }
       else
           if (pisoActual < pisoDeseado  )
           {
               pisoActual = pisoActual+1;
              while (pisoActual <= pisoDeseado)
              {
                System.out.println(pisoActual);
                  pisoActual++;
              }
                 System.out.println("subimos con exito");
           }
  }
  else
  {
      System.out.println("No es posible subir mas alla del piso 10");}
    if (pisoActual==pisoDeseado){System.out.println("no puedes ir al piso en el que ya estas");}


}
    }
}
