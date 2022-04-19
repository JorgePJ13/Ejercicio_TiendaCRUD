package model;

public class Tienda {

	private String nombre;
	private String seccion;
	private double precio;
	private int stock;

	public Tienda() {

	}

	public Tienda(String nombre, String seccion, double precio, int stock) {
		super();
		this.nombre = nombre;
		this.seccion = seccion;
		this.precio = precio;
		this.stock = stock;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getSeccion() {
		return seccion;
	}

	public void setSeccion(String seccion) {
		this.seccion = seccion;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	@Override
	public String toString() {
		return "Tienda [nombre=" + nombre + ", seccion=" + seccion + ", precio=" + precio + ", stock=" + stock + "]";
	}

}
