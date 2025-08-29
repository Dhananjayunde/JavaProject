package variables;  // package 

public class LocalVariables { // <- Open class block-->                 // class classname

	void method() { //<--open method block
		int a=10; //Local variable declare inside method , method declare inside class
		System.out.println(a);                                                          
	} //<--- closed method block
	public static void main(String[] args) {
		LocalVariables obj =new LocalVariables();
		obj.method();
	}
} //<--- // <- close class block-->
