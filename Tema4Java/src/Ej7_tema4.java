/*Programa que pide el número de calificaciones a introducir, y una nota de corte.
 * A continuación se introducirán las calificaciones, para finalmente 
 * indicar cuántas calificaciones han igualado o superado la nota de corte.*/
import java.util.Scanner;
public class Ej7_tema4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		double calificacion=0;
		double notacorte=0;
		int contador=0;
		
		System.out.println("Cuantos alumnos vas a calificar");
		int numcalificacion=sc.nextInt();
		
		System.out.println("Cual es la nota de corte");
		notacorte=sc.nextDouble();
		
		for(int i=0;i<numcalificacion;i++){
			System.out.println("Introduce una nota");
			calificacion=sc.nextDouble();
			if(calificacion>=notacorte) {
				contador++;
			}
		}
		System.out.println("De "+numcalificacion+" alumnos "+contador+" han superado la nota de corte");
		sc.close();
	}

}
