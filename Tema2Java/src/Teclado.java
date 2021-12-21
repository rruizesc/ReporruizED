import java.util.Scanner;

public class Teclado {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		System.out.println("Teclea una cadena de caracteres");
		
		//variable int
/*		int v=teclado.nextInt();
		int t=v++;
		System.out.println(t);
		System.out.println(v);*/
		
		//variable double
/*		double var1=teclado.nextDouble();
		System.out.println(var1);*/
		
		//variable boolean
/*		boolean b=teclado.nextBoolean();
		if (b) {
			int l=(int)(Math.random()*10);
			System.out.println(l);
		}else {
			System.out.println("La clase ha terminado");
		}*/
		
		//variable string
/*		String cad=teclado.next();
		System.out.println(cad);*/
		
		String cad=teclado.nextLine();
		System.out.println(cad);
		teclado.close();	
	}

}
