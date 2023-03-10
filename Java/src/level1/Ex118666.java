package level1;

/**
 * lv1 - 성격 유형 검사하기
 * https://school.programmers.co.kr/learn/courses/30/lessons/118666
 * @author heoseo
 *
 */
public class Ex118666 {

	public static void main(String[] args) {

		String[] surveys = {"AN", "CF", "MJ", "RT", "NA"};
		int[] choices = {5, 3, 2, 7, 5};	// TCMA
		
//		String[] surveys = {"TR", "RT", "TR"};
//		int[] choices = {7, 1, 3};
		
		System.out.println(solution(surveys, choices));
	}
	
	public static String solution(String[] surveys, int[] choices) {
        String answer = "";
        
        String order = "RCJATFMN";
        
        				
        int[][] sum = 	{	{0, 0},	// R T
	        				{0, 0},	// C F
			        		{0, 0},	// J M
			        		{0, 0}};// A N
        
        
        for(int i = 0; i < surveys.length; i++) {
        	String survey = surveys[i];
        	int choice = choices[i];
        	
        	//점수
        	int point = choice >= 4? choice % 4 : (4 - choice % 4); 
        	//유형
        	String type = survey.charAt(choice / 4) +"";
        	
        	int first = order.indexOf(type) % 4;
        	int second = order.indexOf(type) / 4;
        	
            sum[first][second] += point;
        }

        //점수 높은 유형 판단
        for(int i = 0; i < 4; i++) {
        	if(sum[i][0] < sum[i][1]) answer += order.charAt(4 + i);
        	else answer += order.charAt(i);
        }
        
        
        return answer;
    }

}
