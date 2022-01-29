package one.digitalinnovation;

import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		
		Stack<Carro> stack = new Stack<>(); // (PILHA)
		
		stack.push(new Carro("Ford"));
		stack.push(new Carro("Chevrolet"));
		stack.push(new Carro("Fiat"));

		stack.forEach(System.out::println);
		
		System.out.println("===================");
		stack.pop();  // Retira do 'TOPO' da pilha, ou seja, o ultimo carro adicionado. 
		stack.forEach(System.out::println);
		
		System.out.println("===================");
		System.out.println("TOPO da pilha: " + stack.peek()); // Ele te mostra o carro que esta no 'TOPO' da pilha.
		stack.forEach(System.out::println);
		
		System.out.println("===================");
		System.out.println("A pilha esta vazia? " + stack.empty()); // Verifica se a pilha esta vazia.
		stack.forEach(System.out::println);
		
		System.out.println("===================");
		System.out.println(stack.search(new Carro("Ford"))); // Retorna a posição do elemento se encontrar considerando o numero 1 sendo o topo da pilha, caso contrario retorna -1.
		stack.forEach(System.out::println);
		
		
		
		
		
		
		
		
		
	}

}
