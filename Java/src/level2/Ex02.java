package level2;

import java.util.Stack;

public class Ex02 {

	public static void main(String[] args) {
		
		
		String str = "baabaa";
//		String str = "zazbbccbbzfzbbccbbzfaz";
//      String str = "aabbccddaaaaddeeaabbccddaaaaddeeaabbccddaaaaddeeaabbccddaaaaddeeaabbccddaaaaddeeaabbccddaaaaddeeaabbccddaaaaddeeaabbccddaaaaddeeaabbccddaaaaddeeaabbccddaaaaddee";
//      for(int i = 0; i < 15; i++)   str += str;
		System.out.println("original >>>> " + str);
		System.out.println("length : " + str.length());

		System.out.println(solution(str) + "");
		
		Stack<Character> test = new Stack<>();
		if(A(test) || B(test)) {
			System.out.println("A||B");
		}
	}
	
	public static boolean A(Stack<Character> stack) {
		System.out.println("A " + stack.empty());
		return stack.empty();
	}
	public static boolean B(Stack<Character> stack) {
		System.out.println("B " + stack.peek());
		return stack.peek() != null ? true : false;
	}
	


	public static int solution(String s) {
		int answer = 0;

		Stack<Character> stack = new Stack<>();
		for(char ch : s.toCharArray()) {
//			if(stack.empty()) stack.push(ch);
//			else {
//				if(stack.peek() == ch)
//					stack.pop();
//				else stack.push(ch);
//			}
			
			if(stack.empty() || stack.peek() != ch)		// stack.empty() == true이면 뒤에는 실행되지 않음
				stack.push(ch);
			else 
				stack.pop();
		}
		
		answer = stack.empty() ? 1 : 0;

		return answer;
	}
}