
public class JavaCodingChallenge5Que5 {
	public static void main(String [] args) {
		int n=15;
		int[] arr = new int[n];
		arr[0]=0;
		arr[1]=1;
		
		for( int i=2; i < n ; i++) {			
			arr[i] = arr[i-1]+arr[i-2];
		}
		for (int i=0;i<arr.length;i++) {
			System.out.println(arr[i]+ " ");
		}
	}
}
