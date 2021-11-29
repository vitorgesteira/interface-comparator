package application;

import java.util.Comparator;

import entities.Product;

//classe pra definir como vai ser a comparação
public class MyComparator implements Comparator<Product>{

	@Override
	public int compare(Product p1, Product p2) {
		return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
	}

}
