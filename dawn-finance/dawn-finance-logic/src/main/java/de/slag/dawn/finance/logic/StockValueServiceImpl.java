package de.slag.dawn.finance.logic;

import org.springframework.stereotype.Service;

import de.slag.core.data.Dao;
import de.slag.core.logic.AbstractBusinessService;
import de.slag.dawn.finance.model.StockValue;
import de.slag.dawn.finance.service.StockValueService;

@Service
public class StockValueServiceImpl extends AbstractBusinessService<StockValue> implements StockValueService {

	@Override
	protected Dao<StockValue> getDao() {
		// TODO Auto-generated method stub
		return null;
	}

}
