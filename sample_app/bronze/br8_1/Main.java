package br8_1;

public class Main {

	public static void main(String[] args) {
		for (int i = 0; i < 5; i++ ) {
			for (i = 5; i < 10; i++) {
				System.out.println(i);
			}
		}
	}
}
//外側のforも内側のforも両方同じ「i」というカウンタを使っているため「56789」が一度だけ出力される