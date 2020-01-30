package it.testOpenJPA.repositories;

import java.util.List;

import it.testOpenJPA.models.Paziente;

public interface PazienteDAO {
	
	void savePaziente(String nome);
	
	Paziente findPazienteByNome(String nome);
	
	List<Paziente> findAll();
	
	void deletePaziente(String nome);
	
	//ArrayList<Ricovero> trovaListaRicoveriDaNomePaziente(String nome);

}
