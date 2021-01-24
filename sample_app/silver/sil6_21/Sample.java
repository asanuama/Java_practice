package sil6_21;

public class Sample {
	Sample(){
		System.out.println("A");
	}

	{
		System.out.println("B");
	}
}
//初期子{}はコンストラクタの実行直前に、実行される