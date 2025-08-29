package variables;

public class InstanceVariable {
int a=10;  // instance variable declare outside method inside class 
	void method() { //<--open method block
		System.out.println(a);                                                          
	} //<--- closed method block
	public static void main(String[] args) {
		LocalVariables obj =new LocalVariables();
		obj.method();
	}
}

/*
 *   A variable declared inside the class but outside the body of the method, is called an instance variable. It is not declared as static.
 
 	1. Each object gets its own copy.
    2.Instance variables belong to an object (not the class itself). When we create multiple objects of the same class, each object gets a separate copy of the instance variables.
    3.Has default values (e.g., int → 0, String → null).
    4.Not shared among multiple objects.
    5. Each object maintains its own unique copy of the instance variables. Changes made to one object's instance variable do not affect the instance variables of another object.

 */