package de.slag.finance.persist;

import javax.persistence.Basic;
import javax.persistence.Entity;

import de.slag.dawn.core.persist.PersistBean;

@Entity
public class SvDay extends PersistBean {
	
	@Basic
	private String isin;

	public String getIsin() {
		return isin;
	}

	public void setIsin(String isin) {
		this.isin = isin;
	}

}
