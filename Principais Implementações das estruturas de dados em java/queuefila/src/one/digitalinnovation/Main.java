package one.digitalinnovation;

import java.util.LinkedList;
import java.util.Queue;

public class Main {

	public static void main(String[] args) {
		
		Queue<Carro> queue = new LinkedList<>();
		
		queue.add(new Carro("Ford"));
		queue.add(new Carro("Chevrolet"));
		queue.add(new Carro("Fiat"));
		
		System.out.println("============================");
		queue.forEach(System.out::println);

		System.out.println("============================");
		System.out.println(queue.offer(new Carro("Result")));
		queue.forEach(System.out::println);
		
		System.out.println("============================");
		System.out.println(queue.peek());
		queue.forEach(System.out::println);
		
		System.out.println("============================");
		System.out.println(queue.poll());
		queue.forEach(System.out::println);
		
		System.out.println("============================");
		System.out.println(queue.isEmpty());
		queue.forEach(System.out::println);
		
		System.out.println("============================");
		System.out.println(queue.remove());
		queue.forEach(System.out::println);
		
		System.out.println("============================");
		System.out.println(queue.element());
		queue.forEach(System.out::println);
		
		
		
		
		
		
		
		
		
		
		
	}

}
