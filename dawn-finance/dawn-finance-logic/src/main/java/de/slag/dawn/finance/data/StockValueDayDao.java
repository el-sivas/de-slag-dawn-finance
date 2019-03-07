package de.slag.dawn.finance.data;

import java.util.Collection;

import de.slag.core.data.Dao;
import de.slag.dawn.finance.model.StockValueDay;

public interface StockValueDayDao extends Dao<StockValueDay>{
	
	Collection<StockValueDay> loadByIsin(String isin);

}
