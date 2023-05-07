package model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Venta {
	
	private String nroTicket;
	private LocalDate fecha;
	private float totalVenta;
	private String formaDePago;
	private Empleado empleadoCaja;
	private Empleado empleadoVenta;
	private List<DetalleVenta> lstProductos = new ArrayList<DetalleVenta>();
	private Sucursal sucursal;
	
	public Venta(String nroTicket, LocalDate fecha, float totalVenta, String formaDePago, Empleado empleadoCaja,
			Empleado empleadoVenta, Sucursal sucursal) {
		super();
		this.nroTicket = nroTicket;
		this.fecha = fecha;
		this.totalVenta = totalVenta;
		this.formaDePago = formaDePago;
		this.empleadoCaja = empleadoCaja;
		this.empleadoVenta = empleadoVenta;
		this.sucursal = sucursal;
	}
	
	public Venta(String nroTicket, LocalDate fecha, float totalVenta, String formaDePago, Empleado empleadoCaja,
			Empleado empleadoVenta, Sucursal sucursal, List<DetalleVenta> lstProductos) {
		super();
		this.nroTicket = nroTicket;
		this.fecha = fecha;
		this.totalVenta = totalVenta;
		this.formaDePago = formaDePago;
		this.empleadoCaja = empleadoCaja;
		this.empleadoVenta = empleadoVenta;
		this.lstProductos = lstProductos;
		this.sucursal = sucursal;
	}

	public Venta() {
		super();
	}

	public String getNroTicket() {
		return nroTicket;
	}
	public void setNroTicket(String nroTicket) {
		this.nroTicket = nroTicket;
	}
	public LocalDate getFecha() {
		return fecha;
	}
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}
	public float getTotalVenta() {
		return totalVenta;
	}
	public void setTotalVenta(float totalVenta) {
		this.totalVenta = totalVenta;
	}
	public String getFormaDePago() {
		return formaDePago;
	}
	public void setFormaDePago(String formaDePago) {
		this.formaDePago = formaDePago;
	}
	public Empleado getEmpleadoCaja() {
		return empleadoCaja;
	}
	public void setEmpleadoCaja(Empleado empleadoCaja) {
		this.empleadoCaja = empleadoCaja;
	}
	public Empleado getEmpleadoVenta() {
		return empleadoVenta;
	}
	public void setEmpleadoVenta(Empleado empleadoVenta) {
		this.empleadoVenta = empleadoVenta;
	}
	public Sucursal getSucursal() {
		return sucursal;
	}
	public void setSucursal(Sucursal sucursal) {
		this.sucursal = sucursal;
	}
	

	public List<DetalleVenta> getLstProductos() {
		return lstProductos;
	}

	public void setLstProductos(List<DetalleVenta> lstProductos) {
		this.lstProductos = lstProductos;
	}


	@Override
	public String toString() {
		return "Venta [nroTicket=" + nroTicket + ", fecha=" + fecha + ", totalVenta=" + totalVenta + ", formaDePago="
				+ formaDePago + ", empleadoCaja=" + empleadoCaja + ", empleadoVenta=" + empleadoVenta + ", sucursal="
				+ sucursal + "]";
	}
	
	
	
	

}
