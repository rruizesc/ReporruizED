

public class ej8iterativo {

	public static void main(String[] args) {
		int num=0;
		for(num=1;num<11;num++) {
			int resultado=1;
			for(int i=1;i<(num+1);i++) {
			resultado*=i;
		}
			System.out.println("el resultado de "+num+" es: "+resultado);
		}
		
	}
}


