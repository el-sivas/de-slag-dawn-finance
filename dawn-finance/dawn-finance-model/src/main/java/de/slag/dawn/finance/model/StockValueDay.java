package de.slag.dawn.finance.model;

import java.util.Date;

import javax.money.MonetaryAmount;

import de.slag.dawn.core.model.ModelBean;

public class StockValueDay extends ModelBean {

	private StockValue stockValue;
	
	private Date date;
	
	private MonetaryAmount price;

	public StockValue getStockValue() {
		return stockValue;
	}

	public void setStockValue(StockValue stockValue) {
		this.stockValue = stockValue;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public MonetaryAmount getPrice() {
		return price;
	}

	public void setPrice(MonetaryAmount price) {
		this.price = price;
	}

}
