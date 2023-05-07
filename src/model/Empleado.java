package model;

public class Empleado {
	
	private int dni;
	private String apellido;
	private String nombre;
	private String nroAfiliado;
	private int cuil;
	private ObraSocial obraSocial;
	private Domicilio domicilio;
	
	public Empleado(int dni, String apellido, String nombre, String nroAfiliado, int cuil, ObraSocial obraSocial,
			Domicilio domicilio) {
		super();
		this.dni = dni;
		this.apellido = apellido;
		this.nombre = nombre;
		this.nroAfiliado = nroAfiliado;
		this.cuil = cuil;
		this.obraSocial = obraSocial;
		this.domicilio = domicilio;
	}
	
	public Empleado() {
		super();
	}

	public int getDni() {
		return dni;
	}
	public void setDni(int dni) {
		this.dni = dni;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getNroAfiliado() {
		return nroAfiliado;
	}
	public void setNroAfiliado(String nroAfiliado) {
		this.nroAfiliado = nroAfiliado;
	}
	public int getCuil() {
		return cuil;
	}
	public void setCuil(int cuil) {
		this.cuil = cuil;
	}
	public ObraSocial getObraSocial() {
		return obraSocial;
	}
	public void setObraSocial(ObraSocial obraSocial) {
		this.obraSocial = obraSocial;
	}
	public Domicilio getDomicilio() {
		return domicilio;
	}
	public void setDomicilio(Domicilio domicilio) {
		this.domicilio = domicilio;
	}

	@Override
	public String toString() {
		return "Empleado [dni=" + dni + ", apellido=" + apellido + ", nombre=" + nombre + ", nroAfiliado=" + nroAfiliado
				+ ", cuil=" + cuil + ", obraSocial=" + obraSocial + ", domicilio=" + domicilio + "]";
	}
	
	

}
