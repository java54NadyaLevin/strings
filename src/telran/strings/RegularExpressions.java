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
		//return String.format("%s(\\.%s){3}", ipOctetExpression, ipOctetExpression);
	}
	
	public static String simpleArithmeticExpressions() {
		//TODO
		//operations: only binary (+-*/)
		//operands: only int
		//no brackets
		String operand = integerNumberExp();
		String operation = operationExp();
		return String.format("%1$s(%2$s%1$s)*", operand, operation);
		
	}
	
	public static String integerNumberExp() {
		return "(\\s*\\d+\\s*)";
	}
	
	public static String operationExp() {
		return "[-+*/]"; // don't need () because this exp = 1 symbol;
	}
	
	public static String arithmeticExp() {
		String operand = operandExp();
		String operation = operationExp();
		return String.format("%1$s(%2$s%1$s)*", operand, operation);
	}
	
	public static String operandExp() {
		return "(\\s*\\(*\\s*(\\d+(\\.\\d+)?|[A-Za-z$][\\w$]*|_[\\w$]+)\\s*\\)*\\s*)";
		
	}

}
