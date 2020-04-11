package Info;

import javax.swing.JOptionPane;

public class Info {
	String addr;
	String pnum;
	
	public void setAddr() {
		addr = JOptionPane.showInputDialog(null, "주소입력");
	}
	public void setPum() {
		pnum = JOptionPane.showInputDialog(null,"전화번호입력");
	}
	
	public void printInfo() {
		JOptionPane.showMessageDialog(null, "주소는" + addr + "이고" + "\n전화번호는" + pnum + "입니다.");
	}
	public static void main(String[] args) {
		Info i1 = new Info ();
		i1.setAddr();
		i1.setPum();
		
		i1.printInfo();
	}

}

