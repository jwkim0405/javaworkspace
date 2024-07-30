package test04_queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueTest {
	public static void main(String[] args) {
		// Queue
		// - FIFO
		// - Queue 인터페이스
		// -LinkedList를 구현체로 사용
		
		Queue<Integer> queue = new LinkedList<>();
		
		// 값을 추가
		queue.offer(1);
		queue.offer(2);
		queue.offer(3);
		
		// 값을 하나씩 꺼내기
		System.out.println(queue);
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue);
	}
}
