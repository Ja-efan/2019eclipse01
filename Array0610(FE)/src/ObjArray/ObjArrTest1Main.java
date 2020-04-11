package ObjArray;

public class ObjArrTest1Main {
	
	public static void main(String[] args) {
		
		ObjArrTest1 obj1 = new ObjArrTest1(); // 객체생성 1
		
		obj1.setName("홍길동");
		obj1.setScore(100);
		
		ObjArrTest1 obj2 = new ObjArrTest1(); // 객체생성 2
		obj2.setName("이순신");
		obj2.setScore(90);
		
		ObjArrTest1[] arrs = new ObjArrTest1[2]; // 객체배열 생성 및 초기화
		
		arrs[0] = obj1;
		arrs[1] = obj2;
		
		for(int i =0 ; i<arrs.length; i++) {
			System.out.println(arrs[i].getName() + " 학생의 영어점수: " + arrs[i].getScore() );
		} 
		
		
		
		
		
	}

}
