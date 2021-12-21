
public class Array_ejemplo4 {

	public static void main(String[] args) {
		String[]palos= {"bastos","espadas","copas","oros"};
		String[]valores= {"dos","tres","cuatro","cinco","seis","siete",
				"sota","caballo","rey","as"};
		
		for (int i = 0; i < palos.length; i++) {
			System.out.println();
			for (int j = 0; j < valores.length; j++) {
				System.out.println(valores[j]+" "+palos[i]);
			}
			
		}
		int p2,p1= (int)(Math.random()*palos.length);
		int v2,v1= (int)(Math.random()*valores.length);
		System.out.println();
		
		do {
			p2= (int)Math.random()*palos.length;
			v2= (int)Math.random()*valores.length;
		}while(p1==p2 && v1==v2);
		System.out.println("La carta que ha sacado la banca al azar es: "+valores[v1]+" "+palos[p1]);
		System.out.println("La carta que has sacado al azar es: "+valores[v2]+" "+palos[p2]);
		
		if(v1>=v2) {
			System.out.println("gana la banca");
		}else {
			System.out.println("gana el jugador");
		}
	}

}
