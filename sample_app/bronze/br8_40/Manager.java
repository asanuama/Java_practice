package br8_40;

public class Manager extends Employee{

	public void disp() {
		System.out.println("Manager");
	}

	public static void main(String[] args) {
		Manager m = new Manager();
		Employee e = m;
		e.disp();
	}

}
//親の型であっても動作するのはインスタンスそのものであり、
//子クラスであるmanagerクラスのメソッドが実行された

