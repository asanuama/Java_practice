package br8_11;

public class Main {

	public static void main(String[] args) {
		int a = 12;
		int b= 8;
		if(a >= 10 || b >= 10) {
			a /= 2; //6
			b += a; //14
		} else
			a /= 2;
			b += a; //20
		System.out.println(a + ":" + b);
	}
}

//11行目、elseの後の{}省略されているためelse文は12行目までを読み、
//本ケースではどちらにしても13行目が処理される
