package level_1_page_1.failure_rate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
	
	public int[] solution(int N, int[] stages) {
		
		System.out.println("stages.length = " + stages.length);
		Map<Integer, Double> rate = new HashMap<Integer, Double>();
		Arrays.sort(stages);
		for(int a : stages)System.out.print(a+" ");
		System.out.println();
		
		for(int n = 1; n <= N; n++) {
			int fail = 0;
			int apprch = 0;
			
			for(int i = stages.length-1 ;i >= 0; i--) {
				if(n <= stages[i]) {
					apprch++;
				}
				if(n == stages[i]) {
					fail++;
				}
				if(n > stages[i]) break;
			}
			rate.put(n,  (double)fail/apprch);
			System.out.println("n:"+n+" fail:"+fail+" apprch:"+apprch+" rate:"+(double)fail/apprch);
		}
		
		List<Integer> keySet = new ArrayList<Integer>(rate.keySet());
		System.out.println("sort전:"+keySet);
		Collections.sort(keySet, (value1, value2) -> (rate.get(value2).compareTo(rate.get(value1))));
		
		System.out.println("sort후:"+keySet);
		int[] answer = keySet.stream().mapToInt(i->i).toArray();
		for(int a : answer) {System.out.println(a);}
		
		System.out.print("answer:");

		return answer;
		
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N =5;
		int[] stages = {6, 5, 4, 3, 2, 1};

		System.out.println(new Solution().solution(N, stages));
	}

}
