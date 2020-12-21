package ch1.section3;

import java.util.Iterator;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class FixedCapacityStackOfStrings {
	private String []strs;
	private int size;
	
	public FixedCapacityStackOfStrings(int cap) {
		strs = new String [cap];
		size = 0;
	}
	
	public void push(String item) {
		if(size > strs.length) { //invalid inspect
			throw new IndexOutOfBoundsException("exceed capacity....!");
		}else {
			strs[size] = item;
			size++;
		}
	}
	
	public String pop() {
		if(size <= 0) {
			throw new IndexOutOfBoundsException("nothing");
		}else {
			String[] temp = new String[strs.length];
			String answer = strs[size-1];
			
			size--;
			// deep copy
			for(int i = 0; i < size; i++) {
				temp[i] = strs[i];
			}
			strs = temp;

			return answer;
		}
	}
	
	public boolean isEmpty() {
		return size == 0;
	}
	
	public int size() {
		return size;
	}

	//test client code
	public static void main(String[] args) {
		FixedCapacityStackOfStrings s;
		s = new FixedCapacityStackOfStrings(100);
		
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
}
