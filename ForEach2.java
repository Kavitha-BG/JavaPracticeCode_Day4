
public class ForEach2 {
	public static void main( String [] args ) {
		int [] arr = { 10, 20, 30 };
		for(int x : arr) {
			System.out.println(x);
		}
		
		String [] names = { "John", "Jocky", "Lucy" };
		for(String name : names) {
			System.out.println(name);
		}
	}
}
