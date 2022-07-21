
public class JavaCodingChallenge6Que4 {
	public static void main(String[] args) {
		//2-Dimensional array object
		int [][] arr = {
				{9, 76, 17, 39}, 
				{8, 87}, 
				{16, 99, 231}, 
				{187}
		};
		
		int noOfElements = 0;
		for(int i = 0; i < arr.length; i++) {
			noOfElements += arr[i].length;
		}		
		System.out.println("Length of 1-Dimensional array: " + noOfElements);
		
		int [] oneDimArr = new int[noOfElements];
		int k = 0; 
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				oneDimArr[k] = arr[i][j]; //Assign 2-D array element to 1-D array
				k++; 
			}
		}
		
		//Print 1-Dimensional array
		for(int i = 0; i < oneDimArr.length; i++) {
			System.out.print(oneDimArr[i] + "  ");
		}
	}
}
