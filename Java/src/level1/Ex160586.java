package level1;

import java.util.HashMap;
import java.util.Map;

/**
 * lv1 - 대충 만든 자판
 * https://school.programmers.co.kr/learn/courses/30/lessons/160586
 * @author heoseo
 *
 */
public class Ex160586 {
    public static void main(String[] args) {

//        String[] keymap = {"ABACD", "BCEFD"};
//        String[] targets = {"ABCD","AABB"};
//        String[] keymap = {"AA"};
//        String[] targets = {"B"};	
        String[] keymap = {"AGZ", "BSSS"};
        String[] targets = {"ASA","BGZ"};

        
        int[] answer = solution(keymap, targets);
        System.out.print("answer >> ");
        for(int a : answer) {
        	System.out.print(a + " ");
        }
    }

    public static int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        
        Map<Character, Integer> match = new HashMap<>(); 
        
        //1. key를 map에 저장
        for(String key : keymap) {
        	int index = 0;

        	while(true) {
        		char ch = key.charAt(index);
        		Integer val = match.get(ch);
        		
        		if(val != null) {
        			//최소 index를 map에 저장
        			if(val > index) match.put(ch, index);
        		}else {
        			match.put(ch, index);
        		}
        		
        		index++;
        		if(index == key.length()) break;
        	}
        }
        
        // map에서 해당 문자를 key로 가진 value 검색
        for(int i = 0; i < targets.length; i++) {
        	String target = targets[i];
        	int sum = 0;
        	
        	for(int j = 0; j < target.length(); j++) {
        		char ch = target.charAt(j);
        		Integer val = match.get(ch);
        		
        		if(val != null) {
        			sum += (val+1);
        		}else {
        			// 등록된 key가 없으면 -1반환
        			sum = -1;
        			break;
        		}
        	}
        	answer[i] = sum;
        }
        
        return answer;
    }

}
