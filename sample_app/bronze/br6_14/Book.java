package br6_14;

public class Book {
	private String title;
	private int price;

	public Book(){
		this("none",0);
	}
//	this()　コンストラクタから、オーバーロードした別のコンストラクタを呼び出す

	public Book(String title,int price){
		this.title = title;
		this.price = price;
	}

	public void print() {
		System.out.println(title +","+ price);
	}
}
