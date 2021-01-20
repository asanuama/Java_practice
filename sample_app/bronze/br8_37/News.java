package br8_37;

public class News {
	static int id;
	String name;

	static void printInfo() {
//		System.out.println(id + ":" + name);
	}

	public static void main(String[] args) {
		News n = new News();
		n.printInfo();
	}

}
//staticメソッドからフィールドへはアクセスできない。