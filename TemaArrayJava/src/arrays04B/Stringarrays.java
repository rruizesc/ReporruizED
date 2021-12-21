package arrays04B;

public class Stringarrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*		String cad1=new String ("hola");
		String cad2=new String (cad1);
		System.out.println(cad1+" "+cad2);
		if (cad1==cad2) {
			System.out.println("son iguales");
		}else {
			System.out.println("no son iguales");
		}
		if (cad1.equals(cad2)){
			System.out.println("tienen mismo contenido");
		}else {
			System.out.println("no tienen el mismo contenido");
		}*/
		String[] cads= {new String("Java para principiantes"),
				new String("Estudio de Java poo"),
				new String("estudio de poo")};
		for (int i = 0; i < cads.length; i++) {
			int pos=cads[i].indexOf("Java");
			if (pos>-1) {
				System.out.println(cads[i]+" "+pos);
			}
		}
		String s=new String ("nieve");
		s=s.toUpperCase();
		System.out.println(s);
		if (cads[1].contains("poo")) {
			System.out.println("libro es de poo");
		}
	}

}
