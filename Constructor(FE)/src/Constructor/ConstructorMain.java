package Constructor;

import javax.swing.JOptionPane;

public class ConstructorMain {
	
	public static void main(String[] args) {
		
		Constructor obj1 = new Constructor("ȫ�浿", 100);
		Constructor obj2 = new Constructor("�̼���",90);
		Constructor obj3 = new Constructor("ȫ�浿");
		Constructor obj4 = new Constructor(90);
		
		//��ü �迭 ����
		Constructor[] arrs = new Constructor[4];
		arrs[0] = obj1; // ��ü�迭 �ʱ�ȭ
		arrs[1] = obj2; // ��ü�迭 �ʱ�ȭ
		arrs[2] = obj3; // ��ü�迭 �ʱ�ȭ
		arrs[3] = obj4; // ��ü�迭 �ʱ�ȭ
		
		for(int i = 0 ; i < arrs.length ; i++) {
			System.out.println(arrs[i].getName()+"�л��� ���������� " + arrs[i].getScore() + "�� �Դϴ�.");
		}
	}

}


