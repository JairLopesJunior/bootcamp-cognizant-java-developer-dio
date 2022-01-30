package one.digitalinnovation;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		List<Carro> list = new ArrayList<>();
		
		list.add(new Carro("Ford"));
		list.add(new Carro("Chevrolet"));
		list.add(new Carro("Fiat"));
		list.add(new Carro("Peugeot"));
		
		System.out.println("===========================");
		System.out.println("Metodo contains()");
		System.out.println(list.contains(new Carro("Ford")));
		
		System.out.println("===========================");
		System.out.println("Metodo get()");
		System.out.println(list.get(2));
		
		System.out.println("===========================");
		System.out.println("Metodo indexOf()");
		System.out.println(list.indexOf(new Carro("Fiat")));
		
		System.out.println("===========================");
		System.out.println("Metodo remove()");
		System.out.println(list.remove(2));
		list.forEach(System.out::println);
		
		
		
		
		

	}

}
