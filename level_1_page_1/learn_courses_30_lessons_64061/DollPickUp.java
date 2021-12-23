package level_1_page_1.learn_courses_30_lessons_64061;

import java.util.List;
import java.util.ArrayList;

public class DollPickUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] board = {{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}};
		int[] moves = {1,5,3,5,1,2,1,4};
		
		Solution s = new Solution();
		
		System.out.println(s.solution(board, moves));
	}

}

class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        List<Object> basket = new ArrayList<Object>();
        
        
        for(int i = 0; i < moves.length; i++) {
        	for(int j = 0; j < board.length; j++) {
        		if(board[j][moves[i]-1] != 0) {
        			basket.add(board[j][moves[i]-1]);
        			board[j][moves[i]-1] = 0;
        			
        			if(basket.size() >=2 && basket.get(basket.size()-1).equals(basket.get(basket.size()-2))) {
        				basket.remove(basket.size()-1);
        				answer++;
        				basket.remove(basket.size()-1);
        				answer++;
        			}
        			j = board.length;
        		}
        		
        	}
        	
        }
        
        return answer;
    }
}
