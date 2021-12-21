import java.util.Scanner;

public class charenbucle {
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int i;
        char letra;
        String nombre="gfdhyfffff";
        System.out.println(nombre);
        System.out.println(nombre.replace('f','h'));
        System.out.println("Pulsa S para parar.");
        for (i = 0; (letra=sc.next().charAt(0)) != 'S'; i++) 
        {
            System.out.println("Pass #" + i);
        }
        System.out.println("Has salido del bucle");
        sc.close();
    }
}