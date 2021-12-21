
public class testnombre {

	public static void main(String[] args) {
		Nombresej2 l1=new Nombresej2 (3);
		
		int a=l1.agregarnombre("Raul");
		if (a==1) {
			System.out.println("nombre agregado a la lista");
		}
		a=l1.agregarnombre("Eva");
		if (a==1) {
			System.out.println("nombre agregado a la lista");
		}
		a=l1.agregarnombre("Raul");
		if (a==1) {
			System.out.println("nombre agregado a la lista");
		}
		a=l1.agregarnombre("Pedro");
		if (a==1) {
			System.out.println("nombre agregado a la lista");
		}
		a=l1.agregarnombre("Lucas");
		if (a==1) {
			System.out.println("nombre agregado a la lista");
		}
		l1.verlistaactual();
		l1.eliminar("Pedro");
		System.out.println();
		l1.verlistaactual();
		
		l1.agregarnombre("Pedro");
		l1.verlistaactual();
	}

}
