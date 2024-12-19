package com.shlee.random_number.application.service;

import com.shlee.random_number.domain.model.DataType;

public class NumberService {

	public Number getRandomNumber(DataType dataType) {
		return dataType.getRandomNumber();
	}
}
