package com.sshoon.random_number.application.service;

import com.sshoon.random_number.domain.model.DataType;

public class NumberService {

	public Number getRandomNumber(DataType dataType) {
		return dataType.getRandomNumber();
	}
}
