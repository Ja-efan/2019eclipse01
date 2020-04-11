package Person3;

import javax.swing.JOptionPane;

public class Person3 {
	int age = 20; 
	String name = "홍길동";
	boolean isMan = true;
	
	// 나이 입력
	public void setAge() {
		String num1 = JOptionPane.showInputDialog(null,"나이(숫자만) 입력.");
		// int tempAge = Integer.parseInt(num1);
		age = Integer.parseInt(num1);
	}
	
	// 이름 입력
	public void setName() {
		String num1 = JOptionPane.showInputDialog(null, "이름입력.");
		name = num1;
	}
	
	// 성별 확인
	public void setIsMan() {
		String num1 = JOptionPane.showInputDialog(null, "성별입력 .\n남자 :0 , 여자:1");
		if(num1.contentEquals("0"))	{
			isMan = true;
		}
		else if(num1.equals("1")) {
			isMan = false;
		}
	}
	
	// 나이 출력
	public void printAge() {
		JOptionPane.showMessageDialog(null, "나이는 '"+age+"'입니다.");
	}
	
	// 이름 출력
	public void printName() {
		JOptionPane.showMessageDialog(null, "이름은 '"+name+"'입니다.");
	}
	
	// 성별 출력
	public void printIsMan() {
		if(isMan==true)
		{
			JOptionPane.showMessageDialog(null, "성별은 '남자' 입니다.");
		}
		else if (isMan==false)
		{
			JOptionPane.showMessageDialog(null, "성별은 '여자' 입니다.");
		}
	}
}
