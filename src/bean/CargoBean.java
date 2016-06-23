package bean;

import java.util.List;

import DAOI.CargoDAOI;
import model.Cargo;

public class CargoBean {
	//DAO
	CargoDAOI oCargoDAOI = new CargoDAOI();
	
	//Columnas de la tabla
	public int carg_id;
	public String carg_nomb;

	//Otros
	private List<Cargo> lista;
	
	//Funciones
	public void listar() throws Exception{
		lista=oCargoDAOI.listar();
	}
	
	
	
	//Getters and Setters
	public CargoDAOI getoCargoDAOI() {
		return oCargoDAOI;
	}

	public void setoCargoDAOI(CargoDAOI oCargoDAOI) {
		this.oCargoDAOI = oCargoDAOI;
	}

	public int getCarg_id() {
		return carg_id;
	}

	public void setCarg_id(int carg_id) {
		this.carg_id = carg_id;
	}

	public String getCarg_nomb() {
		return carg_nomb;
	}

	public void setCarg_nomb(String carg_nomb) {
		this.carg_nomb = carg_nomb;
	}

	public List<Cargo> getLista() {
		return lista;
	}

	public void setLista(List<Cargo> lista) {
		this.lista = lista;
	}
	
	//probando 
	public String accionPrincipal= "PRINCIPAL";

	public String getAccionPrincipal() {
		return accionPrincipal;
	}



	public void setAccionPrincipal(String accionPrincipal) {
		this.accionPrincipal = accionPrincipal;
	}
	
	
	

}
