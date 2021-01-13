package sample_app;

public class Station {
	private String name;

	public Station(String name){
		this.name = name;
	}

	public void setName(String name){
		this.name = name;
	}

	public void printName(){
		System.out.println(name);
	}
}
