package model;

public class DetalleVenta {
	

	private Producto producto;
	private int cantidad;
	private float precioUnitario;
	private float total;
	
	public DetalleVenta( Producto producto, int cantidad, float precioUnitario, float total) {
		super();
		this.producto = producto;
		this.cantidad = cantidad;
		this.precioUnitario = precioUnitario;
		this.total = total;
	}
	
	public DetalleVenta() {
		super();
	}

	public Producto getProducto() {
		return producto;
	}
	public void setProducto(Producto producto) {
		this.producto = producto;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public float getPrecioUnitario() {
		return precioUnitario;
	}
	public void setPrecioUnitario(float precioUnitario) {
		this.precioUnitario = precioUnitario;
	}
	public float getTotal() {
		return total;
	}
	public void setTotal(float total) {
		this.total = total;
	}

	@Override
	public String toString() {
		return "DetalleVenta [producto=" + producto + ", cantidad=" + cantidad + ", precioUnitario=" + precioUnitario
				+ ", total=" + total + "]";
	}


	
	

}
