package de.slag.dawn.finance.service;

import de.slag.dawn.finance.model.StockValue;

public interface StockValueService {
	
	StockValue build(String isin);

	void save(StockValue bean);

}
