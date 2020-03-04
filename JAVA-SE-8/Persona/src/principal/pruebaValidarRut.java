package principal;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class pruebaValidarRut {

	@Test
	void testValidarRUT() {
		String rut = "17.041.192-7";
		assertEquals(true, Persona.validarRUT(rut));
	}

}
