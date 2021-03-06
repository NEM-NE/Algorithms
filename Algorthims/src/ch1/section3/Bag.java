package ch1.section3;

import java.util.Iterator;

public class Bag<Item> implements Iterable{
	private Node first;
	
	private class Node {
		Item item;
		Node next;
	}
	
	public void add(Item item) {
		Node oldeFirst = first;
		first = new Node();
		first.item = item;
		first.next = oldeFirst;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public Iterator<Item> iterator() {
		// TODO Auto-generated method stub
		return new ListIterator();
	}
	
	private class ListIterator implements Iterator {
		private Node current = first;
		
		@Override
		public boolean hasNext() {
			return current != null;
		}

		@Override
		public Item next() {
			Item item = current.item;
			current = current.next;
			return item;
		}
		
	}
}
