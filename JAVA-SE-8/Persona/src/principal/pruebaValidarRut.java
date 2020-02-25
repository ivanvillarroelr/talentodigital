package principal;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class pruebaValidarRut {

	@Test
	void testValidarRUT() {
		Persona persona5 = new Persona();
		String rut = "17.041.192-7";
		assertEquals(true, Persona.validarRUT(rut));
	}

}
