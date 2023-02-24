package level_1_page_1.learn_courses_30_lessons_81301;

public class FindNumber {

	public static void main(String[] args) {

		Solution s = new Solution();
		System.out.println(s.solution("one4seveneight"));
		System.out.println(0%3);
	}

}

class Solution {
    public int solution(String s) {
        int answer = 0;
        
        String[] str = new String[] {"zero","one","two","three","four","five","six","seven","eight","nine"};
        int[] num = new int[] {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        
        for(int i = 0; i < 10; i++) {
        	int index = s.indexOf(str[i]);
        	if(index != -1) {
        		s = s.replace(str[i], Integer.toString(num[i]));
        	}
        }
        
        answer = Integer.parseInt(s);
        
        return answer;
    }
}