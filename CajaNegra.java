package repaso;

/**
 * 
 * @param
 * @author DAW102
 * @version 1.10.1
 */
public class CajaNegra {

	/**
	 * Método que comprueba el DNI
	 * @param nif indica el numero del DNI
	 * @param letra indica la letra del DNI
	 * @return true o false
	 */
	
	public boolean compruebaDNI(int nif, char letra) {
		//el parámetro NIF tiene que ser mayor a 10000000 y menor que 100000000
		if (nif <= 10000000 && nif >= 100000000) {
			return false;
		}
		if (letra >= 'A' && letra <= 'Z') {
			String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
			int resultado = nif % 23;
			if (letras.charAt(resultado) == letra) {
				return true;
			}
		}
		return false;
	}
}
