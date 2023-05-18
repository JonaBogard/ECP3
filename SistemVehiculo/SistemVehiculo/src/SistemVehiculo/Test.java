package SistemVehiculo;

import static org.junit.jupiter.api.Assertions.*;

class Test {

	@org.junit.jupiter.api.Test
	void testInsertarVehiculo() {
		NegocioVehiculo nv = new NegocioVehiculo();
		nv.setVehiculoId("2");
		nv.setMarca("2");
		nv.setModelo("2");
		nv.setAno("2");
		nv.setColor("2");
		nv.setTipo("2");
		assertEquals(nv.insertarVehiculo(), true);
	}

	@org.junit.jupiter.api.Test
	void testCargarVehiculo() {
		NegocioVehiculo nv = new NegocioVehiculo();
		nv.setVehiculoId("2");
		assertEquals(nv.cargarVehiculo(), true);
	}

	@org.junit.jupiter.api.Test
	void testActualizarVehiculo() {
		NegocioVehiculo nv = new NegocioVehiculo();
		nv.setVehiculoId("2");
		nv.setMarca("2b");
		nv.setModelo("2b");
		nv.setAno("2b");
		nv.setColor("2b");
		nv.setTipo("2b");
		assertEquals(nv.actualizarVehiculo(), true);
	}

}
