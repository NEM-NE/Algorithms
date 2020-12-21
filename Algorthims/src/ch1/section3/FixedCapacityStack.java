package ch1.section3;

import java.util.Iterator;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class FixedCapacityStack<Item> {
	private Item[] a;
	private int N;
	
	public FixedCapacityStack(int cap) {
		a = (Item[]) new Object [cap];
		N = 0;
	}
	
	public void push(Item item) {
		if(N > a.length) { //invalid inspect
			throw new IndexOutOfBoundsException("exceed capacity....!");
		}else {
			a[N] = item;
			N++;
		}
	}
	
	public Item pop() {
		if(N <= 0) {
			throw new IndexOutOfBoundsException("nothing");
		}else {
			Item[] temp = (Item[])new Object[a.length];
			Item answer = a[N-1];
			
			N--;
			// deep copy
			for(int i = 0; i < N; i++) {
				temp[i] = a[i];
			}
			a = temp;

			return answer;
		}
	}
	
	public boolean isEmpty() {
		return N == 0;
	}
	
	public int size() {
		return N;
	}

	//test client code
	public static void main(String[] args) {
		FixedCapacityStack<String> s;
		s = new FixedCapacityStack<String>(100);
		
		while(!StdIn.isEmpty()) {
			// input : to be or not to - be - - that - - - is
			String item = StdIn.readString();
			if(!item.equals("-")) {
				s.push(item);
			}else if(!s.isEmpty()) {
				StdOut.print(s.pop() + " ");
			}
		}
		StdOut.println("(" + s.size() + " left on stack)");
	}
	
	private class ReverseArrayIterator implements Iterable<Item>{
		private int i = N;
		@Override
		public Iterator<Item> iterator() {
			// TODO Auto-generated method stub
			return null;
		}
		
		public boolean hasNext() {
			return i > 0;
		}
		
		public Item next() {
			return a[--i];
		}

	}


}
