package de.slag.dawn.finance.logic;

import java.time.LocalDate;

import de.slag.core.service.CreateCredentials;
import de.slag.dawn.finance.model.StockValueDay;

public interface StockValueDayCredentials extends CreateCredentials<StockValueDay> {

	String getIsin();
	
	LocalDate getDate();

}
