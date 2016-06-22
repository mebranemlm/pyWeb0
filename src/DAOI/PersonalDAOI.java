package DAOI;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Query;

import util.Conexion;
import model.Personal;
import DAOL.PersonalDAOL;

public class PersonalDAOI implements PersonalDAOL {
Conexion cn= new Conexion();
	
	@Override
	public List<Personal> buscarPorNombre(Personal obj) throws Exception {
		cn.abrir();
		Query q=cn.em.createQuery(
				"select p, p.cargo.carg_nomb from Personal p where p.pers_nomb like :nombre"
				);
		q.setParameter("nombre", '%'+obj.getPers_nomb()+'%');
		//select * from tbl_personal where pers_nomb like '%o%'
		
		//Object -> Personal
		//
		
		//[1,2,3,4,5]
		List<Object[]>  lista_arreglo=q.getResultList();
		
		//1.... Persona (Objeto) -> 1 , Jose
		//2.... Persona (Objeto) >- 2, Pedro
		//3....
			//			0 					1   			2 
		//1...  array[ Persona (Objeto) -> 1 jose, ....,... , ...]
		//2...  array[ Persona (Objeto) -> 2 Pedro, ....]
		//3...  array[ Persona (Objeto), ....]
		
		List<Personal> lista = new ArrayList<Personal>(); // Lista Personal vacia
		
		for(Object arreglo[]: lista_arreglo){
			Personal oPersonal= (Personal) arreglo[0];
			lista.add(oPersonal);
		}
		
		
		return lista;
	}

}
