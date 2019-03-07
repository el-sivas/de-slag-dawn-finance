package de.slag.dawn.finance.logic;

import java.util.Collection;

import org.springframework.stereotype.Service;

import de.slag.core.logic.config.SlagContext;
import de.slag.core.service.CreateCredentials;
import de.slag.dawn.finance.data.StockValueDayDao;
import de.slag.dawn.finance.model.StockValueDay;
import de.slag.dawn.finance.service.StockValueDayService;
import de.slag.root.base.BaseException;

@Service
public class StockValueDayServiceImpl implements StockValueDayService {

	private StockValueDayDao dao = SlagContext.getBean(StockValueDayDao.class);

	@Override
	public void save(StockValueDay bean) {
		dao.save(bean);
	}

	@Override
	public void delete(StockValueDay bean) {
		dao.delete(bean);
	}

	@Override
	public StockValueDay create(CreateCredentials<StockValueDay> credentials) {
		if (!(credentials instanceof StockValueDayCredentials)) {
			throw new BaseException(credentials + "not instance of " + StockValueDayCredentials.class);
		}
		final StockValueDayCredentials c = (StockValueDayCredentials) credentials;
		
		final StockValueDay stockValueDay = new StockValueDay();
		stockValueDay.setIsin(c.getIsin());
		stockValueDay.setDate(c.getDate());
		return stockValueDay;
	}

	@Override
	public Collection<StockValueDay> findByIsin(String isin) {
		return dao.loadByIsin(isin);
	}

}
