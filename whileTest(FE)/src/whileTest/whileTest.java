package whileTest;

import javax.swing.JOptionPane;

public class whileTest {
	public static void main(String[] args) {
		
		while(true) {
		String menu = 
				JOptionPane.showInputDialog(null, "메뉴입력 \n(1번 등록 ,0번 종료)");
		
			if(menu.equals("1")) {
				String name = JOptionPane.showInputDialog(null, "이름입력");
				String tmpkor = JOptionPane.showInputDialog(null, "국어성적 입력");
				int tmpkor_num = Integer.parseInt(tmpkor);
				String tmpeng = JOptionPane.showInputDialog(null, "영어성적 입력");
				int tmpeng_num = Integer.parseInt(tmpeng);
				String tmpmath = JOptionPane.showInputDialog(null, "수학성적입력");
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
				
				JOptionPane.showMessageDialog(null, name+"의 총점 : "+total+". 평균 :"+avg+". 학점 : "+grade);
			}
		
			else if (menu.equals("0")) {
				System.exit(0);
			}
		}	
	}
}
