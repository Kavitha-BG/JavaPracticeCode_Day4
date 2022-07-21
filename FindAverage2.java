
public class FindAverage2 {
	public static void main(String [] args) {
//		int score1 = 65;
//		int score2 = 85;
//		int score3 = 55;
//		int score4 = 95;
//		
//		int avgScore = (score1 + score2 + score3 +score4) / 4;
//		System.out.println(" Average Score of 4 students: " + avgScore);
		
		int [] scores= new int[4];
		
		scores[0]=65;
		scores[1]=85;
		scores[2]=55;
		scores[3]=95;
		
		int avgScore = (scores[0] + scores[1] + scores[2] +scores[3]) / 4;
		System.out.println(" Average Score of 4 students: " + avgScore);	
	}
}
