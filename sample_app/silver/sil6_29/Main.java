package sil6_29;

public class Main {

	public static void main(String[] args) {
		Sample s = new Sample(10);
		modify(s.num);
		System.out.println(s.num);
	}

	private static void modify(int num) {
		num *= 2;
	}

}

//modifyメソッドのnumとSampleクラスのセッターのnumは別物。s.numすると、コンストラクタに代入した値である10が出力される
