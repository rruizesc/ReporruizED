
public class Ejboolean {

	public static void main(String[] args) {
		int a=(int)(Math.random()*10);
		int b=(int)(Math.random()*10);
		System.out.println("a="+a);
		System.out.println("b="+b);
//ambos ejemplos funcionan igual
//ejemplo 1
/*		boolean sw=true;
		if (a>b) sw=true;
		else sw=false;
		
		if (sw) {
			System.out.println("a es mayor que b");
		}
		else {
			System.out.println("b es menor o igual que a");
		}*/
// ejemplo 2
		boolean sw=(a>b);
		if (sw) {
			System.out.println("a es mayor que b");
		}
		else { 
			System.out.println("b es menor o igual que a");
		}
	}
}
