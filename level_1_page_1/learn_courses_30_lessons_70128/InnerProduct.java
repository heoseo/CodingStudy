package level_1_page_1.learn_courses_30_lessons_70128;

public class InnerProduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,2,3,4};
		int[] b = {-3,-1,0,2};
		
		Solution s = new Solution();
		System.out.println(s.solution(a, b));

	}

}

class Solution {
    public int solution(int[] a, int[] b) {
        int answer = 0;
        
        for(int i = 0; i < a.length; i++) {
        	answer += a[i] * b[i];
        }
        return answer;
    }
}