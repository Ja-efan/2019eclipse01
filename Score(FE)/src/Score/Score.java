package Score;
import javax.swing.JOptionPane;

public class Score {
	
	String name; // �л��̸�
	String score; // �л� ���� 
	
	public void setName() {
		name = JOptionPane.showInputDialog(null,"�̸��Է�");
	}
	
	public void setScore() {
		String tScore = JOptionPane.showInputDialog(null,"�����Է�");
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
		JOptionPane.showMessageDialog(null,name+ "�� ������ '" + score + "' �Դϴ�.");
		
	}

}
