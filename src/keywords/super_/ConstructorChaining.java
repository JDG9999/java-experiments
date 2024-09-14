package keywords.super_;

public class ConstructorChaining {

	public static void main(String[] args) {
		new MyClass();
	}
}

class MyClass extends MySuperClass {
	public MyClass() {
		System.out.println("My class");
	}
}

class MySuperClass {
	public MySuperClass() {
		System.out.println("My superclass");
	}
}
