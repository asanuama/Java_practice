package br8_44;

public class SubClass extends SuperClass{
	private int num = 20;
	public static void main(String[] args) {
		SubClass sub  = new SubClass();
		sub.test();
	}
}
//testメソッドは、スーパクラスのnumを参照する