package ObjArray;

public class ObjArrTest1Main {
	
	public static void main(String[] args) {
		
		ObjArrTest1 obj1 = new ObjArrTest1(); // ��ü���� 1
		
		obj1.setName("ȫ�浿");
		obj1.setScore(100);
		
		ObjArrTest1 obj2 = new ObjArrTest1(); // ��ü���� 2
		obj2.setName("�̼���");
		obj2.setScore(90);
		
		ObjArrTest1[] arrs = new ObjArrTest1[2]; // ��ü�迭 ���� �� �ʱ�ȭ
		
		arrs[0] = obj1;
		arrs[1] = obj2;
		
		for(int i =0 ; i<arrs.length; i++) {
			System.out.println(arrs[i].getName() + " �л��� ��������: " + arrs[i].getScore() );
		} 
		
		
		
		
		
	}

}
