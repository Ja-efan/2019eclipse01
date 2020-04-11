 package Calc;

import javax.swing.JOptionPane;

public class Calc {
	
	int num1;
	int num2;
	String sym;
	int result;
	
	public void setNum1() {
		String temp1 = JOptionPane.showInputDialog(null, "첫 번째 숫자 입력.");
		// int num = Integer.parseInt(temp1);
		num1 = Integer.parseInt(temp1);
	}
	public void setNum2() {
		String temp1 = JOptionPane.showInputDialog(null, "두 번째 숫자 입력.");
		// int num = Integer.parseInt(temp1);
		num2 = Integer.parseInt(temp1);
	}
	
	public void setSym() {
		sym = JOptionPane.showInputDialog(null, "연산자 입력.\n (+:더하기, -:빼기, *:곱하기, /:나누기, %:나머지)");
		// sym = tempSym;
	}
	
	public void setResult() {
		if(sym.equals("+")) {
			result = num1 + num2;
			JOptionPane.showMessageDialog(null, num1 + sym + num2 +"결과는" + result + "입니다.");
		}
		else if (sym.equals("-")) {
			result = num1 - num2;
			JOptionPane.showMessageDialog(null, num1 + sym + num2 +"결과는" + result + "입니다.");
		}
		else if (sym.equals("*")) {
			result = num1 * num2;
			JOptionPane.showMessageDialog(null, num1 + sym + num2 +"결과는" + result + "입니다.");
		}
		else if (sym.equals("/")) {
			result = num1 / num2;
			JOptionPane.showMessageDialog(null, num1 + sym + num2 +"결과는" + result + "입니다.");
			
		}
		else if (sym.equals("%")) {
			result = num1 % num2;
			JOptionPane.showMessageDialog(null, num1 + sym + num2 +"결과는" + result + "입니다.");
		}
		else {
			JOptionPane.showInputDialog(null, "정확한 연산자를 입력해 주세요.");
		}
	}
	
	/*public void printResult() {
		JOptionPane.showMessageDialog(null, num1 + sym + num2 +"결과는" + result + "입니다.");
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

