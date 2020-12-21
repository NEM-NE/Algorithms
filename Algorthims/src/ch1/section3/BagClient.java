package ch1.section3;

import java.util.Iterator;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class BagClient {

	public static void main(String[] args) {
		Bag<Double> numbers = new Bag<Double>();
		
		while(!StdIn.isEmpty())
			numbers.add(StdIn.readDouble());
		int N = numbers.size();
		
		double sum = 0.0;
		for(double x : numbers) {
			sum += x;
		}
		double mean = sum / N;
		
		sum = 0.0;
		for(double x : numbers)
			sum += (x - mean) * (x - mean);
		double std = Math.sqrt(sum / (N -1));
		
		StdOut.printf("mean: %.2f\n", mean);
		StdOut.printf("std dev: %.2f\n", std);
		
	}

}

class Bag implements Iterable<Item>{
	private int size;
	private Vector<Item> vector = new Vector<Item>();
	
	public Bag() {
		this.size = 0;
	}
	
	public void add() {
		
	}
	
	public boolean isEmpty() {
		
	}
	
	public int size() {
		
	}

	@Override
	public Iterator<Item> iterator() {
		// TODO Auto-generated method stub
		return null;
	}
}
