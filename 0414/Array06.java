// 다차원 배열
public class Array06 {
	public static void main(String[] args) {
		int scores[][] = {	{100,90,80,70,60},
							{90,90,80,70,60},
							{80,90,80,70,60},	};
		int total;
		double average;
		
		for(int i=0;i<scores.length;i++) { //socres.length = 3, scores[x].length = 5
			total = 0;
			average = 0;
			for(int j=0;j<scores[i].length;j++) { //
				total += scores[i][j];
			}
			average = total/scores[i].length;
			System.out.printf("%d번 학생의 total = %d, average = %.1f%n",i+1,total,average);
		}
	}
}
