package util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class Conexion {
	public EntityManagerFactory emf;
	public EntityManager em;
	
	public void abrir(){
		emf=Persistence.createEntityManagerFactory("pyEscritorio0");
		em=emf.createEntityManager();
	}
	
	public void cerrar(){
		em.close();
		emf.close();
	}

}
