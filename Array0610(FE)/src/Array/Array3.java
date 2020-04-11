package Array;

public class Array3 {
	
	public static void main(String[] args) {
		
		int[][] arr = {{5,5,5,5,5},{10,10,10,10,10},{20,20,20,20,20},{30,30,30,30,30}};
		int total = 0;
		float average = 0;
		
	
		for (int i =0 ; i<arr.length ; i++) { // 배열 arr의 행 개수
			for (int j=0; j<arr[i].length ; j++) { // 배열 arr의 열 개수
				total += arr[i][j];
			}
		}
		
		average = (float)total/(arr.length*arr[0].length);
		System.out.println("total="+total);
		System.out.println("average="+average);
	}
}
