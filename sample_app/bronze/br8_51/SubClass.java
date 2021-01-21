package br8_51;

public class SubClass extends SuperClass{
	public void print() {
		System.out.println("sub");
	}

	public static void main(String[] args) {
		SuperClass s = new SuperClass();
		SubClass s2 = (SubClass) s;
		s2.print();
	}
}
