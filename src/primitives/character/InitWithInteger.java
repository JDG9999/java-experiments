package primitives.character;

public class InitWithInteger {
	
	public static void main(String[] args) {
		
		char initInteger = 65;
		
		// If the number 65 is converted to binary, the result is 1000001.
		// To convert it to hexal, it's separated into groups of four bits:
		// 0000 0000 0100 0001
		// This number in hexal is 0041
		// The unicode for 0041 is 'A'
		
		char initIntegerRangeLimit = 65535;
		
		char initIntegerNegative = (char) -10;
		int initIntegerConverted = initIntegerNegative;
		
		char initIntegerOutsideRange = (char) 65536;
		int initIntegerConverted2 = initIntegerOutsideRange;
		
		System.out.println(initInteger);
		System.out.println(initIntegerNegative);
		System.out.println(initIntegerConverted);
		System.out.println(initIntegerOutsideRange);
		System.out.println(initIntegerConverted2);
		
	}

}
