package test05_stack;

import java.util.Stack;

public class StackTest {
	public static void main(String[] args) {
		// 인터페이스 분리
		// - 구현체가 달라질 수 있다
		// List: ArrayList, LinkedList, ..
		
		// Stack
		// - 단일 클래스
		// - LIFO
		
		Stack<Integer> stack = new Stack<>();
		
		stack.push(1);
		stack.add(2);
		stack.push(3);
		System.out.println(stack);
		System.out.println(stack.pop());
		System.out.println(stack);
		
		System.out.println(stack.peek());
		
		// pop은 조회 + 삭제!
		// peek은 only 조회!
	}
}
