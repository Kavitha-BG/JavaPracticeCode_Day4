
public class JavaCodingChallenge5Que3 {
	public static void main(String [] args) {
		char arr [] = new char[] {'A', 'Z', 'B', 'N', 'P', 'T', 'X', 'C'};
		char search = 'E';
		boolean found = false; 
	
		for(int i = 0; i < arr.length;  i++) {
			if(arr[i] == search) { 
				found = true; 
				break; 
			}
		}
		
		if(found) {
			System.out.println(search + " found!");
		} else {
			System.out.println(search + " Not found!");
		}
	}
}
