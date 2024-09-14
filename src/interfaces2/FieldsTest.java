package interfaces2;

import interfaces.Fields;

public class FieldsTest {
	
	public void fieldsMethod() {
		int newValue = Fields.value; // I'm accessing it from another package... implying that is public by default
		Fields.value = 6;
		System.out.println(newValue);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
