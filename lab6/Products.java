package lab6;

public enum Products {
	BREAD, MILK, TEA, BUTTER, OTHER, BELT;
	public static Products fromString(String s) {
		s = s.toLowerCase().trim();
		switch (s) {
		case "bread":
			return BREAD;
		case "milk":
			return MILK;
		case "tea":
			return TEA;
		case "butter":
			return BUTTER;
		default:
			return OTHER;

		}
	}
}
