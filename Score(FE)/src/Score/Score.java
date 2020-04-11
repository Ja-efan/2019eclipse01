package Score;
import javax.swing.JOptionPane;

public class Score {
	
	String name; // 학생이름
	String score; // 학생 학점 
	
	public void setName() {
		name = JOptionPane.showInputDialog(null,"이름입력");
	}
	
	public void setScore() {
		String tScore = JOptionPane.showInputDialog(null,"점수입력");
		int tmpScore = Integer.parseInt(tScore);
		
		if (tmpScore >= 90) {
			score = "A";
		}else if(tmpScore >= 80) {
			score = "B";
		}else if(tmpScore >= 70) {
			score = "C";
		}else if(tmpScore >= 60) {
			score = "D";
		}else {
			score = "F";
		}
	}
	
	public void printScore() {
		JOptionPane.showMessageDialog(null,name+ "의 학점은 '" + score + "' 입니다.");
		
	}

}
