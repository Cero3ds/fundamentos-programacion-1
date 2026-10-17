public class ejercicioCuatro {
    public static void main(String[] args) {
        System.out.println("hello, Word");
        int a, b, c;
        a = 5;
        b = 0;
        c = 1;
        if (a==0 || b==0 || c==0){
            System.out.println("los numeros deben ser mayor a cero");
    }else
        if (a > b && a > c) {
            System.out.println("El Mayor es:" + a);
        } else if (b > a && b > c) {
            System.out.println("El Mayor es:" + b);
        } else  {
            System.out.println("El Mayor es:" + c);
        }

        int num=1;
        while (num<=5){
            System.out.println(num);
            num++;
        }
        System.out.println(num);

        while (num>0){
            System.out.println("num");
            num--;
        }
    }
    }

