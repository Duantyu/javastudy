package test;

import java.util.Random;

public class FruitGenerator <T> implements Generator<T> {
	private String[] fruits = new String[] {"Apple", "Banana", "Pear"};
	public T next() {
		Random rm = new Random();
		return (T)fruits[rm.nextInt(fruits.length)];
}
}
