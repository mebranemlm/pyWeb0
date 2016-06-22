package DAOL;

import java.util.List;

import model.Personal;

public interface PersonalDAOL {
	public abstract List<Personal> buscarPorNombre(Personal obj) throws Exception;

}
