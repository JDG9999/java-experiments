package functional.lambda;

import java.util.ArrayList;

public class LambdaTest {

	public static void main(String[] args) {
		
		ArrayList<Integer> arrL = new ArrayList<Integer>(); 
        arrL.add(1); 
        arrL.add(2); 
        arrL.add(3); 
        arrL.add(4); 
        
        arrL.forEach((n)->{});

	}

}
