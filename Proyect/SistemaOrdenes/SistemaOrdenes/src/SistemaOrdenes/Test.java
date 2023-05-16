package SistemaOrdenes;

import static org.junit.jupiter.api.Assertions.*;

class Test {

	/*True cases*/	
	
	@org.junit.jupiter.api.Test
	void testInsertarProducto() {
		NegocioOrden no=new NegocioOrden();
		no.setOrderId("2");
		no.setDate("2");
		no.setName("2");
		no.setAddress("2");
		no.setCity("2");
		no.setState("2");
		no.setPostalCode("2");
		no.setCountry("2");
		no.setRegion("2");
		no.setNotes("2");
		no.setTaxes("2");
		assertTrue(no.insertarOrden());
	}

	@org.junit.jupiter.api.Test
	void testConsultarOrden() {

		NegocioOrden no=new NegocioOrden();
		no.setOrderId("2");
		assertTrue(no.consultarOrden());
	}

	@org.junit.jupiter.api.Test
	void testActualizarOrden() {
		NegocioOrden no=new NegocioOrden();
		no.setOrderId("2");
		no.setDate("3");
		no.setName("3");
		no.setAddress("3");
		no.setCity("3");
		no.setState("3");
		no.setPostalCode("3");
		no.setCountry("3");
		no.setRegion("3");
		no.setNotes("3");
		no.setTaxes("3");
		assertTrue(no.actualizarOrden());
	}
	/*False cases
	 void testInsertarProducto() {
		NegocioOrden no=new NegocioOrden();
		no.setOrderId("2");
		no.setDate("2");
		no.setName("2");
		no.setAddress("2");
		no.setCity("2");
		no.setState("2");
		no.setPostalCode("2");
		no.setCountry("2");
		no.setRegion("2");
		no.setNotes("2");
		no.setTaxes("2");
		assertTrue(no.insertarOrden());
	}
	void testConsultarOrden() {

		NegocioOrden no=new NegocioOrden();
		no.setOrderId("5");
		assertTrue(no.consultarOrden());
	}
	void testActualizarOrden() {
		NegocioOrden no=new NegocioOrden();
		no.setOrderId("3");
		no.setDate("3");
		no.setName("3");
		no.setAddress("3");
		no.setCity("3");
		no.setState("3");
		no.setPostalCode("3");
		no.setCountry("3");
		no.setRegion("3");
		no.setNotes("3");
		no.setTaxes("3");
		assertTrue(no.actualizarOrden());
	}
	  */

}
