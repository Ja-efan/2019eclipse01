package ArrTest;

import javax.swing.JOptionPane;

public class Max {
	
	public static void main(String[] args) {
		
		int arrs[] = new int[5];
			
		for(int i = 0 ; i< arrs.length ; i++) {
			arrs[i] = Integer.parseInt(JOptionPane.showInputDialog(null, i +"번째 숫자 입력"));
		}
		
		//최대값
		int max = 0;
		for(int i = 0 ; i< arrs.length ; i++) {
			if( arrs[i] >= max ) {
				max = arrs[i];
				
			}
		}
		JOptionPane.showMessageDialog(null, "최대값 : " + max );
	}
}
