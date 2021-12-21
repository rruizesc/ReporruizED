
public class Array_ejemplo3 {

	public static void main(String[] args) {
		//al haber otro string con los nombres el primero es NULL
		String[]nombres=new String[3];
		String[]nombres1= {"maria","pepe","juan","ana","luisa"};
		
		for (int i = 0; i < nombres1.length; i++) {
			System.out.println(nombres1[i].charAt(0));
			
		}
	}

}
