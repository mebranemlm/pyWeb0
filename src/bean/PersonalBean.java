package bean;

import java.util.List;

import javax.swing.JOptionPane;

import DAOI.PersonalDAOI;
import model.Cargo;
import model.Personal;

public class PersonalBean {
	//DAO
	PersonalDAOI oPersonalDAOI = new PersonalDAOI();
	
	//Columnas
	public int pers_id;
	public String pers_nomb;
	public Cargo cargo;
	
	//Otros
	private List<Personal> lista;
    public void buscarPorNombre(Personal obj) throws Exception{
			lista=oPersonalDAOI.buscarPorNombre(obj);
	}
	//Getters and Setters
	public PersonalDAOI getoPersonalDAOI() {
		return oPersonalDAOI;
	}
    public void setoPersonalDAOI(PersonalDAOI oPersonalDAOI) {
		this.oPersonalDAOI = oPersonalDAOI;
	}
	public int getPers_id() {
		return pers_id;
	}

	public void setPers_id(int pers_id) {
		this.pers_id = pers_id;
	}

	public String getPers_nomb() {
		return pers_nomb;
	}

	public void setPers_nomb(String pers_nomb) {
		this.pers_nomb = pers_nomb;
	}

	public Cargo getCargo() {
		return cargo;
	}

	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}

	public List<Personal> getLista() {
		return lista;
	}

	public void setLista(List<Personal> lista) {
		this.lista = lista;
	}
	
	

}
