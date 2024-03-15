package telran.strings.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import telran.strings.RegularExpressions;

class RegularExpressionsTest {

	@Test
	void javaVariableTrueTest() {
		String regex = RegularExpressions.javaVariable();
		assertTrue("abs".matches(regex));
		assertTrue("a".matches(regex));
		assertTrue("_ads".matches(regex));
		assertTrue("$".matches(regex));
		assertTrue("$123".matches(regex));
		assertTrue("$_123".matches(regex));
		assertTrue("__".matches(regex));
		assertTrue("AAA".matches(regex));
	}

	@Test
	void javaVariableFalseTest() {
		String regex = RegularExpressions.javaVariable();
		assertFalse("_".matches(regex));
		assertFalse("a-2".matches(regex));
		assertFalse("1sfg".matches(regex));
		assertFalse("s fg".matches(regex));
		assertFalse("s?f".matches(regex));

	}

	@Test
	void zero_300TrueTest() {
		String regex = RegularExpressions.zero_300();
		assertTrue("0".matches(regex));
		assertTrue("1".matches(regex));
		assertTrue("19".matches(regex));
		assertTrue("299".matches(regex));
		assertTrue("198".matches(regex));
		assertTrue("30".matches(regex));
		assertTrue("33".matches(regex));
		assertTrue("300".matches(regex));
	}

	@Test
	void zero_300FalseTest() {
		String regex = RegularExpressions.zero_300();
		assertFalse("00".matches(regex));
		assertFalse("01".matches(regex));
		assertFalse("19s".matches(regex));
		assertFalse("399".matches(regex));
		assertFalse("2198".matches(regex));
		assertFalse("301".matches(regex));
		assertFalse("-299".matches(regex));

	}

	@Test
	void ipOctetTest() {
		String regex = RegularExpressions.ipOctet();
		assertTrue("0".matches(regex));
		assertTrue("00".matches(regex));
		assertTrue("000".matches(regex));
		assertTrue("10".matches(regex));
		assertTrue("255".matches(regex));
		assertTrue("199".matches(regex));
		assertTrue("009".matches(regex));
		assertTrue("020".matches(regex));

		assertFalse("256".matches(regex));
		assertFalse("-0".matches(regex));
		assertFalse("2550".matches(regex));
		assertFalse("a55".matches(regex));
		assertFalse("10?".matches(regex));
		assertFalse("0000".matches(regex));
		assertFalse("300".matches(regex));
		assertFalse("-145".matches(regex));

	}

	@Test
	void mobileIsraelPhoneTrueTest() {
		String regex = RegularExpressions.mobileIsraelPhone();
		assertTrue("+972-548392568".matches(regex));
		assertTrue("+97254-8392568".matches(regex));
		assertTrue("+972-53-8392568".matches(regex));
		assertTrue("+972-54-839-25-68".matches(regex));
		assertTrue("972-54-839-25-68".matches(regex));

		assertTrue("0548392568".matches(regex));
		assertTrue("054-8392568".matches(regex));
		assertTrue("054-8-3-9-2568".matches(regex));
		assertTrue("072-8392568".matches(regex));

	}

	@Test
	void mobileIsraelPhoneFalseTest() {
		String regex = RegularExpressions.mobileIsraelPhone();

		assertFalse("+97258392568".matches(regex));
		assertFalse("+072-548392568".matches(regex));
		assertFalse("+972-348392568".matches(regex));
		assertFalse("+972-54a392568".matches(regex));
		assertFalse("+972 548 392568".matches(regex));
		assertFalse("-972548392568".matches(regex));
		assertFalse("+972-5-48392568".matches(regex));

		assertFalse("+58392568".matches(regex));
		assertFalse("058392568".matches(regex));
		assertFalse("348392568".matches(regex));
		assertFalse("053-234561".matches(regex));
		assertFalse("054 9392568".matches(regex));

	}
}
