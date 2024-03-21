package telran.strings;

public class RegularExpressions {
	public static String javaVariable() {
		String regex = "[A-Za-z$][\\w$]*|_[A-Za-z0-9_$]+";
		return regex;
	}

	public static String zero_300() {
		String regex = "[1-9]\\d?|[1-2]\\d\\d|300|0";
		return regex;
	}

	public static String ipOctet() {
		String regex = "([0-1]?\\d?\\d|2[0-4]\\d|25[0-5])";
		return regex;
	}

	public static String mobileIsraelPhone() {
		String regex = "((\\+?972-?)|0)[5-9][\\d]-?([\\d]-?){7}";
		return regex;
	}

//	public static String gray() {
//		String regex = "(?i)(gr[a|e]y)";
//		return regex;
//	}

	public static String ipv4Address() {
		String ipOctetExpression = ipOctet();
		return String.format("%1$s(\\.%1$s){3}", ipOctetExpression);
		// return String.format("%s(\\.%s){3}", ipOctetExpression, ipOctetExpression);
	}

	private static String arithmeticExpGeneral(boolean isSimple) {
		String operandSimple = integerNumberExp();
		String operand = operandExp();
		String operation = operationExp();

		return String.format("%1$s(%2$s%1$s)*", isSimple ? operandSimple : operand, operation);
	}

	private static String integerNumberExp() {
		return "(\\s*\\d+\\s*)";
	}

	private static String operationExp() {
		return "[-+*/]"; // don't need () because this exp = 1 symbol;
	}

	private static String operandExp() {
		String numberExp = "(\\d+(\\.\\d+)?)"; // (\\d*\\.?\\d+)
		String javaVariable = javaVariable();
		return String.format("[\\s(]*(%s|%s)[)\\s]*", numberExp, javaVariable);
		//\\s*\\(*\\s* = [\\s(]*
		// 1$ | 2$ are not recommended here, because each pattern is used only once - 
		//it's just a simple %d %f etc like in basic java.
		

	}

	public static String simpleArithmeticExpressions() {

		return arithmeticExpGeneral(true);

	}

	public static String arithmeticExp() {

		return arithmeticExpGeneral(false);
	}

}
