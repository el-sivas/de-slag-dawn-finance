package de.slag.dawn.finance.model;

import java.util.ArrayList;
import java.util.Collection;

import de.slag.root.base.Labelable;
import de.slag.root.base.ModelBean;

public class StockValue extends ModelBean implements Labelable {

	private String isin;

	private String name;
	
	private final Collection<StockValueDay> days = new ArrayList<>();

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

	public Collection<StockValueDay> getDays() {
		return days;
	}

}
