
public class ForEach4 {
	public static void main( String [] args ) {
		String [] names = { "John", "Jocky", "Lucy" };
		for(int i=0;i< names.length;i++) {
			System.out.println(names[i]);
		}
		
		System.out.println("------------------");
		
		for(int i=names.length-1; i>=0 ;i--) {
			System.out.println(names[i]);
		}
		
		System.out.println("------------------");
		
		for(String name : names) {
			System.out.println(name);
		}
	}
}
