package Info;

import javax.swing.JOptionPane;

public class Info {
	String addr;
	String pnum;
	
	public void setAddr() {
		addr = JOptionPane.showInputDialog(null, "�ּ��Է�");
	}
	public void setPum() {
		pnum = JOptionPane.showInputDialog(null,"��ȭ��ȣ�Է�");
	}
	
	public void printInfo() {
		JOptionPane.showMessageDialog(null, "�ּҴ�" + addr + "�̰�" + "\n��ȭ��ȣ��" + pnum + "�Դϴ�.");
	}
	public static void main(String[] args) {
		Info i1 = new Info ();
		i1.setAddr();
		i1.setPum();
		
		i1.printInfo();
	}

}

