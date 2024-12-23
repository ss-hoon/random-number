package com.shlee.random_number;

import static com.ss_hoon.random_number.domain.model.DataType.DOUBLE;
import static com.ss_hoon.random_number.domain.model.DataType.FLOAT;
import static com.ss_hoon.random_number.domain.model.DataType.INT;
import static com.ss_hoon.random_number.domain.model.DataType.LONG;

import org.junit.jupiter.api.Test;

import com.ss_hoon.random_number.application.service.NumberService;

public class RandomNumberTests {

	@Test
	public void getRandomInteger() {
		System.out.println(NumberService.getRandomNumber(INT));
	}

	@Test
	public void getRandomDouble() {
		System.out.println(NumberService.getRandomNumber(DOUBLE));
	}

	@Test
	public void getRandomFloat() {
		System.out.println(NumberService.getRandomNumber(FLOAT));
	}

	@Test
	public void getRandomLong() {
		System.out.println(NumberService.getRandomNumber(LONG));
	}
}
