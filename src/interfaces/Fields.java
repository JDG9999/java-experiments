package interfaces;

public interface Fields {
	
	int value = 5; //the italics seems to imply that it's static by default
	
	public default void execute() {
		System.out.println("My default method");
	}
	
	public void fieldsMethod();

}

