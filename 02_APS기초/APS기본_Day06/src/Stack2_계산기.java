import java.util.*;

public class Stack2_계산기 {
	
	public static void main(String[] args) {
		String expression = "6+5*(2-8)/2";
//		String postfix = infixToPostfix(expression);
//		System.out.println(postfix);
//		
//		int result = evalPostfix(postfix);
//		System.out.println(result);
		
		System.out.println(evaluate(expression));
	}
	
	// 중위 표기식을 매개변수로 넣으면 바로 값 계산해주는 계산기 !
	static int evaluate(String expression) {
		String postfix = infixToPostfix(expression);
		return evalPostfix(postfix);
	}
	
	static Map<Character, Integer> map = new HashMap<>();
	
	static { // 스태틱 블롣
		map.put('+', 1);
		map.put('-', 1);
		map.put('*', 2);
		map.put('/', 2);
		map.put('(', 0);
	}
	
	

	static String infixToPostfix(String infix) {
		Stack<Character> stack = new Stack<> ();
		
		String postfix = ""; // 길이가 0인 빈 문자열
		
		for (int i = 0; i < infix.length(); i++) {
			char c = infix.charAt(i);
			
			// 피연산자가 나오면 바로 출력
			if ('0' <= c && c <= '9') {
				postfix += c;
			} else if (c == '(')
				stack.push('(');
			else if (c == ')') {
				// 닫는 괄호는 여는 괄호가 나올 때까지 pop
				char popItem = stack.pop();
				while(popItem != '(') {
					postfix += popItem;
					popItem = stack.pop();
				} 
			}else {
				// 연산자
				// 스택의 마지막에
				// 우선순위가 낮은 연산자가 올 때까지 pop
				while (!stack.isEmpty() && 
						stack.peek() != '(' &&
						map.get(stack.peek()) >= map.get(c)) {
					char popItem = stack.pop();
					postfix += popItem;
				}
				stack.push(c); // 디버깅하면서 찾은 놓친 코드!
			}		
		}
		
		// 스택 비워주기
		while(!stack.isEmpty()) {
			postfix += stack.pop();
		}
		
		return postfix;
	}
	
	static int evalPostfix(String postfix) {
		
		Stack<Integer> stack = new Stack<>();
		
		for (int i = 0; i < postfix.length(); i++) {
			char c = postfix.charAt(i);
			if ('0' <= c && c <= '9') {
				stack.push(c - '0');
			} else {
				int num2 = stack.pop();
				int num1 = stack.pop();
				int result;
				
				if (c == '+')
					result = num1 + num2;
				else if (c == '-')
					result = num1 - num2;
				else if (c == '*')
					result = num1 * num2;
				else 
					result = num1 / num2;
				
				stack.push(result);
			}
		}
		return stack.pop();
	}
}
