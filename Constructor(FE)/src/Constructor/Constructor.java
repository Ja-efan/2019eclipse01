package Constructor;

public class Constructor {
	
	String name ;
	int score ;
	
	public Constructor(String name) { // ������1
		this.name = name;
		this.score = 100;
	}
	public Constructor(int score) { // ������ 2
		this.name = "ȫ�浿";
		this.score = score;
	}
	public Constructor(String name, int score) { // ������ 3
		this.name = name;
		this.score = score; 
	}
	
	//public void setName(String tmpName) { this.name = tmpName; }
	public String getName() { return name; }
	//public void setScore(int tmpScore) { this.score = tmpScore; }
	public int getScore () { return score; }

}

