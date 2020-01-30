package it.testOpenJPA.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Ricovero")
public class Ricovero {
	
	@Column
	private int id;
	
	@Column
	private String date;
	
	@Column
	private String tipo;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="PAZIENTE_ID")
	private Paziente paziente;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "Ricovero [id=" + id + ", date=" + date + ", tipo=" + tipo + "]";
	}

}
