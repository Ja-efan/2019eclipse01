package Constructor;

import javax.swing.JOptionPane;

public class ConstructorMain {
	
	public static void main(String[] args) {
		
		Constructor obj1 = new Constructor("홍길동", 100);
		Constructor obj2 = new Constructor("이순신",90);
		Constructor obj3 = new Constructor("홍길동");
		Constructor obj4 = new Constructor(90);
		
		//객체 배열 생성
		Constructor[] arrs = new Constructor[4];
		arrs[0] = obj1; // 객체배열 초기화
		arrs[1] = obj2; // 객체배열 초기화
		arrs[2] = obj3; // 객체배열 초기화
		arrs[3] = obj4; // 객체배열 초기화
		
		for(int i = 0 ; i < arrs.length ; i++) {
			System.out.println(arrs[i].getName()+"학생의 영어점수는 " + arrs[i].getScore() + "점 입니다.");
		}
	}

}


