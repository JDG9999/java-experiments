package interfaces;

class Diamond {
	
	interface Boo {
		default void test() {
			System.out.println("Boo::test");
		}
	}
	
	interface Foo {
		default void test() {
			System.out.println("Foo::test");
		}
	}
	
	class ConcreteClass implements Boo, Foo {

		public void test() {
			Boo.super.test();
		}
		
	}

}
