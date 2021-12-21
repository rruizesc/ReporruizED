package arrays04B;

public class arraysmultidimensionales4 {

	public static void main(String[] args) {
		int[][][][]mat=new int[2][3][4][3];
		System.out.println("cuantos de nvl 1 "+mat.length);
		System.out.println("cuantos de nvl 2 "+mat[0].length);
		System.out.println("cuantos de nvl 3 "+mat[0][0].length);
		System.out.println("cuantos de nvl 4 "+mat[0][0][0].length);
		
		mat[1][2][3][2]=-666;//ultimo elemento
		mat[0][0][0][0]=666;//primer elemento
		mat[1][1][2][2]=566;
	}

}
