package de.slag.finance.persist;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.stream.Collectors;

import org.hibernate.Session;
import org.springframework.stereotype.Service;

import de.slag.core.logic.config.SlagContext;
import de.slag.dawn.core.persist.AbstractDao;
import de.slag.dawn.core.persist.PersistBean;
import de.slag.dawn.finance.data.StockValueDayDao;
import de.slag.dawn.finance.model.StockValueDay;
import de.slag.dawn.finance.service.StockValueDayService;

@Service
public class StockValueDayDaoImpl extends AbstractDao<StockValueDay, SvDay> implements StockValueDayDao {

	@Override
	public void save(StockValueDay bean) {
		saveBean(bean);
	}

	@Override
	public void delete(StockValueDay bean) {
		deleteBean(bean);
	}

	@Override
	public StockValueDay loadById(Long id) {
		return (StockValueDay) super.loadById(id);
	}

	@Override
	protected Class<? extends PersistBean> getPersistentClass() {
		return SvDay.class;
	}

	@Override
	protected Supplier<StockValueDay> getSupplier() {
		return () -> SlagContext.getBean(StockValueDayService.class).create();
	}

	@Override
	public Collection<StockValueDay> loadByIsin(String isin) {
		final Collection<SvDay> values = new ArrayList<>();
		Consumer<Session> consumer = session -> {
			final Collection<Long> ids = findIdsBy(session, "where isin='" + isin + "'");
			ids.forEach(id -> values.add(loadPersistById(id)));
		};
		execute(consumer);

		return values.stream().map(persist -> model(persist)).collect(Collectors.toList());
	}
}
