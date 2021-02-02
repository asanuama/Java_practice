package br8_13;

public class Main {

	public static void main(String[] args) {
//		for (int i = 0; ++i < 5;)
//			System.out.print(i + " ");
		int num = 1234567890;
		int max = 20000000;
		int result = 0;
		for (int i = 1; i <= max ;i++) {
			if (num%i == 0 ) {
				result += i;
			}
		}
		System.out.println(result);
	}

}
