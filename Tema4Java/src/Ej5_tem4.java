/*Programa que lee unidades y precios de productos, para al final indicar
 *  el total de la factura. Si el importe supera los 1000€ se aplicará un 
 *  descuento del 5%. El programa finaliza al introducir una uniddes 0.*/
import java.util.Scanner;

public class Ej5_tem4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int total=1000;
		double descuento=(5/100.0);
		int unidades, precio;
		double suma,resultado=0;
		do {
			System.out.println("cuanto cuesta este produto?");
			precio=sc.nextInt();
			System.out.println("cuantas unidades has comprado?");
			unidades=sc.nextInt();
		}while(unidades<0);
		suma=unidades*precio;		
		if(suma>total) {
			resultado=suma-(suma*descuento);
			System.out.println("tienes q pagar "+resultado);
		}else {
			System.out.println("pagas "+suma);;
		}
		sc.close();
	}	
}
