package level_1_page_1.learn_courses_30_lessons_67256;

public class KeyPad {

	public static void main(String[] args) {

		int[] numbers = {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};
		String hand = "right";
		
		Solution s = new Solution();
		System.out.println(s.solution(numbers, hand));
	}

}


class Solution {
	public int[][] position = {{1, 1}, {3, 1}};
	
    public String setPosition(int LR, int x, int y, int numbers, String answer) {
    	position[LR][0] = x;
    	if(x == 2)
    		position[LR][1] = numbers == 0 ? 1 : (4-numbers/3);
    	else position[LR][1] = y - (numbers / 3);
    	
    	if(LR == 0)
    		return answer.concat("L");
    	return answer.concat("R");
    }
    
    public String solution(int[] numbers, String hand) {
        String answer = "";
        
        for(int i = 0; i < numbers.length; i++) {
        	if(numbers[i] % 3 == 1) 
        		answer = setPosition(0, 1, 4, numbers[i], answer);
        		
        	if(numbers[i] % 3 == 0 && numbers[i] != 0) 
        		answer = setPosition(1, 3, 5, numbers[i], answer);
        	
        	if(numbers[i] % 3 == 2 || numbers[i] == 0){
        		int leftGap = Math.abs(position[0][0] - 2)
        						+
    						  Math.abs(position[0][1] - (numbers[i] == 0 ? 1 : 4-numbers[i]/3));
        		int rightGap = Math.abs(position[1][0] - 2)
								+
							  Math.abs(position[1][1] - (numbers[i] == 0 ? 1 : 4-numbers[i]/3));
        		
        		if(leftGap < rightGap) 
            		answer = setPosition(0, 2, -1, numbers[i], answer);
        		else if(leftGap > rightGap) 
            		answer = setPosition(1, 2, -1, numbers[i], answer);
        		else if(leftGap == rightGap) {
        			if(hand.equals("left")) 
                		answer = setPosition(0, 2, -1, numbers[i], answer);
        			if(hand.equals("right")) 
                		answer = setPosition(1, 2, -1, numbers[i], answer);
        		}
        	}
        	
        }
        
        return answer;
    }

	
}