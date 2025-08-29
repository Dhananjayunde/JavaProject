package variables;

public class StaticVariable {
   static String s="Static keywords with variable";    // 1
   
   void method() { 
		System.out.println(s);                                                          
	} 
   static void method1() { 
	  	System.out.println(s);                                                          
	}
	public static void main(String[] args) {
		LocalVariables obj =new LocalVariables();
		obj.method(); // can't access non static method to static variable 
		StaticVariable.method1();    // 5
		method1();
	}
}
/* 1. A variable that is declared as static is called a static variable. 
   2. It cannot be local.
   3. Shared among all objects of the class.
   4. Memory allocated only once when the class loads.
   5. Access using class name (ClassName.variableName).

 

*/