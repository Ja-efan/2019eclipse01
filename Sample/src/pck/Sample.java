package pck;

import javax.swing.JOptionPane;

/**
 * @author jaehwan
 *
 */
public class Sample {
	
	public static void main (String[] args) {
		String name = JOptionPane.showInputDialog(null, "이름입력 ");
		String no = JOptionPane.showInputDialog(null, "학번입력 ");
		//System.out.println("이름: " + name);
		JOptionPane.showMessageDialog(null, "이름은  '" + name + "' 입니다." + "\n" + "학번은 '" + no + "' 입니다." );
	}
}