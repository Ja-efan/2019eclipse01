package Student3;

import javax.swing.JOptionPane;

public class Student3 {
	String no;
	String name;
	int kor;
	int eng;
	int math;
	
	public void setNo() {
		// String tempNo = JOptionPane.showInputDialog(null, "�й��Է�.");
		no = JOptionPane.showInputDialog(null, "�й��Է�.");
	}
	
	public void setName() {
		String tempName = JOptionPane.showInputDialog(null, "�̸��Է�.");
		name = tempName;
	}
	
	public void setKor() {
		String num1 = JOptionPane.showInputDialog(null, "���� ���� �Է�.(���ڸ�)");
		// int tempKor = Integer.parseInt(num1);
		kor = Integer.parseInt(num1);
	}
	
	public void setEng() {
		 String num1 = JOptionPane.showInputDialog(null, "���� ���� �Է�.(���ڸ�)");
		// int tempEng = Integer.parseInt(num1);
		 eng = Integer.parseInt(num1);
	}
	
	public void setMath() {
		String num1 = JOptionPane.showInputDialog(null, "���� ���� �Է�.(���ڸ�)");
		// int tempMath = Integer.parseInt(num1);
		math = Integer.parseInt(num1);
	}
	
	public void printTotal() {
		int total = kor + eng + math;
		JOptionPane.showMessageDialog(null, "�� �� : "+ total);
	}
	
	public void printAve() {
		int ave = (kor + eng + math)/3;
		JOptionPane.showMessageDialog(null, "������� :"+ave);
	}
}
