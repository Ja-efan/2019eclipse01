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
			JOptionPane.showMessageDialog(null, "A�����Դϴ�.");
		}else if(score >= 80) {
			JOptionPane.showMessageDialog(null, "B�����Դϴ�.");
		}else if(score >= 70) {
			JOptionPane.showMessageDialog(null, "C�����Դϴ�.");
		}else if(score >= 60) {
			JOptionPane.showMessageDialog(null, "D�����Դϴ�.");
		}else {
			JOptionPane.showMessageDialog(null, "F�����Դϴ�.");
		}
		
	}
}
