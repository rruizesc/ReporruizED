package arrays04B;

import java.util.Scanner;

public class ej5_string {

	public static void main(String[] args) {
//		String cad="estamos en la clase de programacion";
//		Scanner sc=new Scanner (System.in);
//		int posicion;
//		String cad;
//		System.out.println("Introduce una cadena");
//		cad=sc.nextLine();
//		do {
//		posicion=cad.indexOf(" ");
////		System.out.println(posicion);
//
//		if(posicion>-1) {
//			System.out.println(cad.substring(0, posicion));
//			cad=cad.substring(posicion+1);
//		}
//		} while(posicion!=-1);
//		System.out.println(cad);
		
// Version 2
		
		Scanner sc=new Scanner (System.in);
		int posicion;
		String cad;
		System.out.println("Introduce una cadena");
		cad=sc.nextLine();	
		
		String[] trozos=cad.split(" ");
		for (String subcad : trozos) {
			System.out.println(subcad);
		}
		sc.close();
	}

}
