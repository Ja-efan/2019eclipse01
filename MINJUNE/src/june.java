import java.util.Random;
import javax.swing.JOptionPane;
public class june{
	public static void main(String[] args) {
		int ranNum = new Random().nextInt(100);
		System.out.println("������ ���� :" + ranNum);
		for(;;) {
			String num = JOptionPane.showInputDialog(null, "UP , DOWN����, \n 1~100���� �����Է�");
			int aaa = Integer.parseInt(num);
			
			if (ranNum>aaa) {
				JOptionPane.showMessageDialog(null, "UP");
			}else if (aaa>ranNum) {
				JOptionPane.showMessageDialog(null, "DOWN");
			}else if (aaa==ranNum) {
				JOptionPane.showMessageDialog(null, "�����մϴ�.");
			}
			
		}
	}
}
