package Score2;

import javax.swing.JOptionPane;

public class Score2Main {
	
	public static void main(String[] args) {
		
		Score2 sc = new Score2();
		
		sc.setName(JOptionPane.showInputDialog(null,"이름입력"));
		sc.setScore(Integer.parseInt(JOptionPane.showInputDialog(null,"점수입력")));
		
		sc.printScore();
		
		
	}

}
