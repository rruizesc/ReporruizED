package arrays04B;

import java.util.Scanner;

public class ej8_String {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		String cadena=sc.nextLine().toUpperCase();
		
		String[] trozos=cadena.split(" ");
		String salida="";
		for (String subcad : trozos) {
			salida+=subcad;
		}
		System.out.println(cadena.toLowerCase());
		System.out.println(salida);
sc.close();
	}

}
