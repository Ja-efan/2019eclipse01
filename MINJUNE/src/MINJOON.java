
public class MINJOON {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			int i,j,k,l;
			for(i=1; i<=5; i++) {
				for(j=1; j<i; j++) {
					System.out.printf(" ", args);
				}
				for(k=5; k>=i; k--) {
					System.out.printf("*", args);
				}
				for(l=5-i; l>=1; l--) {
					System.out.printf("*", args);
				}
				System.out.println(" ");
			}
	}
}
