package Sum;

import javax.swing.JOptionPane;

public class Sum {
	
	public static void main(String[] args) {
		
		int dan;
		int b ;
		int sum = 0;
		
		dan = Integer.parseInt(JOptionPane.showInputDialog(null,"�հ踦 ���� �� �Է�"));
		
		for(b=1 ; b<=9 ; b++) {
			sum = sum+(dan*b);
		}
		
		JOptionPane.showMessageDialog(null, dan + "���� �� ���� " + sum + "�Դϴ�.");
	}

}
