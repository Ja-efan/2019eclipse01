package Exx;

public class Exx2 {
	
	public static void main(String[] args) 
	{
		for(int i = 0 ; i<5 ; i++) {
			
			for(int j = 0 ; j<(4-i) ; j++) {
				System.out.print(" ");
			}
			
			for(int k = 1 ; k<=(2*i+1) ; k++) {
				System.out.print("*");
			}
			
			System.out.println("");
		}
	}
}
