package ArrTest;

import javax.swing.JOptionPane;

public class AvgMain {
	
	public static void main(String[] args) {
		
		int total=0;
		float avg ; 
		Avg avg1 = new Avg(JOptionPane.showInputDialog(null,"1���л� �̸��Է�"),Integer.parseInt(JOptionPane.showInputDialog(null,"1���л� �����Է�")));
		Avg avg2 = new Avg(JOptionPane.showInputDialog(null,"2���л� �̸��Է�"),Integer.parseInt(JOptionPane.showInputDialog(null,"2���л� �����Է�")));
		Avg avg3 = new Avg(JOptionPane.showInputDialog(null,"3���л� �̸��Է�"),Integer.parseInt(JOptionPane.showInputDialog(null,"3���л� �����Է�")));
		Avg avg4 = new Avg(JOptionPane.showInputDialog(null,"4���л� �̸��Է�"),Integer.parseInt(JOptionPane.showInputDialog(null,"4���л� �����Է�")));
		Avg avg5 = new Avg(JOptionPane.showInputDialog(null,"5���л� �̸��Է�"),Integer.parseInt(JOptionPane.showInputDialog(null,"5���л� �����Է�")));
		
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
		
		JOptionPane.showMessageDialog(null, "�л����� ��������� " + avg + "�Դϴ�.");
		
		
		
		
		
		
	}
}
