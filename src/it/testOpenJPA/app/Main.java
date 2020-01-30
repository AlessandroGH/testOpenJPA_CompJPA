package it.testOpenJPA.app;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import it.testOpenJPA.models.Paziente;
import it.testOpenJPA.models.Ricovero;

/** 
 * 
 * @author PC
 *
 */


public class Main {

	private static final String PERSISTENCE_UNIT_NAME = "persistenceUnitName";
	private static EntityManagerFactory emf;

	public static void main(String[] args) {
		emf = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
		EntityManager em = emf.createEntityManager();

		// legge record presenti nella tabella e li trascrive sulla console.
		Query q = em.createQuery("select p from Paziente p");//JPQL <> SQL perché è case sensitive (cerca le Entità, non le tabelle!!!)
		List<Paziente> listaPazienti = q.getResultList();
		for (Paziente paziente : listaPazienti) {
			System.out.println(paziente);
		}//Prima esecuzione del metodo Main() senza la "listaRicoveri": nel db "testopenjpadb" ha creato solo la tabella "paziente".

		q = em.createQuery("select r from Ricovero r");
		List<Ricovero> listaRicoveri = q.getResultList();
		for (Ricovero ricovero : listaRicoveri) {
			System.out.println(ricovero);
		}//per poter creare la tabella "Ricoveri" su db, bisogna aggiungere la classe nell'elenco delle classi presenti nel file "persistence.xml".

		/*
	        // create new todo
	        em.getTransaction().begin();
	        Todo todo = new Todo();
	        todo.setSummary("This is a test");
	        todo.setDescription("This is a test");
	        em.persist(todo);
	        em.getTransaction().commit();
		 */

		em.close();
	}
	
	Paziente inserisciPaziente(String nome) {
		Paziente paziente = new Paziente(nome);
		return paziente;
	}
	
	Ricovero registraRicovero(Paziente paziente) {
		Ricovero ricovero = new Ricovero();
		return ricovero;
	}

}
