package ArrTest;

import javax.swing.JOptionPane;

public class AvgMain {
	
	public static void main(String[] args) {
		
		int total=0;
		float avg ; 
		Avg avg1 = new Avg(JOptionPane.showInputDialog(null,"1번학생 이름입력"),Integer.parseInt(JOptionPane.showInputDialog(null,"1번학생 점수입력")));
		Avg avg2 = new Avg(JOptionPane.showInputDialog(null,"2번학생 이름입력"),Integer.parseInt(JOptionPane.showInputDialog(null,"2번학생 점수입력")));
		Avg avg3 = new Avg(JOptionPane.showInputDialog(null,"3번학생 이름입력"),Integer.parseInt(JOptionPane.showInputDialog(null,"3번학생 점수입력")));
		Avg avg4 = new Avg(JOptionPane.showInputDialog(null,"4번학생 이름입력"),Integer.parseInt(JOptionPane.showInputDialog(null,"4번학생 점수입력")));
		Avg avg5 = new Avg(JOptionPane.showInputDialog(null,"5번학생 이름입력"),Integer.parseInt(JOptionPane.showInputDialog(null,"5번학생 점수입력")));
		
		Avg[] arrs = new Avg[5];
		
		arrs[0] = avg1;
		arrs[1] = avg2;
		arrs[2] = avg3;
		arrs[3] = avg4;
		arrs[4] = avg5;
		
		for(int i = 0 ; i < arrs.length ; i++) {
			total = total + arrs[i].score ;
		}
		
		avg = (float)total/5 ;
		
		JOptionPane.showMessageDialog(null, "학생들의 평균점수는 " + avg + "입니다.");
		
		
		
		
		
		
	}
}
