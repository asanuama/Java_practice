package br5_8;

public class Main {
	public static void main(String[] args) {
//		Parents p = new Child();
//		p.method("Child");
	}

}

//Exception in thread "main" java.lang.Error: Unresolved compilation problems:
//	型の不一致: Child から Parents には変換できません
//	型 Parents のメソッド method() は引数 (String) に適用できません
//	at br5_8.Main.main(Main.java:5)
//サブクラスを抽象化してスーパクラス型として扱った場合、スーパクラスの定義と共通しないサブクラス独自の
//メソッドは無視され存在しないものとして扱われる。
//存在しないとみなされているメソッドを実行しようとしているためエラー
