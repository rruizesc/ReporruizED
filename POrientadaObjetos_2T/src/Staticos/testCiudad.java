package Staticos;

import java.util.Scanner;

public class testCiudad {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		Ciudad c1=new Ciudad("Madrid",40,1);
		System.out.println("Eliga la opcion 1. \n 2. \n 3.");
		String a=sc.next();
		switch (a) {	
		case "1":{
			System.out.println("La temp minima del año es: "+c1.minimaGeneral());
			break;
		}
		case "2":{
			System.out.println("La temp maxima del año es: "+c1.maximaGeneral());
			break;
		}
		case "3": {
			System.out.println(c1.getMaximas());
		}
		}	
sc.close();
	}

}
