package updown;

import java.util.Random; // �������� ��Ű�� 
import javax.swing.JOptionPane;

public class updown {
	
	public static void main(String[] args) {
		
		int ranNum = new Random().nextInt(100);
		System.out.println("������ ���� :" + ranNum);
		for( ; ; ) { // ���ѹݺ�
			String num = JOptionPane.showInputDialog(null,"UP DOWN GAME. \n 1~100���� ���� �� �ϳ� �Է�");
			int ans = Integer.parseInt(num);
			
			if (ans>ranNum) {
				JOptionPane.showMessageDialog(null, "DOWN");
			}else if(ans<ranNum) {
				JOptionPane.showMessageDialog(null, "UP");
			}else if(ans==ranNum) {
				JOptionPane.showMessageDialog(null, "�����մϴ�!");
				System.exit(0);
			}
		}
	}
}
