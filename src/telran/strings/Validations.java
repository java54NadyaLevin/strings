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

}
