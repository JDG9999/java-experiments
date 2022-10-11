package interfaces;

public interface Fields {
	
	int value = 5;
	
	public default void execute() {
		System.out.println("My default method");
	}
	
	public void fieldsMethod();

}

