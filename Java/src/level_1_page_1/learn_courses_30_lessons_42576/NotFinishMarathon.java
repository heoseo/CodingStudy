package level_1_page_1.learn_courses_30_lessons_42576;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Collections;
import java.util.HashMap;

public class NotFinishMarathon {

	public static void main(String[] args) {

//		String[] participant = {"mislav", "stanko", "mislav", "ana", "ana"};
//		String[] completion = {"stanko", "ana", "mislav", "ana"};
		String[] participant = {"marina", "josipa", "nikola", "vinko", "filipa"};
		String[] completion = {"josipa", "filipa", "marina", "nikola"};
		
		Solution s = new Solution();
		
		System.out.println(s.solution(participant, completion));
	}

}
class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        
        Arrays.sort(participant);
        Arrays.sort(completion);

        HashMap<String, Integer> list = new HashMap<String, Integer>();
        
//        for(String p : participant) {
//        	if(list.containsKey(p)) {
//        		int value = list.get(p);
//        		list.replace(p, ++value);
//        	}
//        	else {
//        		list.put(p, 1);
//        	}
//        }
//        
//        for(String c : completion) {
//        	int value = list.get(c);
//        	if(value > 1)
//        		list.replace(c, --value);
//        	else
//        		list.remove(c);
//        }
//        
//        answer = list.keySet().toString().replace("[", "").replace("]", "");
        
        for(String p : participant)
        	list.put(p, list.getOrDefault(p, 0) + 1);
        for(String c : completion)
        	list.put(c, list.get(c) - 1);
        
        for(String key : list.keySet()) {
        	if(list.get(key) != 0) {
        		answer = key;
        		break;
        	}
        }
        	
        return answer;
    }
}
