package ArrTest;

import javax.swing.JOptionPane;

public class Max {
	
	public static void main(String[] args) {
		
		int arrs[] = new int[5];
			
		for(int i = 0 ; i< arrs.length ; i++) {
			arrs[i] = Integer.parseInt(JOptionPane.showInputDialog(null, i +"��° ���� �Է�"));
		}
		
		//�ִ밪
		int max = 0;
		for(int i = 0 ; i< arrs.length ; i++) {
			if( arrs[i] >= max ) {
				max = arrs[i];
				
			}
		}
		JOptionPane.showMessageDialog(null, "�ִ밪 : " + max );
	}
}
