package passbyvalue;

public class PassByValue {
	
	public static void main(String[] args) {
		
//      TRYING TO SWAP A PRIMITIVE - doesn't work!	
		
//		int a = 2;
//		int b = 3;
//		swap(a, b);
//		System.out.println("a: " + a);
//		System.out.println("b: " + b);
		
//		MODIFYING VALUES PRIMITIVES & OBJECTS
		
		MyClass myObject = new MyClass();
		myObject.increment(myObject.a); // doesn't modify primitive
		myObject.increment(myObject.c); // DOES modify array
		myObject.increment(myObject.d); // DOES modify primitive inside object
		
		System.out.println("a: " + myObject.a); 

		System.out.println("c: " + myObject.c[0] + "," + myObject.c[1]);
		System.out.println("a: " + myObject.d.age);

// 		STACK OVERFLOW EXAMPLE - REASSIGN OBJECT
		
		Dog aDog = new Dog("Max");
	    Dog oldDog = aDog;

	    // we pass the object to foo
	    reassign(aDog);
	    // aDog variable is still pointing to the "Max" dog when foo(...) returns
	    aDog.getName().equals("Max"); // true
	    aDog.getName().equals("Fifi"); // false
	    System.out.println(aDog == oldDog); // true
		
// 		CHANGE JUST THE NAME?
	    
	    rename(aDog);
	    System.out.println(aDog.getName());
	    
	}
	
	static void swap(int x, int y) {
		int temp = x;
		x = y;
		y = temp;
	}
	
	static void reassign(Dog d) {
	    d.getName().equals("Max"); // true
	    // change d inside of reassign() to point to a new Dog instance "Fifi"
	    d = new Dog("Fifi");
	    d.getName().equals("Fifi"); // true
	}
	
	static void rename(Dog d) {
		d.setName("Woof");
	}

}

class MyClass {
	
	int a = 2;
	int b = 3;
	
	int[] c = {4,5};
	
	Dog d = new Dog();
	
	void swap(int x, int y) {
		int temp = x;
		x = y;
		y = temp;
	}
	
	void increment(int x) {
		x++;
	}
	
	void increment(int[] x) {
		x[1]++;
	}
	
	void increment(Dog x) {
		x.age++;
	}
	
}

class Dog {
	
	int age = 6;
	String name = "";
	
	Dog() {
		
	}
	
	Dog(String name) {
		this.name = name;
	}
	
	String getName() {
		return this.name;
	}
	
	void setName(String name) {
		this.name = name;
	}
	
}


