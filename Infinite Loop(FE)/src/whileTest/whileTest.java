package whileTest;

import javax.swing.JOptionPane;

public class whileTest {

	public static void main(String[] args){
		
		while(true) {  // ���ѹݺ�
			
			String menu = JOptionPane.showInputDialog(null,"�޴��Է� \n (1�� ���, 0�� ����");
			
			if(menu.equals("1")){
				//�л��� ������ �Է¹޾� ���� ������ ���
				String name = JOptionPane.showInputDialog(null, "�̸��Է�");
				int kor = Integer.parseInt(JOptionPane.showInputDialog(null, "����� �Է�"));
				int eng = Integer.parseInt(JOptionPane.showInputDialog(null, "����� �Է�"));
				int math = Integer.parseInt(JOptionPane.showInputDialog(null, "���м��� �Է�"));
				
				int total = kor + eng + math ;
				int ave = total / 3 ;
				
				String grade = "A";
				if (ave >= 90) {
					grade = "A";
				}else if (ave >=80) {
					grade = "B";
				}else if (ave >=70) {
					grade = "C";
				}else if (ave >=60) {
					grade = "D";
				}else {
					grade = "F";
				}
				JOptionPane.showMessageDialog(null, name + "�� ���� : " + total + ", ��� : " + ave + ", ����: " + grade);
			}
			else if(menu.equals("0")) {
				System.exit(0); // ���α׷� ����
			}
		}
	}
}
