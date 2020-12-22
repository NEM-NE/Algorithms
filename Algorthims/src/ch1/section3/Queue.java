package ch1.section3;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Queue<Item> {
	private Node first;
	private Node last;
	private int N;
	
	public Queue() {
		this.first = new Node();
		this.N = 0;
		
		this.first.item = null;
		this.first.next = null;
	}
	
	public boolean isEmpty() { return first == null; }
	public int size() { return N; }
	
	public void enqueue(Item item) {
		if(N == 0) {
			Node oldfirst = first;
			first = new Node();
			first.item = item;
			first.next = oldfirst;
		}else {
			Node oldLast = last;
			last = new Node();
			last.item = item;
			last.next = oldLast;
		}
		N++;
	}
	
	public Item dequeue() {
		Item item = first.item;
		first = first.next;
		N--;
		return item;
	}
	
	public static void main(String[] args) {
		Queue<String> s = new Queue<String>();
		
		while(!StdIn.isEmpty()) {
			String item = StdIn.readString();
			if(!item.equals("-")) {
				s.enqueue(item);
			}else if(!s.isEmpty())
				StdOut.print(s.dequeue() + " ");
		}
		
		StdOut.println("(" + s.size() + " left on stack)");
	}
	
	private class Node {
		Item item;
		Node next;
	}

}
