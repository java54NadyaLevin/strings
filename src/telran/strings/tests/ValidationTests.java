package telran.strings.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import telran.strings.Validations;

class ValidationTests {

	@Test
	
	void isArithmeticExpressionTest() {
		
		
		assertTrue(Validations.isArithmeticExpression("(20.5 + abc)*2"));
		

	}


}
