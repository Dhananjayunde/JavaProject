package variables;  // package 

public class LocalVariables {     

	void method() {
		int a=10; //Local variable declare inside method , method declare inside class
		System.out.println(a);                                                          
	} 
	public static void main(String[] args) {
		LocalVariables obj =new LocalVariables();
		obj.method();
	}
} 

/*
A variable declared inside a method is called a local variable. or
A variable declared inside the body of the method is called local variable. 
You can use this variable only within that method and the other methods in the class aren't even aware that the variable exists.
1.	Available only inside the method where it is declared.
2.	Must be initialized before use.
3.	Cannot be static.
*/