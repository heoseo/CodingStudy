package level_1_page_1.learn_courses_30_lessons_12977;

public class MakePrimeNumByThreeNum {

	public static void main(String[] args) {
		int[] nums = {1, 2, 7, 6, 4};

		Solution s = new Solution();
		System.out.println(s.solution(nums));
	}

}


class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        
        for(int i = 0; i < nums.length-2; i++) 
        	for(int j = i+1; j < nums.length-1; j++) 
        		for(int k = j + 1; k < nums.length; k++) {
        			int sum = nums[i] + nums[j] + nums[k];
        			
        			if(isPrimeNum(sum)) 
        				answer++;
        		}
        	
        

        return answer;
    }
    
    public boolean isPrimeNum(int sum) {
    	
    	int cnt = 0;
    	
    	for(int i = 1; i <= sum; i++) {
    		if(sum % i == 0) cnt++;
    		if(cnt > 2) return false;
    	}
    	
    	return true;
    }
}