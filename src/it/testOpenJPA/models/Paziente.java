package it.testOpenJPA.models;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Paziente")
public class Paziente {

	@Id
	@Column(name="ID")
	private int id;

	@Column(name="NOME")
	private String nome;

	@Column(name="COGNOME")
	private String cognome;

	@OneToMany(mappedBy= "paziente")
	private List<Ricovero> listaRicoveri;

	public List<Ricovero> getListaRicoveri() {
		return listaRicoveri;
	}

	public void setListaRicoveri(List<Ricovero> listaRicoveri) {
		this.listaRicoveri = listaRicoveri;
	}

	public Paziente() {

	}

	public Paziente(String nome) {

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	@Override
	public String toString() {
		return "Paziente [nome=" + nome + ", cognome=" + cognome + ", listaRicoveri=" + listaRicoveri + "]";
	}

}
