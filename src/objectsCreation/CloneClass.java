package objectsCreation;

public class CloneClass {
	void iplMatch() {
		System.out.println("indian premium league");
	}
public static void main(String[] args) {
	CloneClass obj1=new CloneClass();
	CloneClass obj2=(CloneClass) obj1.clone();
}
}
