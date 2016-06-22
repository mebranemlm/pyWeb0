package model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tbl_cargo")
public class Cargo {
	
	@Id
	private int carg_id;

	private String carg_nomb;

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
	
	
}