package level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * lv1 - 신고 결과 받기
 * https://school.programmers.co.kr/learn/courses/30/lessons/92334
 * @author heoseo
 *
 */
public class Ex92334 {

	public static void main(String[] args) {

		String[] id_list = {"muzi", "frodo", "apeach", "neo"};
		String[] report = {"muzi frodo","muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"};
		int k = 2;
				
		for(int i : solution(id_list, report, k)) System.out.print(i + " ");
						
	}
	
	public static int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        int[] reportedCnt = new int[id_list.length];
        
        List<String> id = Arrays.asList(id_list);
        

        List<Map<String, String>> reportList = new ArrayList<>();
        Set<String> set = new HashSet<>();
        
        // 중복 처리해서 List Map으로 정리
        for(String str : report) {
        	String[] split = str.split(" ");
        	String er = split[0];
        	String ee = split[1];
        	
        	if(set.add(str)) {	// true: 중복 없음=신고가능
        		Map<String, String> map = new HashMap<>();
        		map.put("er", er);
        		map.put("ee", ee);
        		
        		reportList.add(map);
        		
        		int indexOfEe = id.indexOf(ee);
        		reportedCnt[indexOfEe]++;
        	}
        }
        
        // 정지 가능한 유저 찾아서 메일 발송 횟수 정리
        Map<String, String> result = null;
        for(int i = 0; i < reportedCnt.length; i++) {
        	int cnt = reportedCnt[i];
        	
        	if(cnt >= k) {	// 정지됨
        		String idOfEe = id.get(i);
        		
        		Iterator<Map<String, String>> itr = reportList.stream().filter(x -> x.get("ee").equals(idOfEe)).iterator();
        		while ( itr.hasNext() ) {
                    result = itr.next();
                    int indexOfEr = id.indexOf(result.get("er"));
                    
                    answer[indexOfEr]++;
                }
        	}
        }
        
        
        
        
        
        return answer;
    }

}
