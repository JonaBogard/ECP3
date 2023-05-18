package SistemVehiculo;

public class NegocioVehiculo {
	String VehiculoId;
	String Marca;
	String Modelo;
	String Ano;
	String Color;
	String Tipo;
	DataVehiculo dv = null;

	public NegocioVehiculo() {
		dv = new DataVehiculo();
	}

	public boolean insertarVehiculo() {
		if (dv.insertarVehiculo(this)) {
			return true;
		} else {
			return false;
		}
	}

	public boolean cargarVehiculo() {
		if (dv.cargarVehiculo(this)) {
			return true;
		} else {
			return false;
		}
	}

	public boolean actualizarVehiculo() {
		if (dv.actualizarVehiculo(this)) {
			return true;
		} else {
			return false;
		}
	}

	public String getVehiculoId() {
		return VehiculoId;
	}

	public void setVehiculoId(String vehiculoId) {
		VehiculoId = vehiculoId;
	}

	public String getMarca() {
		return Marca;
	}

	public void setMarca(String marca) {
		Marca = marca;
	}

	public String getModelo() {
		return Modelo;
	}

	public void setModelo(String modelo) {
		Modelo = modelo;
	}

	public String getAno() {
		return Ano;
	}

	public void setAno(String ano) {
		Ano = ano;
	}

	public String getColor() {
		return Color;
	}

	public void setColor(String color) {
		Color = color;
	}

	public String getTipo() {
		return Tipo;
	}

	public void setTipo(String tipo) {
		Tipo = tipo;
	}
}
