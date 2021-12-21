

public class ej3bucles {

	public static void main(String[] args) {
//		int menos= (int) (Math.random ()*(-10)-1);
//		System.out.println("Valor "+menos);
//		int menos=integer.MAX_VALUE;
		int menos=0;
		for (int i=0;i<10;i++) {
			int negativo=(int)(Math.random()*(-10)-1);	
		
		
		System.out.println(i+": Valor "+negativo);

		if(negativo<menos) {
			menos=negativo;
		}
		}
		System.out.println("el valor menor es "+menos);
	}
}
