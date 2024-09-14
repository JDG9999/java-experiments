package primitives;

public class CastingImplicit {
	
	/* 
    IMPLICIT CASTING
    
    It can be done:
    - Byte to Short
    - Short to Int
    - Char to Int
    - Int to Long
    - Long to Float
    - Float to Double
    */

    // loss of precision from int to float 
    static int oldInt = 1234567890;
    static float floatInt = oldInt;
    static int newInt = (int) floatInt;

    // loss of precision from long to float
    static long oldLong = 1234567890123456789L;
    static float floatLong = oldLong;
    static long newLong = (long) floatLong;

    // no loss from int to double
    static double doubleInt = oldInt;
    static int intDouble = (int) doubleInt;

    public static void main(String[] args) {
        System.out.println(floatInt);
        System.out.println(newInt);
        System.out.println(floatLong);
        System.out.println(newLong);
        System.out.println(intDouble);
    }

}
