package sum2000;

public class sum20001 {
	
	public static void main(String[] args) {
		
		int sum = 0;
		
		for(int i = 1 ; i <=2000 ; i++) {
			if(i%2 == 0) {
				sum += i;
			}
		}
		System.out.print(sum);
		
	}

}
