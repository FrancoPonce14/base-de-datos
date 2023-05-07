package model;

public class Domicilio {
	
	private int idDomicilio;
	private String calle;
	private String nroCalle;
	private String localidad;
	
	public Domicilio(int idDomicilio, String calle, String nroCalle, String localidad) {
		super();
		this.idDomicilio = idDomicilio;
		this.calle = calle;
		this.nroCalle = nroCalle;
		this.localidad = localidad;
	}
	
	public Domicilio() {
		super();
	}

	public int getIdDomicilio() {
		return idDomicilio;
	}
	public void setIdDomicilio(int idDomicilio) {
		this.idDomicilio = idDomicilio;
	}
	public String getCalle() {
		return calle;
	}
	public void setCalle(String calle) {
		this.calle = calle;
	}
	public String getNroCalle() {
		return nroCalle;
	}
	public void setNroCalle(String nroCalle) {
		this.nroCalle = nroCalle;
	}
	public String getLocalidad() {
		return localidad;
	}
	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}

	@Override
	public String toString() {
		return "Domicilio [idDomicilio=" + idDomicilio + ", calle=" + calle + ", nroCalle=" + nroCalle + ", localidad="
				+ localidad + "]";
	}
	
	

}
