import java.util.Random;


public class Lotto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// lottos 정의
        // lottos = makeNumbers(0);
		int[] lottos = new int[6];
		int[] win_nums = new int[6];
		
        Random rand = new Random();
        for(int i = 0 ; i < 6 ; i++) {
            lottos[i] = 0 + rand.nextInt(46 - 0);
            
            for(int j = 0; j < i; j++){
                if(lottos[i] == lottos[j])
                    continue;
            }
        }
        // win_nums 정의
        // win_nums = makeNumbers(1);
        for(int i = 0 ; i < 6 ; i++) {
            win_nums[i] = 1 + rand.nextInt(46 - 1);
            
            for(int j = 0; j < i; j++){
                if(win_nums[i] == win_nums[j])
                    continue;
            }
        }
        
        lottos = new int[] {44, 1, 0, 0, 31 ,25};
        win_nums = new int[] {31, 10, 45, 1, 6, 19};
        Solution s = new Solution();
        
        for(int i = 0; i < lottos.length; i++) 
        	System.out.print(lottos[i] + " ");
        System.out.println();
        for(int i = 0; i < lottos.length; i++) 
        	System.out.print(win_nums[i] + " ");
        System.out.println();
        int[] answer = s.solution(lottos, win_nums);
        for(int i = 0; i < answer.length; i++) 
        	System.out.print(answer[i] + " ");
        
//		System.out.println(s.solution(lottos, win_nums).toString());
	}
	
	

}

class Solution {
    
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = {};
        
        
        
        // 당첨번호 비교
        int cnt = 0;
        int zero = 0;
        
        System.out.println("\n\n");
        
        for(int i = 0; i < 6; i++){
            for(int j = 0; j < 6; j++){
                if(lottos[i] == 0){
                    zero++;
                    break;
                }
                if(lottos[i] == win_nums[j]){
                    cnt++;
                    break;
                }
                
            }
        }
        
        answer = new int[] {7-(cnt+zero), 7-cnt};
    
        for(int i = 0; i < 2; i++){
            if(answer[i] == 7)
                answer[i] = 6;
        }
        
        // answer = compare(lottos, win_nums);
        return answer;
    }
    
}
