package updown;

import java.util.Random; // 난수생성 패키지 
import javax.swing.JOptionPane;

public class updown {
	
	public static void main(String[] args) {
		
		int ranNum = new Random().nextInt(100);
		System.out.println("생성된 난수 :" + ranNum);
		for( ; ; ) { // 무한반복
			String num = JOptionPane.showInputDialog(null,"UP DOWN GAME. \n 1~100까지 숫자 중 하나 입력");
			int ans = Integer.parseInt(num);
			
			if (ans>ranNum) {
				JOptionPane.showMessageDialog(null, "DOWN");
			}else if(ans<ranNum) {
				JOptionPane.showMessageDialog(null, "UP");
			}else if(ans==ranNum) {
				JOptionPane.showMessageDialog(null, "축하합니다!");
				System.exit(0);
			}
		}
	}
}
