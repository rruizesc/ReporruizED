package arrays04B;

public class Foreach {

	public static void main(String[] args) {
		String[]ciudades= {"Sevilla","Tokio","Berlin"};
		String[][] des={{"Sevilla","Barna","Burgos"},
				{"Paris","Burdeos","Nantes"},
				{"Berlin","Leinchester"}
			};
		for (int i = 0; i < ciudades.length; i++) {
			System.out.print(ciudades[i]+"  ");
		}
		System.out.println();
		//foreach
		for(String ciu:ciudades) {
			System.out.print(ciu+"  ");
		}
		//foreach de un array bidimensional
		System.out.println();
		for(String[] ciuda:des) {
			for(String c:ciuda) {
				System.out.print(c+"  ");
			}
		}
	}

}
