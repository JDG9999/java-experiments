package interfaces2;

import interfaces.Fields;

public class FieldsImpl implements Fields {

	public FieldsImpl() {
		this.fieldsMethod();
	}
	
	@Override
	public void fieldsMethod() {
		// inherit a value from an interface?
		// instead I'm simply accessing a static field that's somewhere else... nothing to do with inheritance
		int newValue = Fields.value;
		System.out.println(newValue);
	}
	
	
	public static void main (String[] args) {
		new FieldsImpl();
	}
	
}
