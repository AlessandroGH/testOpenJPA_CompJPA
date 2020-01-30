package it.testOpenJPA.repositories;

import java.util.List;

import it.testOpenJPA.models.Paziente;
import it.testOpenJPA.models.Ricovero;

public interface RicoveroDAO {
	
	void saveRicovero(Paziente paziente);
	
	void deleteRicovero(String nomePaziente);
	
	Ricovero updateRicovero(Ricovero ricovero);
	
	List<Ricovero> findAllRicoveroByNomePaziente(String nomePaziente);

}
