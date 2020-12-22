package ch1.section3;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Stack<Item> {
	private Node first;
	private int N;
	
	public Stack() {
		this.first = new Node();
		this.N = 0;
		
		this.first.item = null;
		this.first.next = null;
	}
	
	public boolean isEmpty() { return N <= 0; }
	public int size() { return N; }
	
	public void push(Item item) {
		Node oldFirst = first;
		first = new Node();
		first.item = item;
		first.next = oldFirst;
		N++;
	}
	
	public Item pop() {
		Item item = first.item;
		first = first.next;
		N--;
		return item;
	}
	
	public static void main(String[] args) {
		Stack<String> s = new Stack<String>();
		
		while(!StdIn.isEmpty()) {
			String item = StdIn.readString();
			if(!item.equals("-")) {
				s.push(item);
			}else if(!s.isEmpty())
				StdOut.print(s.pop() + " ");
		}
		
		StdOut.println("(" + s.size() + " left on stack)");
	}
	
	private class Node {
		Item item;
		Node next;
	}

}
