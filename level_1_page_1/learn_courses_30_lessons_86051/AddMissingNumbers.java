package level_1_page_1.learn_courses_30_lessons_86051;


public class AddMissingNumbers {

	public static void main(String[] args) {
		Solution s = new Solution();
//		int[] numbers = {1,2,3,4,6,7,8,0};
		int[] numbers = {5,8,4,0,6,7,9};
		
		System.out.println(s.solution(numbers));
	}
}

class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        
        for(int i = 0; i <= 9; i++) {
        	boolean flag = false;
        	for(int j = 0; j < numbers.length; j++) {
        		if(numbers[j] == i) flag = true;
        	}
        	if(!flag) answer += i;
        }
        
        return answer;
    }
}