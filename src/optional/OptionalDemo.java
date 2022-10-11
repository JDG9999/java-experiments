package optional;

import java.util.Optional;

public class OptionalDemo {

	public static void main(String[] args) {
		
		Object myMessage;
		Optional<String> optionalString;
//		optionalString = Optional.empty();
		optionalString = Optional.of("Hello world");
		
//		optionalString.ifPresent(elem -> {
//			myMessage = elem;
//		});
		
		if (optionalString.isPresent()) {
			myMessage = optionalString.get();
		} else {
			myMessage = "Nothing";
		}
		
		System.out.println(myMessage);

	}

}
