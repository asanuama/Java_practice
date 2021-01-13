package sample_app;


public class Main {
    public static void main(String[] args) {
    	Station s = new Station("Santa");
    	s.setName("Santa Clara");
    	s.printName();
    }
}

//Exception in thread "main" java.lang.Error: Unresolved compilation problem:
//	コンストラクター Station() は未定義です
//	at sample_app.Main.main(Main.java:6)　（引数を入力していない場合）