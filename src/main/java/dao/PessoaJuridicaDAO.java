package dao;

import javax.persistence.EntityManager;

import entities.PessoaJuridica;
import util.HibernateUtil;

/**
 * @author Pedro Alex
 */
public class PessoaJuridicaDAO {

	public void salvar(PessoaJuridica pessoa) {
    	EntityManager entityManager = HibernateUtil.getEntityManager();
    	try {
	    	entityManager.getTransaction().begin();
	    	entityManager.persist(pessoa);
	    	entityManager.getTransaction().commit();
	    	System.out.println("Pessoa jurídica salva com sucesso!");
    	} catch (Exception e) {
        	entityManager.getTransaction().rollback();
	    	System.out.println("Erro ao salvar a pessoa jurídica!");
            e.printStackTrace();
        } finally {
        	entityManager.close();			
		}
	}
	
}
