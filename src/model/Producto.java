package model;

public class Producto {
	
	private int idProducto;
	private String descripcion;
	private float precio;
	private Laboratorio laboratorio;
	private boolean esPerfumeria;
	
	public Producto(int idProducto, String descripcion, float precio, Laboratorio laboratorio, boolean esPerfumeria) {
		super();
		this.idProducto = idProducto;
		this.descripcion = descripcion;
		this.precio = precio;
		this.laboratorio = laboratorio;
		this.esPerfumeria = esPerfumeria;
	}
	
	public Producto() {
		super();
	}

	public int getIdProducto() {
		return idProducto;
	}
	public void setIdProducto(int idProducto) {
		this.idProducto = idProducto;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public float getPrecio() {
		return precio;
	}
	public void setPrecio(float precio) {
		this.precio = precio;
	}
	public Laboratorio getLaboratorio() {
		return laboratorio;
	}
	public void setLaboratorio(Laboratorio laboratorio) {
		this.laboratorio = laboratorio;
	}
	public boolean isEsPerfumeria() {
		return esPerfumeria;
	}
	public void setEsPerfumeria(boolean esPerfumeria) {
		this.esPerfumeria = esPerfumeria;
	}

	@Override
	public String toString() {
		return "Producto [idProducto=" + idProducto + ", descripcion=" + descripcion + ", precio=" + precio
				+ ", laboratorio=" + laboratorio + ", esPerfumeria=" + esPerfumeria + "]";
	}
	
	

}
