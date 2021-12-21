import java.util.Scanner;

public class Ej8 {

	public static void main(String[] args) {
		System.out.println("Escribe tres numeros enteros");
		Scanner enter=new Scanner(System.in);
		int n1=enter.nextInt();
		int n2=enter.nextInt();
		int n3=enter.nextInt();
		
		if(n1>n2 && n1>n3 && n2>n3) {
			System.out.println("ordenados de mayor a menor "+n1+" "+n2+" "+n3);
		}else {
			if(n1>n2 && n1>n3 && n3>n2) {
				System.out.println("ordenados de mayor a menor "+n1+" "+n3+" "+n2);
			}else {
				if(n2>n1 && n2>n3 && n1>n3) {
					System.out.println("ordenados de mayor a menor "+n2+" "+n1+" "+n3);
				}else {
					if(n2>n1 && n2>n3 && n3>n1) {
						System.out.println("ordenados de mayor a menor "+n2+" "+n3+" "+n1);
					}else {
						if(n3>n1 && n3>n2 && n2>n1) {
							System.out.println("ordenados de mayor a menor "+n3+" "+n2+" "+n1);
						}else {
							if(n3>=n1 && n3>=n2 && n1>=n2) {
								System.out.println("ordenados de mayor a menor "+n3+" "+n1+" "+n2);
							}
						}
					}
				}
			}
		}
			
		enter.close();
	}
}