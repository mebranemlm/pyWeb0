package DAOI;

import java.util.List;

import javax.persistence.Query;

import util.Conexion;
import model.Cargo;
import DAOL.CargoDAOL;

public class CargoDAOI implements CargoDAOL {
Conexion cn = new Conexion();
	@Override
	public List<Cargo> listar() throws Exception {
		cn.abrir();
		Query q=cn.em.createQuery("select ca from Cargo ca"); //-> select * from tbl_cargo
		List<Cargo> lista =q.getResultList();
		return lista;
	}

}
