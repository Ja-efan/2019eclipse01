package Person3;

import javax.swing.JOptionPane;

public class Person3 {
	int age = 20; 
	String name = "ȫ�浿";
	boolean isMan = true;
	
	// ���� �Է�
	public void setAge() {
		String num1 = JOptionPane.showInputDialog(null,"����(���ڸ�) �Է�.");
		// int tempAge = Integer.parseInt(num1);
		age = Integer.parseInt(num1);
	}
	
	// �̸� �Է�
	public void setName() {
		String num1 = JOptionPane.showInputDialog(null, "�̸��Է�.");
		name = num1;
	}
	
	// ���� Ȯ��
	public void setIsMan() {
		String num1 = JOptionPane.showInputDialog(null, "�����Է� .\n���� :0 , ����:1");
		if(num1.contentEquals("0"))	{
			isMan = true;
		}
		else if(num1.equals("1")) {
			isMan = false;
		}
	}
	
	// ���� ���
	public void printAge() {
		JOptionPane.showMessageDialog(null, "���̴� '"+age+"'�Դϴ�.");
	}
	
	// �̸� ���
	public void printName() {
		JOptionPane.showMessageDialog(null, "�̸��� '"+name+"'�Դϴ�.");
	}
	
	// ���� ���
	public void printIsMan() {
		if(isMan==true)
		{
			JOptionPane.showMessageDialog(null, "������ '����' �Դϴ�.");
		}
		else if (isMan==false)
		{
			JOptionPane.showMessageDialog(null, "������ '����' �Դϴ�.");
		}
	}
}
