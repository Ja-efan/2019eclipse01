package Score2;

import javax.swing.JOptionPane;

public class Score2Main {
	
	public static void main(String[] args) {
		
		Score2 sc = new Score2();
		
		sc.setName(JOptionPane.showInputDialog(null,"�̸��Է�"));
		sc.setScore(Integer.parseInt(JOptionPane.showInputDialog(null,"�����Է�")));
		
		sc.printScore();
		
		
	}

}
