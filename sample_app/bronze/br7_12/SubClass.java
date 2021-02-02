package br7_12;

public class SubClass extends SuperClass{
	public void sample() {
		super.sample();
		System.out.println("sub");
	}
}
//super.sample(); 親クラスのsampleメソッドを呼び出している