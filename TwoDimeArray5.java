
public class TwoDimeArray5 {
	public static void main(String [] args) {
		//1-D array instantiated with date
		String [] days1 = {
				"Monday",
				"Tuesday",
				"Wednesday",
				"Thursday",
				"Friday",
				"Saturday",
				"Sunday"
		};
		
		//2-D array instantiated with date
		String [][] days2 = {
				{"1", "Monday"},
				{"2", "Tuesday"},
				{"3", "Wednesday"},
				{"4", "Thursday"},
				{"5", "Friday"},
				{"6", "Saturday"},
				{"7", "Sunday"}
		};
		//print 1-D array
		for(int i=0; i < days1.length; i++) {
			System.out.println(days1[i]);
		}
		
		System.out.println("------------------------");
		
		//print 2-D array
		for(int i=0; i < days2.length; i++) {
			for(int j=0; j < days2[i].length; j++) {
				System.out.print(days2[i][j]+ " ");
			}
			System.out.println();
		}
		
	}
}
