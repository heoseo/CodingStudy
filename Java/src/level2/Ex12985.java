package level2;

/**
 * 예상 대진표 https://school.programmers.co.kr/learn/courses/30/lessons/12985
 * 
 * @author heoseo
 *
 */
public class Ex12985 {

	public static void main(String[] args) {

		System.out.println((int) Math.ceil((double) 502879 / 2));

		int n = (int) Math.pow(2, 20);
		int a = (int) Math.pow(2, 19) * 4;
		int b = (int) Math.pow(2, 19) * 5;

		System.out.println("N:" + n + " A:" + a + " B: " + b);
		System.out.println(solution(n, a, b));
	}

	public static int solution(int n, int a, int b) {
		int answer = 1;

		if (a > b) {
			int tmp = a;
			a = b;
			b = tmp;
		}

		while (true) {
			if (b - a == 1) {
				if (a % 2 != 0)
					break;
			}
			answer++;

			a = (a + 1) / 2;
			b = (b + 1) / 2;
		}

		return answer;
	}

}
