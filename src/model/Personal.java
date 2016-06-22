package model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="tbl_personal")
public class Personal {

	@Id
	private int pers_id;
	
	private String pers_nomb;
	
	@ManyToOne
	@JoinColumn(name="carg_id")
	private Cargo cargo;

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
	
	
}
