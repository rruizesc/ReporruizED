import java.util.Scanner;

public class Ej5 {

	public static void main(String[] args) {
		System.out.println("Escribe un numero el 1 o el 2");
		System.out.println("1 para calcular el area del rectangulo");
		System.out.println("2 para calcula el area del cuadrado");
		Scanner enter=new Scanner(System.in);
		int n=enter.nextInt();
		if(n==1) {
			System.out.println("Introduzca el valor de la base del rectangulo");
			int b=enter.nextInt();
			System.out.println("Introduzca el valor de la altura del rectangulo");
			int h=enter.nextInt();
			int t=b*h;
			System.out.println("El area de tu rectangulo es: "+t);
		}else {
			if(n==2){
		
			System.out.println("Introduzca el valor del lado");
			int l=enter.nextInt();
			int t=l*l;
			System.out.println("El area de tu cuadrado es "+t);
			}else {
			System.out.println("no has puesto ni un 1 ni un 2");
			}
		}
		System.out.println("Fin de programa");
		enter.close();
	}
}
