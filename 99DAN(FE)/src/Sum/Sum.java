package Sum;

import javax.swing.JOptionPane;

public class Sum {
	
	public static void main(String[] args) {
		
		int dan;
		int b ;
		int sum = 0;
		
		dan = Integer.parseInt(JOptionPane.showInputDialog(null,"합계를 구할 단 입력"));
		
		for(b=1 ; b<=9 ; b++) {
			sum = sum+(dan*b);
		}
		
		JOptionPane.showMessageDialog(null, dan + "단의 총 합은 " + sum + "입니다.");
	}

}
