package sil6_15;

public class Sample{

	public void method(int num) {
	if (num < 0 ) return;
	System.out.println("A");
	return;
	//System.out.println("B");
	}
}
//return後にコードを書くと到達不能コードとなりエラーとなる