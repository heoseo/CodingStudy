package level_1_page_1.gym_clothes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        List<Integer> rList = Arrays.stream(reserve).boxed().collect(Collectors.toList());
        List<Integer> borrow = new ArrayList<Integer>();
        
        for(int l = 0; l < lost.length; l++){
            if(rList.contains(lost[l])){
                borrow.add(lost[l]);
                continue;
            }
            if(borrow.contains(lost[l]-1) || borrow.contains(lost[l] + 1)) {
            	continue;
            }
            for(int r = 0; r < reserve.length; r++){
                if(reserve[r] == lost[l]-1 || reserve[r] == lost[l]+1){
                    borrow.add(reserve[r]);
                    break;
                }
            }
        }
        
        return n - lost.length + borrow.size();
    }
    
    public static void main(String[] args) {
    	int n = 5;
    	int[] lost = {2, 4};
    	int[] reserve = {1, 3, 5};
    	
    	System.out.println(new Solution().solution(n, lost, reserve));
	}
}

