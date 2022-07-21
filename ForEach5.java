
public class ForEach5 {
	public static void main( String [] args ) {
		char [][] vowels = {
				{'a', 'A'},
				{'e', 'E'},
				{'i', 'I'},
				{'o', 'O'},
				{'u', 'U'},
		};
		for(int i=0; i< vowels.length; i++) {
			for(int j=0; j < vowels[i].length;j++) {
				System.out.print(vowels[i][j]+ "\t");
			}
			System.out.println();
		}
		System.out.println("-----------------------");
		
		for(char [] rows: vowels) {
			for( char val: rows) {
				System.out.print(val + "\t");
			}
			System.out.println();
		}
	}
}
