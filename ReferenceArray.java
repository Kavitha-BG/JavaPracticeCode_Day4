//Primitive way of finding average.
public class ReferenceArray {
	public static void main(String [] args) {
		String [] names;//Declare an int array
		names = new String[4]; //Instantiate an int array
		
		//Print all the array elements before assigning the value
		System.out.println(names[0]);
		System.out.println(names[1]);
		System.out.println(names[2]);
		System.out.println(names[3]);
		
		//Assign values to array elements
		names[0] = "John";
		names[1] = "Wick";
		names[2] = "Joe";
		names[3] = "Lucy";
		
		//Print all the array elements after assigning the value
		System.out.println(names[0]);
		System.out.println(names[1]);
		System.out.println(names[2]);
		System.out.println(names[3]);
		
		//System.out.println(names[9999999999L]);
	}
}
