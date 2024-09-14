package generics;

public class Generics {

	public static void main(String[] args) {		
		
	}
	
}

interface Container<T> {
	void set(T a);
	T get();
}

class Store<T> implements Container<T> {
	private T a;
	
	public void set(T a) {
		this.a = a;
	}
	
	public T get() {
		return a;
	}

}
