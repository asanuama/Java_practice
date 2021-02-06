package br2_7;

public class Main {

	public static void main(String[] args) {
		byte b1 = 8;
		short s1 = b1; //暗黙の型変換
		short s2 = 264;
		byte b2 = (byte)s2; //明示的な型変換
		System.out.println(b2);
		int i = (int)5.7; //明示的な型変換
		System.out.println(i);
	}

	//明示的な型変換　()をつけて、ビット落ちすることがわかっていることを明示する
	//暗黙の型変換　byteからintなどのように、広くする変換

}
