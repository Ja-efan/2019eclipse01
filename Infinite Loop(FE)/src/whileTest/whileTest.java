package whileTest;

import javax.swing.JOptionPane;

public class whileTest {

	public static void main(String[] args){
		
		while(true) {  // 무한반복
			
			String menu = JOptionPane.showInputDialog(null,"메뉴입력 \n (1번 등록, 0번 종료");
			
			if(menu.equals("1")){
				//학생의 정보를 입력받아 관련 정보를 출력
				String name = JOptionPane.showInputDialog(null, "이름입력");
				int kor = Integer.parseInt(JOptionPane.showInputDialog(null, "국어성적 입력"));
				int eng = Integer.parseInt(JOptionPane.showInputDialog(null, "영어성적 입력"));
				int math = Integer.parseInt(JOptionPane.showInputDialog(null, "수학성적 입력"));
				
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
				JOptionPane.showMessageDialog(null, name + "의 총점 : " + total + ", 평균 : " + ave + ", 학점: " + grade);
			}
			else if(menu.equals("0")) {
				System.exit(0); // 프로그램 종료
			}
		}
	}
}
