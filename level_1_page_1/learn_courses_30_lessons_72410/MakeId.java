package level_1_page_1.learn_courses_30_lessons_72410;

public class MakeId {

	public static void main(String[] args) {
		Solution s = new Solution();

		System.out.println(s.solution("...!@BaT#*..  ]  y.abcdEfgH.ijklm"));

	}

}

class Solution {
    public String solution(String new_id) {
        String answer = "";
        
        // 1단계
        answer = new_id.toLowerCase();
        System.out.println("1단계 => " + answer);
        
        // 2단계
        StringBuffer ans = new StringBuffer(answer);
        
        for(int i = 0; i < ans.length(); i++) {
        	byte b = (byte)ans.charAt(i);
        	if(!(48 <= b && b<=57) && !(97<=b && b<=122) && !(b ==45 || b==95 || b==46) ) {
        		ans.deleteCharAt(i);
        		i--;
        	}
        }
        answer = ans.toString();
        System.out.println("2단계 => " + answer);
        
        // 3단계
        int dotIndex;
        while(true){
        	dotIndex = ans.indexOf("..");
        	if(dotIndex != -1){
	        	ans.delete(dotIndex, dotIndex+1);
	        	continue;
        	}
        	break;
        }
        answer = ans.toString();
        System.out.println("3단계 => " + answer);
        
        // 4단계
        if(ans.length() != 0) {
	        if(ans.charAt(0) == '.')
	        	ans.deleteCharAt(0);
        }
        if(ans.length() != 0) {
        	if( ans.charAt(ans.length()-1) == '.')
            	ans.deleteCharAt(ans.length()-1);
        }
    	
    	answer = ans.toString();
    	System.out.println("4단계 => " + answer);
    	
    	// 5단계
    	if(ans.length() == 0)
    		ans = ans.append("a");
    	
    	answer = ans.toString();
    	System.out.println("5단계 => " + answer);
    	
    	// 6단계
    	if(ans.length() >= 16) {
    		ans.delete(15, ans.length());
    		if( ans.charAt(ans.length()-1) == '.')
	        	ans.deleteCharAt(ans.length()-1);
    	}
    	
    	answer = ans.toString();
    	System.out.println("6단계 => " + answer);
    	
    	// 7단계
    	while(true) {
    		if(ans.length() <= 2) {
    			ans.append(ans.charAt(ans.length()-1));
    			continue;
    		}
			break;
    	}

    	answer = ans.toString();
    	System.out.println("7단계 => " + answer);
    	
        return answer;
    }
}