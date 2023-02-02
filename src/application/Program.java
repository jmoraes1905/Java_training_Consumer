package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Consumer;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("TV",900.00));
		list.add(new Product("Phone",1100.00));
		list.add(new Product("Watch", 50.00));
		list.add(new Product("Mouse",89.90));
		
		//We want to increase products prices in 10%
		
		Consumer<Product> cons = p -> { //Declared lambda expression
			
			p.setPrice(p.getPrice()*1.10);
		};
		//Default method: foreach of List interface -- executes the Consumer accept method for the argument
		list.forEach(cons); //Using a reference static method for filtering
		
		
		list.forEach(System.out::println); //This is a reference method for println
		
	}

}
