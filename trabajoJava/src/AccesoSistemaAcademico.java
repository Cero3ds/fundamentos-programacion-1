import java.util.Scanner;

public class AccesoSistemaAcademico {
    public static void main(String[] args) {
     Scanner teclado = new Scanner(System.in);

     System.out.println("dame tu calificacion");
     double calificacion = teclado.nextDouble();

     System.out.println("con numeros del 1 al 100 dame el porcentaje de asistencia ");
     int Asistencia = teclado.nextInt();

     if(calificacion < 7.0){
         System.out.println("Reprobado por calificacion ");
     } else if (calificacion >= 7.0 && Asistencia < 80) {
         System.out.println("Reprobado por faltas");
     } else if (calificacion >= 7.0 && Asistencia >= 80) {
         System.out.println("Aprobado regular");
     }
    }
}
