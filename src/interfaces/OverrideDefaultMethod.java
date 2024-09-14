package interfaces;

public class OverrideDefaultMethod {

	public static void main(String[] args) {
		new MyClass();
	}
	
}

interface MyInterface {
	
	default void myDefaultMethod() {
		System.out.println("Interface method");
	}
	
}

class MyClass implements MyInterface {
	
	public void myDefaultMethod() {
		System.out.println("Class method");
	}
	
	
	public MyClass() {
		myDefaultMethod();
	}
	
}