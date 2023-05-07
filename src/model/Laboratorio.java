package model;

public class Laboratorio {
	
	private int idLaboratorio;

	public Laboratorio(int idLaboratorio) {
		super();
		this.idLaboratorio = idLaboratorio;
	}
	
	public Laboratorio() {
		super();
	}

	public int getIdLaboratorio() {
		return idLaboratorio;
	}

	public void setIdLaboratorio(int idLaboratorio) {
		this.idLaboratorio = idLaboratorio;
	}

	@Override
	public String toString() {
		return "Laboratorio [idLaboratorio=" + idLaboratorio + "]";
	}
	
	

}
