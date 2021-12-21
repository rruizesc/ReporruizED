package Staticos;

public class PruebaMiString {

	public static void main(String[] args) {
		String cadena="prueba de texto";
		String prueba= MiString.alReves(cadena);
		System.out.println(prueba);
		
		System.out.println(MiString.limpiaCaracteres(cadena, "pr"));
		
		String tilde="Raúl";
		System.out.println(MiString.quitaTildes(tilde));
			
		String palindromo="hola";
		System.out.println(MiString.esPalindromo(palindromo));
		
		String numero="";
		System.out.println(MiString.esNumero(numero));
	}

}
