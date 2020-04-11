package Constructor;

public class Constructor {
	
	String name ;
	int score ;
	
	public Constructor(String name) { // 持失切1
		this.name = name;
		this.score = 100;
	}
	public Constructor(int score) { // 持失切 2
		this.name = "畠掩疑";
		this.score = score;
	}
	public Constructor(String name, int score) { // 持失切 3
		this.name = name;
		this.score = score; 
	}
	
	//public void setName(String tmpName) { this.name = tmpName; }
	public String getName() { return name; }
	//public void setScore(int tmpScore) { this.score = tmpScore; }
	public int getScore () { return score; }

}

