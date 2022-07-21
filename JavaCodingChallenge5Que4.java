
public class JavaCodingChallenge5Que4 {
	public static void main(String [] args) {
		short [] scores = {51, 85, 32, 0, 98, 157, 82, 101, 64, 249};
		
		byte [] results = new byte[3];
		
		for(int i = 0; i < scores.length; i++) {
			if(scores[i] >= 200) {
				results[2]++; 
			} else if (scores[i] >= 100 && scores[i]< 200) { 
				results[1]++;
			} else if (scores[i] >= 50 && scores[i]< 100) { 
				results[0]++;
			}
		}
		
		System.out.println("Half-centuries scored by the batsman: " + results[0]);
		System.out.println("Centuries scored by the batsman: " + results[1]);
		System.out.println("Double-centuries scored by the batsman: " + results[2]);
	}

}
