package level_1_page_1.learn_courses_30_lessons_42840;

import java.util.ArrayList;

public class GivpUpMath {

	public static void main(String[] args) {

//		int[] answers = {1,2,3,4,5};
//		int[] answers = {1,3,2,4,2};
		int[] answers = { 1, 3, 2, 2, 4, 4, 3, 5, 5, 1, 3, 2, 1, 2, 1, 5, 4, 4, 3, 2,2, 5 ,1, 2,2, 2, 4, 5};
	
		Solution s = new Solution();
		System.out.println(s.solution(answers));
		
	}

}

class Solution {
    public int[] solution(int[] answers) {
        int[] answer = {};
        
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        int[] res = {stu1(answers), stu2(answers), stu3(answers)};
        int max = -1;
        
        for(int i = 0; i < 3; i++) {
        	if(res[i] > max) { list.clear(); max = res[i]; list.add(i+1);}
        	else if(res[i] == max) {list.add(i+1);}
        	else if(res[i] < max) {continue;}
        }

        answer = new int[list.size()];

        int size=0;
        for(int temp : list){
        	answer[size++] = temp;
//        	System.out.println("1등은"+temp);
        }



//		for(int i : res) {
//        	System.out.println(i);
//        }
		
        return answer;
    }
    
    public int stu1(int[] answers) {
    	
    	int k = 0;
    	int cnt = 0;
    	
    	for(int i = 0; i < answers.length; i++) {
    		if (++k % 6 == 0) k++;
			if(k % 6 == answers[i]) cnt++;
//			System.out.println(k%6);
    	}
    	
    	return cnt;
    }
    
    public int stu2(int[] answers) {
    	
    	int k = 0;
		int cnt = 0;
		int[] tmp = {1, 3, 4, 5};
    	
    	for(int i = 0; i < answers.length; i++) {
    		if(i % 2 == 0) {
//    			System.out.println(2);
    			if(answers[i] == 2) {cnt++;}
    		}
			else {
				if(answers[i] == tmp[k % 4]) cnt++;
//				System.out.println(tmp[k%4]);
				k++;
			}
    	}
    	
    	return cnt;
    }
    
    public int stu3(int[] answers) {
    	
    	int k = 0;
    	int cnt = 0;
    	int[] tmp = {3, 1, 2, 4, 5};
    	
    	for(int i = 0; i < answers.length; i++) {
    		if(answers[i] == tmp[(k % 10) / 2]) cnt++;
//    		System.out.println(tmp[(k%10)/2]);
    		k++;
    	}
    	
    	return cnt;
    }
}