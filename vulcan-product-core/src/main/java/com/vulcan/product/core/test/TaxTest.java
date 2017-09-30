package com.vulcan.product.core.test;

import java.math.BigDecimal;

import com.vulcan.product.core.model.TaxCode;

public class TaxTest {
	public static void main(String[] args) {
		TaxCode taxCode = new TaxCode();
		BigDecimal value = taxCode.getValue();
		System.out.println(value);
	}
}
