package overload;

public class SameNameDifferentReturnType {

	// It's not possible to overload changing the return type. 
	// This class shows compilation errors
	
	public static void main(String[] args) {
		
	}
	
	
	public String myOverloadedMethod() {
		return "";
	}
	
	public int myOverloadedMethod() {
		return 0;
	}
	
	public String myOverloadedMethodWithArgs(int n) {
		return "";
	}
	
	public int myOverloadedMethodWithArgs(int n) {
		return 0;
	}

}
