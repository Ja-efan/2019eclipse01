package Student3;

import javax.swing.JOptionPane;

public class Student3 {
	String no;
	String name;
	int kor;
	int eng;
	int math;
	
	public void setNo() {
		// String tempNo = JOptionPane.showInputDialog(null, "학번입력.");
		no = JOptionPane.showInputDialog(null, "학번입력.");
	}
	
	public void setName() {
		String tempName = JOptionPane.showInputDialog(null, "이름입력.");
		name = tempName;
	}
	
	public void setKor() {
		String num1 = JOptionPane.showInputDialog(null, "국어 성적 입력.(숫자만)");
		// int tempKor = Integer.parseInt(num1);
		kor = Integer.parseInt(num1);
	}
	
	public void setEng() {
		 String num1 = JOptionPane.showInputDialog(null, "영어 성적 입력.(숫자만)");
		// int tempEng = Integer.parseInt(num1);
		 eng = Integer.parseInt(num1);
	}
	
	public void setMath() {
		String num1 = JOptionPane.showInputDialog(null, "수학 성적 입력.(숫자만)");
		// int tempMath = Integer.parseInt(num1);
		math = Integer.parseInt(num1);
	}
	
	public void printTotal() {
		int total = kor + eng + math;
		JOptionPane.showMessageDialog(null, "총 합 : "+ total);
	}
	
	public void printAve() {
		int ave = (kor + eng + math)/3;
		JOptionPane.showMessageDialog(null, "평균점수 :"+ave);
	}
}
