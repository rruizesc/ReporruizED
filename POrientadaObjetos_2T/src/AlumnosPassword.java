
public class AlumnosPassword {
	private int numalum;
	private Password[] mipass; //el array de mi contrase�a
	private int tam;//tama�o de las password
//	private boolean[] fortaleza; //es para saber si la contrase�a del alumno es fuerte o debil su contrase�a
	
	public AlumnosPassword(int numalum,int tam) {
		this.numalum=numalum;
		this.tam=tam;
		mipass=new Password[numalum];
//		fortaleza=new boolean[this.numalum];
		rellena();
	}
	private void rellena(){
		for (int i = 0; i < numalum; i++) {
			mipass[i]=new Password(tam);
//			fortaleza[i]=mipass[i.esFuerte]; //faltaria esFuerte en la clase Password esta incompleto 
		}
	}
}
