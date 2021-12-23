package level_1_page_1.pocketmon;

import java.util.ArrayList;
import java.util.List;

public class Solution {

	 public int solution(int[] nums) {
        int answer = 0;
        int get = nums.length;
        
        List<Integer> type = new ArrayList<Integer>();
        
        for(int i = 0; i < nums.length; i++){
            if(!type.contains(nums[i])){
                type.add(nums[i]);
            }
        }
        
        int size = type.size();
        
        if(size < get) answer = size;
        else if(size >= get) answer = get;
        
        if(answer > get/2) answer = get/2;
        
        return answer;
    }
	 
	public static void main(String[] args) {

//		int[] nums = {3, 1, 2, 3};
		int[] nums = {3,3,3,2,2,4};
//		int[] nums = {3,3,3,2,2,2};
		
		System.out.println(new Solution().solution(nums));
		
	}

}
