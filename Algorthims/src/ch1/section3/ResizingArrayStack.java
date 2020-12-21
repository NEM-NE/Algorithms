package ch1.section3;

import java.util.Iterator;

public class ResizingArrayStack<Item> {
	
	private Item[] a;
	private int N;
	
	public ResizingArrayStack(){
		//base
		N = 10;
		a = (Item[]) new Object[N];
	}
	
	public ResizingArrayStack(int N){
		//select size
		this.N = N;
		a = (Item[]) new Object[this.N];
	}
	
	public boolean isEmpty() { return N == 0; }
	public int size() { return N; }
	
	private void resize(int max) {
		Item[] temp = (Item[]) new Object[max];
		
		for(int i = 0; i < a.length; i++) {
			temp[i] = a[i];
		}
		
		a = temp;
	}
	
	public void push(Item item) {
		if(N == a.length) resize(2 * a.length);
		
		a[N++] = item;
	}
	
	public Item pop() {
		if(N < a.length/2) resize(a.length/2);
		
		Item temp = a[N];
		a[--N] = null;	// prevent loitering
		
		return temp;
	}
	
	public Iterator<Item> iterator(){
		return new ReverseArrayIterator();
	}
	
	//client code
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	private class ReverseArrayIterator implements Iterator<Item> {
		private int i = N;
		
		@Override
		public boolean hasNext() { return i > 0; }
		@Override
		public Item next() { return a[--i]; }
		
	}

}
