package variables;

public class StaticVariable {
   static String s="Static keywords with variable"; 
   
   void method() { 
		System.out.println(s);                                                          
	} 
   static void method1() { 
		System.out.println(s);                                                          
	}
	public static void main(String[] args) {
		LocalVariables obj =new LocalVariables();
		obj.method(); // can't access non static method to static variable 
		StaticVariable.method1();
		method1();
	}
}
