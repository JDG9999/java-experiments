package keywords.super_;

public class ChildClass extends ParentClass {
	
	public ChildClass() {
		System.out.println(mySuperMethod());
	}
	
	public int mySuperMethod() {
		return super.myValue;
	}
	
	public int myMethod() {
		return myValue;
	}
	
	public static void main(String[] args) {
		new ChildClass();
	}

}
