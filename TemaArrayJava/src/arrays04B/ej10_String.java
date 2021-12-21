package arrays04B;

import java.util.Scanner;

public class ej10_String {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduce un numero");
		boolean control=true;
		int num=sc.nextInt();
		String cad=String.valueOf(num);
		for (int i = 0, j=cad.length()-1; i <j; i++, j--) {
			if (cad.charAt(i)!=cad.charAt(j)) {
				control=false;
				break;
			}
		}
		if(control) {
			System.out.println("el "+num+" es capicua");
		}else {
			System.out.println("el "+num+" no es capicua");
		}

	}

}
