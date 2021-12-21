package recursivo;

public class pruebaderecursivo {

	public static int calculapotenciaR(int base, int expo){
		int sol;
		if(expo==1) {
			return 1;
		}
		sol=base*calculapotenciaR(base,expo-1);
		return sol;
	}
	public static String inversoR(String pal) {
		String sol="";
		String aux="";
		if(pal.length()==0 || pal.length()==1) {
			sol=pal;
		}else {
		sol=sol+pal.substring(pal.length()-1,pal.length());	
		sol+=aux+inversoR(pal.substring(0,pal.length()-1));
		}
		return sol;
	}

}
