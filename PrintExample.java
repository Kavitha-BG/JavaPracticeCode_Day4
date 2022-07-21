//Primitive way of finding average.
public class PrintExample {
	public static void main(String [] args) {
		int [] scores;//Declare an int array
		scores = new int[4]; //Instantiate an int array
		
		//Print all the array elements before assigning the value
		System.out.println(scores[0]);
		System.out.println(scores[1]);
		System.out.println(scores[2]);
		System.out.println(scores[3]);
		
		//Assign values to array elements
		scores[0] = 85;
		scores[1] = 75;
		scores[2] = 95;
		scores[3] = 55;
		
		//Print all the array elements after assigning the value
		System.out.println(scores[0]);
		System.out.println(scores[1]);
		System.out.println(scores[2]);
		System.out.println(scores[3]);
		
		//scores[4] = 100;
	}
}
