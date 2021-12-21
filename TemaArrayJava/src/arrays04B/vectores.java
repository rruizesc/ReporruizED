package arrays04B;

public class vectores {
	private static int [] crearN(int filas,int cols,int valor){
		int[] matriz=new int[filas];
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				matriz[j]=(int)(Math.random()*(valor+1));
			}
		}
		return matriz;
	}
	public static void main(String[] args) {
		int[] vector1=crearN(5,10,6);
		int[] vector2=crearN(5,14,20);

	}

}
