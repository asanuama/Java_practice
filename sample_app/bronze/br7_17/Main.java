package br7_17;

public class Main {

	public static void main(String[] args) {
		B b = new B();
		A a = b; //アップキャスト
		C c = (C) a;
	}

}
//明示的に()をつけてキャストしているためコンパイルエラーは出ないが
//実際に動作するのはB型のインスタンスでありc型としての差分を持たないため、実行時例外がスローされる