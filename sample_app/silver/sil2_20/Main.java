package sil2_20;

public class Main {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("abcde");
		System.out.println(sb.capacity());

	}

}
//StringBuilder 保持する文字列＋16文字文の余分なバッファを持っている。結果「21」