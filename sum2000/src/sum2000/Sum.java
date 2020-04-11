package sum2000;

import javax.swing.JOptionPane;

public class Sum {
	
	public static void main(String[] args) {
		
		int sum  = 0;
		
		for (int i = 0 ; i <= 2000 ; i+=2) {
			sum = sum + i ;
		}
		JOptionPane.showMessageDialog(null, "1부터 2000까지 짝수의 합계 :" + sum );
			
		
		
	}

}
