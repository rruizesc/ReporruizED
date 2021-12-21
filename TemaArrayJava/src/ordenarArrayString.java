
public class ordenarArrayString {
	public static void mostrar(int[] miarray) {
		for (int i = 0; i < miarray.length; i++) {
			System.out.print(miarray[i]+" ");
		}
	}
	public static void main(String[] args) {
		String[] nombres={"pepe","ana","juana","eva","antonio"};
		int[]notas= {7,8,4,3,6};
		int aux;
		String aux_nombres;
		int tam=nombres.length;
		
		for(int i=0;i<tam-1;i++) {
			for (int j =i+1;j<tam ; j++) {
				//para enseñarlos al reves se cambia el mayor/menor por el otro 
				//if(notas[i]> notas[j])
				if(notas[i]< notas[j]) {
					aux=notas[i];
					aux_nombres=nombres[i];
					
					notas[i]=notas[j];
					nombres[i]=nombres[j];
					
					notas[j]=aux;	
					nombres[j]=aux_nombres;
				}
			}
		}
		System.out.println("Datos ordenados");
		for (int i = 0; i < tam; i++) {
			System.out.println(notas[i]+" "+nombres[i]);
		}
		System.out.println("final");
	}

}