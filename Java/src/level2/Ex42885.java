package level2;

import java.util.Arrays;
import java.util.Comparator;

/**
 * lv2-구명보트
 * https://school.programmers.co.kr/learn/courses/30/lessons/42885
 * 
 * @author heoseo
 *
 */
public class Ex42885 {

	public static void main(String[] args) {
		int[] people = { 80, 50, 70, 50, 50 }; // 150 ->

		int limit = 100;

		System.out.println("\nanswer >> " + solution(people, limit));

	}

	/* 오름차순 정렬 풀이 */
	public static int solution(int[] people, int limit) {
		int answer = 0;

		Arrays.sort(people);

		int bottom = 0;
		int top = people.length - 1;

		while (true) {

			if (people[bottom] + people[top] <= limit) {
				bottom++;
			}

			top--;
			answer++;

			if (bottom > top)
				break;

		}

		return answer;
	}

	/* 내림차순 정렬 풀이 */
	public static int solution2(int[] people, int limit) {
		int answer = 0;

		Integer[] tmp = Arrays.stream(people).boxed().toArray(Integer[]::new);
		Arrays.sort(tmp, Comparator.reverseOrder()); // 내림차순

		int bottom = 0;
		int top = people.length - 1;

		while (true) {

			if (tmp[bottom] + tmp[top] <= limit) {
				top--;
			}

			bottom++;
			answer++;

			if (bottom > top)
				break;
		}

		return answer;
	}
}
