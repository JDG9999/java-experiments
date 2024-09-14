package primitives;

public class CastingExplicit {
	
	/* 
    OUT OF RANGE
    128 in short will be -128 in byte!
    128 is 0000000010000000 in short
    but in byte it can only be 10000000
    since the MSB is 1, the number is negative
    and since every number is 0, it is the biggest negative possible
    hence -128 
    */ 
    static short myShort = 128;
    static byte myByte = (byte) myShort; // -128

    /*
    TRUNCATION
    */

    /*
    TO CHAR
    */
    static byte myByte2 = -5;
    static char myChar = (char) myByte2;
    static byte byteFromChar = (byte) myChar;

    public static void main(String[] args) {
        System.out.println(myByte);
        System.out.println(myChar);
        System.out.println(byteFromChar);
    }

}
