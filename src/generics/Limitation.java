package generics;

public class Limitation<E> {
	
    public void myMethod(Object item) {
        if (item instanceof E) {  //Compiler error
            System.out.println("Whatever");
        }
        E item2 = new E();   //Compiler error
        E[] iArray = new E[10]; //Compiler error
    }
    
}


