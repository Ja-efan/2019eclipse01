package Exx;

public class Exx4 {
	
	public static void main(String[] args)
	{
		for (int i = 0 ; i<5 ; i++) {
			for (int j =0 ; j<i ; j++) 
			{
				System.out.print(" ");
			}
			for (int k = 5 ; k-i>0 ; k--)
			{
				System.out.print("*");
			}
			System.out.println("");
		}
		
		
	}

}
