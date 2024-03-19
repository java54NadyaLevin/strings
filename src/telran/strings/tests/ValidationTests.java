package telran.strings.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import telran.strings.Validations;

class ValidationTests {

	@Test

	void isArithmeticExpressionTest() {

		assertTrue(Validations.isArithmeticExpression("(20.5 + abc)*2"));
		assertTrue(Validations.isArithmeticExpression("20"));
		assertTrue(Validations.isArithmeticExpression("abc "));
		assertTrue(Validations.isArithmeticExpression("($abc*w)+( ds/(sd-a))"));
		
		assertFalse(Validations.isArithmeticExpression(")20("));
		assertFalse(Validations.isArithmeticExpression("((20.5 + abc)*2"));
		assertFalse(Validations.isArithmeticExpression("(20.5 + abc))"));
		assertFalse(Validations.isArithmeticExpression("(())"));
		assertFalse(Validations.isArithmeticExpression(" "));
		assertFalse(Validations.isArithmeticExpression("(!20 + abc )"));
		assertFalse(Validations.isArithmeticExpression("{20}"));
		assertFalse(Validations.isArithmeticExpression("1abc"));
		assertFalse(Validations.isArithmeticExpression("-20"));
		

	}

	@Test
	@DisplayName("Test for version according to requirements (2 returnes)")
	void isArithmeticExpAccordingToRequirementsTest() {

		assertTrue(Validations.isArithmeticExpAccordingToRequirements("(20.5 + abc)*2"));
		assertTrue(Validations.isArithmeticExpAccordingToRequirements("20"));
		assertTrue(Validations.isArithmeticExpAccordingToRequirements("abc "));
		assertTrue(Validations.isArithmeticExpAccordingToRequirements("($abc*w)+( ds/(sd-a))"));
		
		assertFalse(Validations.isArithmeticExpAccordingToRequirements(")20("));
		assertFalse(Validations.isArithmeticExpAccordingToRequirements("((20.5 + abc)*2"));
		assertFalse(Validations.isArithmeticExpAccordingToRequirements("(20.5 + abc))"));
		assertFalse(Validations.isArithmeticExpAccordingToRequirements("(())"));
		assertFalse(Validations.isArithmeticExpAccordingToRequirements(" "));
		assertFalse(Validations.isArithmeticExpAccordingToRequirements("(!20 + abc )"));
		assertFalse(Validations.isArithmeticExpAccordingToRequirements("{20}"));
		assertFalse(Validations.isArithmeticExpAccordingToRequirements("1abc"));
		assertFalse(Validations.isArithmeticExpAccordingToRequirements("-20"));
		

	}

}
