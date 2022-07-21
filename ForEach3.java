
public class ForEach3 {
	public static void main( String [] args ) {
		int [] arr = new int[3];
		for(int x : arr) {
			x = 50;
		}
		
		for(int x : arr) {
			System.out.println(x);
		}
	}
}
