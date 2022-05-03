//학생3명 과목5개 국 영 수 과 사
public class Array10 {
	public static void main(String[] args) {
		
	int scores [][] =  {{100,50,90,100,90},
						{90,90,100,50,45},
						{100,80,70,60,50}};
		
		for(int i=0;i<scores.length;i++) {
			int total = 0;
			double average;
			for(int j=0;j<scores[i].length;j++) {
				System.out.printf("%d\t",scores[i][j]);
				total += scores[i][j];
			}
			average = total/scores[i].length;
			System.out.printf("%d번 학생의 total = %d, average = %.2f%n",i+1,total,average);
	
//			System.out.printf("%d번 학생의 total = %d, average = %.1f",i+1,total,average);
			
			}
		}
}

