package repaso;

public class CajaNegra {

	public boolean compruebaDNI(int nif, char letra) {
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
