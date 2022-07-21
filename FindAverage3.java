
public class FindAverage3 {
	public static void main(String [] args) {
//		int [] scores= new int[4];
//		
//		scores[0]=65;
//		scores[1]=85;
//		scores[2]=55;
//		scores[3]=95;
		
		int [] scores = {65, 85, 55, 95};
		
//		int avgScore = (scores[0] + scores[1] + scores[2] +scores[3]) / 4;
//		System.out.println(" Average Score of 4 students: " + avgScore);
		
		int sum =0;
		for (int i=0; i < scores.length; i++) {
			sum = sum + scores[i];
		}
		int avgScore = (scores[0] + scores[1] + scores[2] +scores[3]) / 4;
		System.out.println(" Average Score of " + scores.length + " students: "
		+ avgScore);
	}
}
