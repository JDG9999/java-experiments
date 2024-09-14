package collections.set;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {
	
	public static void main(String[] args) {
		
		HashSet shortSet = new HashSet();
		for (short i = 0; i < 100; i++) {
			shortSet.add(i);
			System.out.println("Adding " + i);
			
			System.out.println(shortSet.remove(i - 1));
			System.out.println("Removing " + (i - 1));
			// It doesn't remove anything because it's trying to remove a different object type!
			
		}
		
//		shortSet.add("Hello");
//		for (Object i : shortSet) {
//			System.out.println(i.getClass());
//		}
		
		System.out.println(shortSet);
		
	}

}



