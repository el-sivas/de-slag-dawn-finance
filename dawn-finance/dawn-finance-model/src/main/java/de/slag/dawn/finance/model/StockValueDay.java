package de.slag.dawn.finance.model;

import java.time.LocalDate;
import java.util.Date;

import javax.money.MonetaryAmount;

import de.slag.root.base.ModelBean;

public class StockValueDay extends ModelBean {

	private StockValue stockValue;
	
	private LocalDate date;
	
	private MonetaryAmount price;
	
	private String isin;

	public StockValue getStockValue() {
		return stockValue;
	}

	public void setStockValue(StockValue stockValue) {
		this.stockValue = stockValue;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public MonetaryAmount getPrice() {
		return price;
	}

	public void setPrice(MonetaryAmount price) {
		this.price = price;
	}

	public String getIsin() {
		return isin;
	}

	public void setIsin(String isin) {
		this.isin = isin;
	}

}
