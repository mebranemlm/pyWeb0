package DAOL;

import java.util.List;

import model.Cargo;

public interface CargoDAOL {

	//CRUD
	
	public abstract List<Cargo>  listar() throws Exception;
	
}
