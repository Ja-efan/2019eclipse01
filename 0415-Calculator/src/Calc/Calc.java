 package Calc;

import javax.swing.JOptionPane;

public class Calc {
	
	int num1;
	int num2;
	String sym;
	int result;
	
	public void setNum1() {
		String temp1 = JOptionPane.showInputDialog(null, "ù ��° ���� �Է�.");
		// int num = Integer.parseInt(temp1);
		num1 = Integer.parseInt(temp1);
	}
	public void setNum2() {
		String temp1 = JOptionPane.showInputDialog(null, "�� ��° ���� �Է�.");
		// int num = Integer.parseInt(temp1);
		num2 = Integer.parseInt(temp1);
	}
	
	public void setSym() {
		sym = JOptionPane.showInputDialog(null, "������ �Է�.\n (+:���ϱ�, -:����, *:���ϱ�, /:������, %:������)");
		// sym = tempSym;
	}
	
	public void setResult() {
		if(sym.equals("+")) {
			result = num1 + num2;
			JOptionPane.showMessageDialog(null, num1 + sym + num2 +"�����" + result + "�Դϴ�.");
		}
		else if (sym.equals("-")) {
			result = num1 - num2;
			JOptionPane.showMessageDialog(null, num1 + sym + num2 +"�����" + result + "�Դϴ�.");
		}
		else if (sym.equals("*")) {
			result = num1 * num2;
			JOptionPane.showMessageDialog(null, num1 + sym + num2 +"�����" + result + "�Դϴ�.");
		}
		else if (sym.equals("/")) {
			result = num1 / num2;
			JOptionPane.showMessageDialog(null, num1 + sym + num2 +"�����" + result + "�Դϴ�.");
			
		}
		else if (sym.equals("%")) {
			result = num1 % num2;
			JOptionPane.showMessageDialog(null, num1 + sym + num2 +"�����" + result + "�Դϴ�.");
		}
		else {
			JOptionPane.showInputDialog(null, "��Ȯ�� �����ڸ� �Է��� �ּ���.");
		}
	}
	
	/*public void printResult() {
		JOptionPane.showMessageDialog(null, num1 + sym + num2 +"�����" + result + "�Դϴ�.");
	}*/
	public static void main(String[] args)
	{
		Calc c1 = new Calc();
		
		c1.setNum1();
		c1.setNum2();
		c1.setSym();
		
		c1.setResult();
	}
}

