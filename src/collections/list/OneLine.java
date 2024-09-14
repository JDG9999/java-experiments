package collections.list;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class OneLine {

	public static void main(String[] args) {
		List<Integer> myListJava9 = List.of(1,2,3);
		List<Integer> myListArrays = Arrays.asList(1,2,3);
		List<Integer> myListStreams = Stream.of(1,2,3).collect(Collectors.toList());
		// myListJava9.add(4); // Unmodifiable, runtime exception! UnsupportedOperationException
		// myListArrays.add(4); // Unmodifiable, runtime exception! UnsupportedOperationException
		myListStreams.add(4);
		System.out.println(myListJava9);
		System.out.println(myListArrays);
		System.out.println(myListStreams);
	}

}
