package pck;

import javax.swing.JOptionPane;

/**
 * @author jaehwan
 *
 */
public class Sample {
	
	public static void main (String[] args) {
		String name = JOptionPane.showInputDialog(null, "�̸��Է� ");
		String no = JOptionPane.showInputDialog(null, "�й��Է� ");
		//System.out.println("�̸�: " + name);
		JOptionPane.showMessageDialog(null, "�̸���  '" + name + "' �Դϴ�." + "\n" + "�й��� '" + no + "' �Դϴ�." );
	}
}