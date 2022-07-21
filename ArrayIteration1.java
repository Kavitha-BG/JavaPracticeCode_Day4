
public class ArrayIteration1 {
	public static void main(String [] args) {
		int [] arr = new int [5];
		//Assigning values
//		arr[0] = 10;
//		arr[1] = 20;
//		arr[2] = 30;
//		arr[3] = 40;
//		arr[4] = 50;
		
		for(int i= 0, j= 10; i < arr.length; i++ ) {
			arr[i] = j;
			j += 10;
		}
		
		for (int i = 0; i < arr.length;i++) {
			System.out.println(arr[i]);
		}
	
	}
}
