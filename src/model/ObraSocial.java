package model;

public class ObraSocial {
	
	private int idObraSocial;
	private String nombreObraSocial;
	
	
	public ObraSocial(int idObraSocial, String nombreObraSocial) {
		super();
		this.idObraSocial = idObraSocial;
		this.nombreObraSocial = nombreObraSocial;
	}
	
	public ObraSocial() {
		super();
	}

	public int getIdObraSocial() {
		return idObraSocial;
	}
	public void setIdObraSocial(int idObraSocial) {
		this.idObraSocial = idObraSocial;
	}
	public String getNombreObraSocial() {
		return nombreObraSocial;
	}
	public void setNombreObraSocial(String nombreObraSocial) {
		this.nombreObraSocial = nombreObraSocial;
	}

	@Override
	public String toString() {
		return "ObraSocial [idObraSocial=" + idObraSocial + ", nombreObraSocial=" + nombreObraSocial + "]";
	}
	
	
	

}
