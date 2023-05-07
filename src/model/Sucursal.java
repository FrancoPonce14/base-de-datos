package model;

import java.util.ArrayList;
import java.util.List;

public class Sucursal {
	
	private int idSucursal;
	private Empleado empleadoACargo;
	private List<Empleado> lstEmpleados = new ArrayList<Empleado>();
	
	
	public Sucursal(int idSucursal, Empleado empleadoACargo) {
		super();
		this.idSucursal = idSucursal;
		this.empleadoACargo = empleadoACargo;
	}
	
	
	public Sucursal(int idSucursal, Empleado empleadoACargo, List<Empleado> lstEmpleados) {
		super();
		this.idSucursal = idSucursal;
		this.empleadoACargo = empleadoACargo;
		this.lstEmpleados = lstEmpleados;
	}


	public Sucursal() {
		super();
	}

	public int getIdSucursal() {
		return idSucursal;
	}
	public void setIdSucursal(int idSucursal) {
		this.idSucursal = idSucursal;
	}
	public Empleado getEmpleadoACargo() {
		return empleadoACargo;
	}
	public void setEmpleadoACargo(Empleado empleadoACargo) {
		this.empleadoACargo = empleadoACargo;
	}
	public List<Empleado> getLstEmpleados() {
		return lstEmpleados;
	}
	public void setLstEmpleados(List<Empleado> lstEmpleados) {
		this.lstEmpleados = lstEmpleados;
	}

	@Override
	public String toString() {
		return "Sucursal [idSucursal=" + idSucursal + ", empleadoACargo=" + empleadoACargo + ", lstEmpleados="
				+ lstEmpleados + "]";
	}

	
	

}
