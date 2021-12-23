package level_1_page_1.learn_courses_30_lessons_42748;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class KthNumber {

	public static void main(String[] args) {
		
		int[] array = {1, 5, 2, 6, 3, 7, 4};
		int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};

		Solution s = new Solution();
		System.out.println(s.solution(array, commands));
	}

}


class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        
//        for(int i = 0; i < commands.length; i++) {
//        	int start = commands[i][0]-1;
//        	int end = commands[i][1]-1;
//        	int k = commands[i][2]-1;
//        	
//        	int length = end-start + 1;
//        	int[] tmp = new int[length];
//        	
//        	for(int j = start; j <= end; j++ ) {
//        		tmp[j-start] = array[j];
//        	}
//        	
//        	
//        	Arrays.sort(tmp);
//        	
//        	answer[i] = tmp[k];
//        }
        
        for(int i=0; i<commands.length; i++){
            int[] temp = Arrays.copyOfRange(array, commands[i][0]-1, commands[i][1]);
            Arrays.sort(temp);
            answer[i] = temp[commands[i][2]-1];
        }
        
        System.out.println();
        for(int i : answer)
        	System.out.print(i);
        
        return answer;
    }
}