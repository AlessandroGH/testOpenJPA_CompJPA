package it.testOpenJPA.dto;

public class RicoveroDTO {
	
	private String data;
	private String tipo;
	private String nomePaziente;//nome del Paziente
	
	public RicoveroDTO() {

	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getNomePaziente() {
		return nomePaziente;
	}

	public void setNomePaziente(String nomePaziente) {
		this.nomePaziente = nomePaziente;
	}

}
