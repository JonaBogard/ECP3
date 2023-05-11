package Sistema;

public class NegocioProducto {
	String id;
	String nombre;
	String precio;
	String proveedor;
	DataProducto dp;

	public NegocioProducto() {
		dp = new DataProducto();
	}

	public boolean insertarProducto() {
		if(dp.insertarProducto(this)) {
			return true;
		} else {
			return false;
		}
	}

	public boolean cargarProducto() {
		if(dp.cargarProducto(this)) {
			return true;
		}else {
			return false;
		}
	}

	public boolean eliminarProducto() {
		return true;
	}

	public boolean actualizarProducto() {
		return true;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPrecio() {
		return precio;
	}

	public void setPrecio(String precio) {
		this.precio = precio;
	}

	public String getProveedor() {
		return proveedor;
	}

	public void setProveedor(String proveedor) {
		this.proveedor = proveedor;
	}

}