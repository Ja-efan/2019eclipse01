package whileTest;

import javax.swing.JOptionPane;

public class whileTest {
	public static void main(String[] args) {
		
		while(true) {
		String menu = 
				JOptionPane.showInputDialog(null, "�޴��Է� \n(1�� ��� ,0�� ����)");
		
			if(menu.equals("1")) {
				String name = JOptionPane.showInputDialog(null, "�̸��Է�");
				String tmpkor = JOptionPane.showInputDialog(null, "����� �Է�");
				int tmpkor_num = Integer.parseInt(tmpkor);
				String tmpeng = JOptionPane.showInputDialog(null, "����� �Է�");
				int tmpeng_num = Integer.parseInt(tmpeng);
				String tmpmath = JOptionPane.showInputDialog(null, "���м����Է�");
				int tmpmath_num = Integer.parseInt(tmpmath);
				int total = tmpkor_num + tmpeng_num + tmpmath_num ;
				int avg = total/3;
			
				String grade = "A";
				if(avg >=90) {
					grade = "A";
				}else if (avg >=80) {
					grade = "B";
				}else if (avg >=70) {
					grade = "C";
				}else if (avg >= 60) {
					grade = "D";
				}else {
					grade = "F";
				}
				
				JOptionPane.showMessageDialog(null, name+"�� ���� : "+total+". ��� :"+avg+". ���� : "+grade);
			}
		
			else if (menu.equals("0")) {
				System.exit(0);
			}
		}	
	}
}
