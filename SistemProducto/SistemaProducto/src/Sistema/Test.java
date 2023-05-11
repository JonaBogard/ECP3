package Sistema;

import static org.junit.jupiter.api.Assertions.*;

class Test {

	@org.junit.jupiter.api.Test
	void testInsertarProducto() {
		NegocioProducto np=new NegocioProducto();
		np.setId("01");
		np.setNombre("Name");
		np.setPrecio("50");
		np.setProveedor("Prov");
	}

	@org.junit.jupiter.api.Test
	void testCargarProducto() {
		fail("Not yet implemented");
	}

	@org.junit.jupiter.api.Test
	void testEliminarProducto() {
		fail("Not yet implemented");
	}

	@org.junit.jupiter.api.Test
	void testActualizarProducto() {
		fail("Not yet implemented");
	}

}
