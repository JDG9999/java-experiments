package collections.map;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MyMap {
	
	public static void main(String[] args) {
		Map<String, Integer> map = Stream.of(new Object[][] {
			{"k1", 1},
			{"k2", 2}
		}).collect(Collectors.toMap(data -> (String) data[0], data -> (Integer) data[1]));
		System.out.println(map);
	}

}
