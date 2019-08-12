package session5;

public class Child extends Parent {
	Child(String name) {
		this.name=name;
	}
	@Override
	void PrintName() {
		System.out.println("Child name is "+name);
	}
	public static void main(String [] args) {
		Child c=new Child("Jimmy");
		c.PrintName();
	}

}
