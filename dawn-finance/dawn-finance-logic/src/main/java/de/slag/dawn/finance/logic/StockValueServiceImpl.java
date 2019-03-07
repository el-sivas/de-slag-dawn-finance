package de.slag.dawn.finance.logic;

import org.springframework.stereotype.Service;

import de.slag.core.logic.config.SlagContext;
import de.slag.dawn.finance.model.StockValue;
import de.slag.dawn.finance.service.StockValueDayService;
import de.slag.dawn.finance.service.StockValueService;

@Service
public class StockValueServiceImpl implements StockValueService {
	
	private StockValueDayService stockValueDayService = SlagContext.getBean(StockValueDayService.class);

	@Override
	public StockValue build(String isin) {
		final StockValue stockValue = new StockValue();
		stockValue.getDays().addAll(stockValueDayService.findByIsin(isin));
		stockValue.setIsin(isin);
		return stockValue;
	}

	@Override
	public void save(StockValue bean) {		
		bean.getDays().forEach(day -> stockValueDayService.save(day));
	}
}
