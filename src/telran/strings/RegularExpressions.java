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
		String regex = "[0-1]?\\d?\\d|2[0-4]\\d|25[0-5]";
		return regex;
	}

	public static String mobileIsraelPhone() {
		String regex = "((\\+?972-?)|0)[5-9][\\d]-?([\\d]-?){7}";
		return regex;
	}

}
