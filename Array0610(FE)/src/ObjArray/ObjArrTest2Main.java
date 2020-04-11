package ObjArray;

public class ObjArrTest2Main {

	public static void main(String[] args) {
		
		ObjArrTest1[] arrs = new ObjArrTest1[2];
	
		arrs[0] = new ObjArrTest1();
		arrs[0].setName("홍길동");
		arrs[0].setScore(100);
		
		arrs[1] = new ObjArrTest1();
		arrs[1].setName("이순신");
		arrs[1].setScore(90);
		
		for(int i = 0 ; i < arrs.length ; i++) {
			System.out.println(arrs[i].getName() + "학생의 점수 : " + arrs[i].getScore());
		}
	}
}
