package LL;


import java.util.Stack;

public class LinkedList {
	class Node {
		public Node(int ali) {
			// TODO Auto-generated constructor stub
			data = ali;
		}

		int data;
		Node next;
	}

	Node head;

	public void disp() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + " => ");
			temp = temp.next;
		}
		System.out.println();
	}

	public int size() {
		Node temp = head;
		int count = 0;
		while (temp != null) {
			count++;
//			System.out.print(temp.data+" ");
			temp = temp.next;
		}
		return count;
	}

	public int getFirst() {
		return head.data;
	}

	public int getLast() {
		Node temp = head;

		while (temp.next != null) {
//			count++;
//			System.out.print(temp.data+" ");
			temp = temp.next;
		}
		return temp.data;
	}



	public void addLast(int ali) {
		Node nn = new Node(ali);
		if (head == null) {
			head = nn;
			return;
		}
		Node temp = head;

		while (temp.next != null) {
//			count++;
//			System.out.print(temp.data+" ");
			temp = temp.next;
		}
		temp.next = nn;
	}

	public void addFirst(int ali) {
		Node nn = new Node(ali);
		nn.next = head;
		head = nn;
	}

	
//		curr.next = prev.next;
	

	

	public int removeFirst() {
		if (size() == 0) {
			throw new RuntimeException("bhai rehene de");
		}

		Node temp = head;
		head = head.next;
		return temp.data;
	}

	

	

	
	

	


}

