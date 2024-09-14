package primitives.floating;

public class Floating {
	
	// Floating numbers also support underscore!
    static float floatUnderscore = 3.14_15_92f;

    static float floatScientific = 3.14f;
    static double doubleScientific = 3.14e5;

    static float floatPrecisionTest1 = 7.123456789f;   // prints 7.123457
    static float floatPrecisionTest2 = 777.123456789f; // prints 777.1235

    static double doublePrecisionTest1 = 7.1234567890123456789;   // prints 7.123456789012345
    static double doublePrecisionTest2 = 777.1234567890123456789; // prints 777.1234567890124
    public static void main(String[] args) {
        System.out.println(floatUnderscore);
        System.out.println(floatPrecisionTest1);
        System.out.println(floatPrecisionTest2);
        System.out.println(doublePrecisionTest1);
        System.out.println(doublePrecisionTest2);
    }

}
