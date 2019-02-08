package de.slag.dawn.finance.model;

import de.slag.dawn.base.utils.Labelable;

public class StockValue implements Labelable {

	private String isin;

	private String name;

	public String getIsin() {
		return isin;
	}

	public void setIsin(String isin) {
		this.isin = isin;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLabel() {
		return getName() + " (" + getIsin() + ")";

	}

}
