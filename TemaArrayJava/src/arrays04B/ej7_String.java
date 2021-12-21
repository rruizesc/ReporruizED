package arrays04B;

import java.util.Iterator;
import java.util.Scanner;

public class ej7_String {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		String cad=sc.nextLine();
		
		int[] vocales=new int [5];   //1:a   2:e   3:i    4:o    5:u
		
		for (int i=0; i<cad.length();i++) {
			switch (cad.charAt(i)){
			case 'a':
				vocales[0]++;
				break;
			case 'e':
				vocales[1]++;
				break;
			case 'i':
				vocales[2]++;
				break;
			case 'o':
				vocales[3]++;
				break;
			case 'u':
				vocales[4]++;
				break;
			}
		}
		for (int i = 0; i < vocales.length; i++) {
			if (vocales[i]==0)
				System.out.println("la frase no tiene todas las vocales"+"\t"+cad);
			break;
		}
		sc.close();	
		}
	}

