package com.mycompany.app;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class MyFirstJUnitJupiterTests {
	private final Calculator calculator = new Calculator();

	@Test
	void addition() {
		assertEquals(2, calculator.add(1, 1));
	}

	@Test
	void alwaysPass() {
		assertTrue(true);
	}

	void alwaysFail() {
		assertTrue(false);
	}
}
