import java.util.Scanner;

public class While_3ej {

	public static void main(String[] args) {
		Scanner teclado=new Scanner (System.in);
		int max=20,novalid=0,contador=0,num;
		while(contador<12) {
			System.out.println("introduce un numero");
			num=teclado.nextInt();
			if(num>19 && num<41) {
				contador++;
				if(num>max) {
					max=num;
				}
			}else {
				System.out.println("Este numero esta fuera del rango");
				novalid++;
			}
		}
		System.out.println("El numero maximo introducido es: "+max);
		System.out.println("El contador de fallos es: "+novalid);
		teclado.close();
	}

}