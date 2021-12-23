package level_1_page_1.learn_courses_30_lessons_76501;

public class AddPlusMinus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Solution s = new Solution();
		int[] absolutes = {4, 7, 12};
		boolean[] signs = {true, false, true};
		
		System.out.println(s.solution(absolutes, signs));
	}

}

class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        
        for(int i = 0; i < absolutes.length; i++) {
        	answer += absolutes[i] * (signs[i] == true ? 1 : -1); 
        }
        return answer;
    }
}