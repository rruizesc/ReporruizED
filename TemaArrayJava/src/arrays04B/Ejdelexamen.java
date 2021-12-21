package arrays04B;

public class Ejdelexamen {

	public static void main(String[] args) {
		int tam=100;
		int[]datos=new int[tam];
		int[]puntuaciones=new int[136];
		int may=0,min=135;
		int dato;
		int acum=0;
		
		for (int i = 0; i < datos.length; i++) {
			dato=(int)(Math.random()*136);
			System.out.print(dato+"\t");
			puntuaciones[dato]++;
			acum=acum+dato;
			datos[i]=dato;
			if (dato>may) {
				may=dato;
			}
			if (dato<min) {
				min=dato;
			}
		}
		System.out.println();
		System.out.println("La mayor puntuacion es "+may);
		System.out.println("La menor puntuacion es "+min);
		System.out.println("La media es "+(acum/tam));
		int maxpt=0;
		int nrep=0;
		for (int i = 0; i < puntuaciones.length; i++) {
			if(puntuaciones[i]>maxpt) {
				maxpt=puntuaciones[i];
				nrep=i;
			}
			System.out.println("la puntuacion es "+i+" y la frecuencia con la q sale es "+puntuaciones[i]);
		}
		System.out.println("La puntuacion que mas se repite es "+nrep+" con "+maxpt);
		
	}

}
