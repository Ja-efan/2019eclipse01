package Score2;

import javax.swing.JOptionPane;

public class Score2 {

	String name;
	int score;
	
	public void setName(String paramName) {
		name = paramName;
	}
	
	public void setScore(int paramScore) {
		score = paramScore;
	}
	
	public void printScore() {
		if (score >= 90) {
			JOptionPane.showMessageDialog(null, "A학점입니다.");
		}else if(score >= 80) {
			JOptionPane.showMessageDialog(null, "B학점입니다.");
		}else if(score >= 70) {
			JOptionPane.showMessageDialog(null, "C학점입니다.");
		}else if(score >= 60) {
			JOptionPane.showMessageDialog(null, "D학점입니다.");
		}else {
			JOptionPane.showMessageDialog(null, "F학점입니다.");
		}
		
	}
}
