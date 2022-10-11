package primitives;

public class Primitives {

	long myLong = 123;
	float myFloat = 0.5f; 
	
	short myShort = 5;
	byte myByte = 3;
	
	// loss of precision from long to float
    static long oldLong = 1234567890123456789L;
    static float floatLong = oldLong;

    public static void main(String[] args) {
        System.out.println(floatLong);
    }
	
	
}
