
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

import ejemplopaquete.CuentaCorriente;
import ejemplopaquete.interfaz;
/**
 * 
 * @author m
 * @version 1.0
 * @since 26/11/21
 */
public class Main {
	static BufferedReader dato = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) {
		interfaz cuenta1;
		double saldoActual;
		int opcion = 0;
		cuenta1 = new CuentaCorriente("Juan L�pez", "1000-2365-85-123456789", 2500, 0);
		do {
			try {
				System.out.println("MEN� DE OPERACIONES");
				System.out.println("-------------------");
				System.out.println("1 - Ingresar");
				System.out.println("2 - Retirar");
				System.out.println("3 - Finalizar");
				opcion = Integer.parseInt(dato.readLine());
				if (opcion == 1) {
					System.out.println("�Cu�nto desea ingresar?: ");
					float ingresar = Integer.parseInt(dato.readLine());
					operativa_cuenta(cuenta1, ingresar, opcion);
				} else if (opcion == 2) {
					System.out.println("�Cu�nto desea retirar?: ");
					float retirar = Integer.parseInt(dato.readLine());
					operativa_cuenta(cuenta1, retirar, opcion);
				} else if (opcion == 3) {
					System.out.println("Finalizamos la ejecuci�n");
				} else {
					System.err.println("Opci�n err�nea");
				}
/*               switch(opcion){
                case 1:
                    System.out.println("�Cu�nto desea ingresar?: ");
                    float ingresar=Integer.parseInt(dato.readLine());
                    operativa_cuenta(cuenta1,ingresar,opcion);
                    break;
                case 2:
                    System.out.println("�Cu�tno desea retirar?: ");
                    float retirar=Integer.parseInt(dato.readLine());
                    operativa_cuenta(cuenta1,retirar,opcion);
                    break;
                case 3:
                    System.out.println("Finalizamos la ejecuci�n");
            }
*/
			} catch (IOException ex) {
				System.out.println("Error: " + ex.getMessage());
			}
		} while (opcion != 3);
		saldoActual = cuenta1.getSaldo();
		System.out.println("El saldo actual es: " + saldoActual);
		
		interfaz cuenta2;
		cuenta2 = new CuentaCorriente("Maria Perez", "1000-123456789", 500, 0);
		visualizarDatosCuenta(cuenta1, cuenta2, "Buenos d�as");
	}
/**
 * 
 * @param cuenta1
 * @param cuenta2
 * @param newParam TODO
 */
	private static void visualizarDatosCuenta(interfaz cuenta1,
			interfaz cuenta2, Object newParam) {
		System.out.println("Datos clientes");
		System.out.println(cuenta1.toString());
		System.out.println(cuenta2.toString());
	}

	public static void operativa_cuenta(interfaz cuenta1, float cantidad, int opcion) {
		if (opcion == 2) {
			try {
				cuenta1.retirar(cantidad);
			} catch (Exception e) {
				System.out.println("Fallo al retirar");
			}
		} else if (opcion == 1) {
			try {
				System.out.println("Ingreso en cuenta");
				cuenta1.ingresar(cantidad);
			} catch (Exception e) {
				System.out.println("Fallo al ingresar");
			}
		}
	}

}