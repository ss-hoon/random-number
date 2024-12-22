package com.ss_hoon.random_number.application.service;

import com.ss_hoon.random_number.domain.model.DataType;

public class NumberService {

	public Number getRandomNumber(DataType dataType) {
		return dataType.getRandomNumber();
	}
}
