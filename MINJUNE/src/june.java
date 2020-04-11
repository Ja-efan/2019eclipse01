import java.util.Random;
import javax.swing.JOptionPane;
public class june{
	public static void main(String[] args) {
		int ranNum = new Random().nextInt(100);
		System.out.println("생성된 난수 :" + ranNum);
		for(;;) {
			String num = JOptionPane.showInputDialog(null, "UP , DOWN게임, \n 1~100까지 숫자입력");
			int aaa = Integer.parseInt(num);
			
			if (ranNum>aaa) {
				JOptionPane.showMessageDialog(null, "UP");
			}else if (aaa>ranNum) {
				JOptionPane.showMessageDialog(null, "DOWN");
			}else if (aaa==ranNum) {
				JOptionPane.showMessageDialog(null, "축하합니다.");
			}
			
		}
	}
}
