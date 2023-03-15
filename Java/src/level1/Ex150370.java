package level1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * lv1 - 개인정보 수집 유효기간
 * https://school.programmers.co.kr/learn/courses/30/lessons/150370
 * @author E4
 *
 */
public class Ex150370 {
	public static void main(String[] args) {
		String today = "2022.05.19";
		String[] terms = {"A 6", "B 12", "C 3"};
		String[] privacies = {"2021.05.02 A", "2021.07.01 B", "2022.02.19 C", "2022.02.20 C"};
		int[] answer = {1, 3};
		
		
//		String today = "2020.01.01";
//		String[] terms = {"Z 3", "D 5"};
//		String[] privacies = {"2019.01.01 D", "2019.11.15 Z", "2019.08.02 D", "2019.07.01 D", "2018.12.28 Z"};
//		int[] answer = {1, 4, 5};
		
		for(int ans : solution(today, terms, privacies) ) System.out.print(ans + " ");
	}
	public static int[] solution(String today, String[] terms, String[] privacies) {
        int[] answer = {};
        List<Integer> list = new ArrayList<>();
        
        try {
        	SimpleDateFormat formatter = new SimpleDateFormat("yyyy.MM.dd");
			Calendar cal = Calendar.getInstance();
			
			Map<String, Integer> termMap = new HashMap<>(); 
			
			//약관 유효기간 map 정리
			for(String term : terms) {
				String[] split = term.split(" ");
				termMap.put(split[0], Integer.parseInt(split[1]));
			}
			
			//파기될 개인정보 정리
			for(int i = 0; i < privacies.length; i++) {
				String privacy = privacies[i];
				String[] split = privacy.split(" ");
				
				//개인정보 수집 일자
				String start = split[0];
				Date startDate = formatter.parse(start);
				cal.setTime(startDate); 
				//약관 종류
				String termType = split[1];
				
				cal.add(Calendar.MONTH, termMap.get(termType));
				
				//개인정보 수집 만료일자
				String end = formatter.format(cal.getTime());
				
				if(today.compareTo(end) >= 0) {
					list.add(i+1);
				}
				
			}
		} catch (ParseException e) {
			e.printStackTrace();
		}
        
        answer = new int[list.size()];
        
        for(int i = 0; i < answer.length; i++) {
        	answer[i] = list.get(i);
        }
        
        return answer;
    }
}

