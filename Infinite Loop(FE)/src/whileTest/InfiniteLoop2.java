package whileTest;

public class InfiniteLoop2 {
	
	public static void main(String[] args) {
		
		int sum = 0;
		int i = 0;
		
		for( ; ; ) {
			sum += i;
			i++;
		}
		/* System.out.println("sum =" + sum); */ //실행불가 문장 error발생
	}

}
