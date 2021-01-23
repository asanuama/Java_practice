package sil6_12;

public class Main {

	public static void main(String[] args) {
		Sample s = new Sample();
		double result1 = s.divide(10,2);
		float result2 = s.divide(10,2);
		System.out.println(result1);
		System.out.println(result2);
	}

}
//メソッドreturn値の受け取りは、同一もしくは互換性のある型にする
//doubleは64bitの浮動小数点を表すことができ、floatは32bitであるためdouble型の変数に代入することができる