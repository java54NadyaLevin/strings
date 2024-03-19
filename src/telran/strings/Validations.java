package telran.strings;

public class Validations {
	public static boolean isArithmeticExpression(String expression) {

		String regex = RegularExpressions.arithmeticExp();

		return expression.matches(regex) && bracketsCount(expression);
	}

	private static boolean bracketsCount(String expression) {
		int count = 0;
		int index = 0;
		while (index < expression.length() && count > -1) {
			if (expression.charAt(index) == '(') {
				count++;
			} else if (expression.charAt(index) == ')') {
				count--;
			}
			index++;
		}
		return count == 0;
	}

//according to requirement:
//if during passing over the string expression counter < 0 returning false:
	public static boolean isArithmeticExpAccordingToRequirements(String expression) {
		String regex = RegularExpressions.arithmeticExp();
		boolean result = false;
		if (expression.matches(regex)) {
			int count = 0;
			for (int index = 0; index < expression.length(); index++) {
				if (expression.charAt(index) == '(') {
					count++;
				} else if (expression.charAt(index) == ')') {
					count--;
				}
				if (count < 0)
					return false;
			}
			result = count == 0;
		}

		return result;
	}

}
