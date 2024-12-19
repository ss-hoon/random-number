package com.shlee.random_number.domain.model;

import org.apache.commons.lang3.RandomUtils;

public enum DataType {
	INT {
		@Override
		public Integer getRandomNumber() {
			return RandomUtils.secure().randomInt();
		}
	},

	DOUBLE {
		@Override
		public Double getRandomNumber() {
			return RandomUtils.secure().randomDouble();
		}
	},

	FLOAT {
		@Override
		public Float getRandomNumber() {
			return RandomUtils.secure().randomFloat();
		}
	},

	LONG {
		@Override
		public Long getRandomNumber() {
			return RandomUtils.secure().randomLong();
		}
	};

	public abstract Number getRandomNumber();
}
