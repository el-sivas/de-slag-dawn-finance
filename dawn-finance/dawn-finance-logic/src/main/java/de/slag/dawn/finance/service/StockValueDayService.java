package de.slag.dawn.finance.service;

import java.util.Collection;

import de.slag.core.service.BusinessService;
import de.slag.dawn.finance.model.StockValueDay;

public interface StockValueDayService extends BusinessService<StockValueDay> {

	Collection<StockValueDay> findByIsin(String isin);

}
