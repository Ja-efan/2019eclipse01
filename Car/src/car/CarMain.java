package car;

public class CarMain {
	
	public static void main(String[] args) {
		
		Car C = new Car();
		
		C.setMaker ("audi");
		C.setYear (1998);
		C.setWheelsize(20);
		C.setLight(false);
		
		C.printMaker();
		C.printYear();
		C.printWhsize();
		C.printLight();
		
	}
}
