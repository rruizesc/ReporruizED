import java.util.Scanner;

public class StringEJJ {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduce un nombre");
		String nombre=sc.next();
		int numero=6;
		
//		for (int i=0;i<nombre.length();i++) {	
//		System.out.println(nombre.charAt(i));
//		}
		
		for (int i=0;i<4;i++) {	
		System.out.println(nombre.charAt(i));
		
		
//        int i;
//        char letra;
//        System.out.println("Pulsa S para parar.");
//        for (i = 0; (letra=sc.next().charAt(0)) != 'S'; i++) 
//        {
//            System.out.println("Pass #" + i);
//       }
//        System.out.println("Has salido del bucle");
		}
		sc.close();
	}

}
