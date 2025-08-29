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
