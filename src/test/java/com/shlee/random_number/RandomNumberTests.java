package com.shlee.random_number;

import static com.sshoon.random_number.domain.model.DataType.DOUBLE;
import static com.sshoon.random_number.domain.model.DataType.FLOAT;
import static com.sshoon.random_number.domain.model.DataType.INT;
import static com.sshoon.random_number.domain.model.DataType.LONG;

import org.junit.jupiter.api.Test;

import com.sshoon.random_number.application.service.NumberService;

public class RandomNumberTests {

	private final NumberService numberService = new NumberService();

	@Test
	public void getRandomInteger() {
		System.out.println(numberService.getRandomNumber(INT));
	}

	@Test
	public void getRandomDouble() {
		System.out.println(numberService.getRandomNumber(DOUBLE));
	}

	@Test
	public void getRandomFloat() {
		System.out.println(numberService.getRandomNumber(FLOAT));
	}

	@Test
	public void getRandomLong() {
		System.out.println(numberService.getRandomNumber(LONG));
	}
}
