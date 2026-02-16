package repaso;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CajaNegraTest {

	CajaNegra c = new CajaNegra();

	@Test
	void CP1() {
		boolean ResultadoEsperado = true;
		boolean ResultadoObtenido = c.compruebaDNI(10000001, 'S');
		assertEquals(ResultadoEsperado, ResultadoObtenido);
	}

	@Test
	void CP2() {
		boolean ResultadoEsperado = true;
		boolean ResultadoObtenido = c.compruebaDNI(99999999, 'R');
		assertEquals(ResultadoEsperado, ResultadoObtenido);
	}

	@Test
	void CP3() {
		boolean ResultadoEsperado = false;
		boolean ResultadoObtenido = c.compruebaDNI(9999999, 'S');
		assertEquals(ResultadoEsperado, ResultadoObtenido);
	}

	@Test
	void CP4() {
		boolean ResultadoEsperado = false;
		boolean ResultadoObtenido = c.compruebaDNI(100000000, 'S');
		assertEquals(ResultadoEsperado, ResultadoObtenido);
	}

	@Test
	void CP5() {
		boolean ResultadoEsperado = false;
		boolean ResultadoObtenido = c.compruebaDNI(10000001, 's');
		assertEquals(ResultadoEsperado, ResultadoObtenido);
	}

	@Test
	void CP6() {
		boolean ResultadoEsperado = false;
		boolean ResultadoObtenido = c.compruebaDNI(10000001, 'I');
		assertEquals(ResultadoEsperado, ResultadoObtenido);
	}

	@Test
	void CP7() {
		boolean ResultadoEsperado = false;
		boolean ResultadoObtenido = c.compruebaDNI(10000001, '*');
		assertEquals(ResultadoEsperado, ResultadoObtenido);
	}

	@Test
	void CP8() {
		boolean ResultadoEsperado = false;
		boolean ResultadoObtenido = c.compruebaDNI(10000001, ' ');
		assertEquals(ResultadoEsperado, ResultadoObtenido);
	}

	@Test
	void CP9() {
		boolean ResultadoEsperado = false;
		boolean ResultadoObtenido = c.compruebaDNI(10000001, '2');
		assertEquals(ResultadoEsperado, ResultadoObtenido);
	}

}
