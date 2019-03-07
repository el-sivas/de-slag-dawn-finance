package de.slag.finance.app;

import java.time.LocalDate;

import de.slag.core.logic.config.SlagContext;
import de.slag.core.logic.utils.LoggingUtils;
import de.slag.core.service.CreateCredentials;
import de.slag.dawn.core.persist.SimpleHibernateSupport;
import de.slag.dawn.finance.logic.StockValueDayCredentials;
import de.slag.dawn.finance.model.StockValue;
import de.slag.dawn.finance.service.StockValueDayService;
import de.slag.dawn.finance.service.StockValueService;
import de.slag.root.base.DatabaseConfig;
import de.slag.root.base.SlagConfigSupport;

public class FinanceApp {

	private StockValueService stockValueService = SlagContext.getBean(StockValueService.class);

	private StockValueDayService stockValueDayService = SlagContext.getBean(StockValueDayService.class);

	public static void main(String[] args) {
		LoggingUtils.activateLogging();

		SlagContext.init();

		SimpleHibernateSupport.updateDatabase(SlagConfigSupport.getDefault(DatabaseConfig.class));
		FinanceApp app = new FinanceApp();
	}

	public FinanceApp() {
		final String isin = "DEF";
		final StockValue value = stockValueService.build(isin);
		value.getDays().add(stockValueDayService.create(new StockValueDayCredentials() {
			
			public String getIsin() {
				return isin;
			}

			public LocalDate getDate() {
				return LocalDate.now();
			}
		}));
		stockValueService.save(value);
	}
}
