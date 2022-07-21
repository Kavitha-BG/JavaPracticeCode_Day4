
public class JavaCodingChallenge6Que3 {
	public static void main(String[] args) {
		//Asymmetrical 2-Dimensional char array
		int [][] n = {
				{90, 10, 231},
				{-20, 80, 100, 23, 54},
				{45, 22},
				{87, 98, -100, 49, 73, 35, 19}
		};
		
		int max = n[0][0];
		for (int i = 0; i < n.length; i++) {
			for (int j = 0; j < n[i].length; j++) {
				if(max < n[i][j]) {
					max = n[i][j];
				}
			}
		}
		System.out.println("Highest number is: " + max);
	}
}
