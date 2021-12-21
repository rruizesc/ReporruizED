package Staticos;

public class Ciudad {
	int tam=12;
	private String nombre;
	private double[] temperaturaMaxima;
	private double[] temperaturaMinima;
	
	public Ciudad (String nombre, double maxi1, double mini1) {
		this.nombre=nombre;
		temperaturaMaxima=new double [tam];
		temperaturaMinima=new double [tam];
		for (int i = 0; i <tam; i++) {
			temperaturaMaxima[i]=(Math.random()*(maxi1-mini1+1)+(mini1));
			temperaturaMinima[i]=(Math.random()*(maxi1-mini1+1)+(mini1));
		}
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void registrarTemperatura(int mes, double temperatura) {
		if(mes>=-1 && mes<=11) {
		if(temperatura>temperaturaMaxima[mes]) {
			temperaturaMaxima[mes]=temperatura;
		}if (temperatura<temperaturaMinima[mes]) {
			temperaturaMinima[mes]=temperatura;
		}
		}
	}	
	public double minimaGeneral() {
		double min=temperaturaMinima[0];
		for (int i = 0; i < temperaturaMinima.length; i++) {
			if (temperaturaMinima[i]<min) {
				min=temperaturaMinima[i];
			}
		}
		
		return min;
	}
	public double maximaGeneral() {
		double max=temperaturaMaxima[0];
		for (int i = 0; i < temperaturaMaxima.length; i++) {
			if (temperaturaMaxima[i]>max) {
				max=temperaturaMaxima[i];
			}
		}
		return max;
	}
	public double[] getMaximas() {
		return this.temperaturaMaxima;
		
	}
	public double[] getMinimas() {
		return this.temperaturaMinima;
	}
}
