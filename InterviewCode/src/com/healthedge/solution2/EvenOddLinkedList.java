package com.healthedge.solution2;

import java.util.Scanner;

public class EvenOddLinkedList {

	public static void main(String[] args) {
		Node<Integer> head = null;
		Node<Integer> tail = null;

		// Taking input from console
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter data in the Linked List. (enter -1 to exit)");
		int elem = scan.nextInt();
		while (elem != -1) {
			Node<Integer> node = new Node<Integer>(elem);
			if (head == null) {
				head = node;
				tail = node;
			} else {
				tail.next = node;
				tail = tail.next;
			}
			elem = scan.nextInt();
		}

		System.out.println("Linked List Before Arranging Odd and Even numbers.");
		Node<Integer> tmp = head;
		while (tmp != null) {
			System.out.print(tmp.data + " ");
			tmp = tmp.next;
		}

		System.out.println();

		// sorting odd and even data of the linked list
		Node<Integer> result = oddEvenList(head);
		System.out.println("Linked List After Arranging Odd and Even numbers.");
		tmp = result;
		while (tmp != null) {
			System.out.print(tmp.data + " ");
			tmp = tmp.next;
		}

		scan.close();
	}

	private static Node<Integer> oddEvenList(Node<Integer> head) {
		Node<Integer> evenH = null, evenT = null;
		Node<Integer> oddH = null, oddT = null;

		if(head == null || head.next == null) {
			return head;
		}
		
		// Iterating over the linked list
		// dividing the data of each node by 2 and checking the reminder
		// if the number in the node is even - adding it to even list
		// if the number in the node is odd - adding it to odd list
		// at the end appending even list to odd list and returning odd head.
		while (head != null) {
			Node<Integer> node = new Node<Integer>(head.data);
			if (node.data % 2 == 0) {
				if (evenH == null) {
					evenH = node;
					evenT = node;
				} else {
					evenT.next = node;
					evenT = evenT.next;
				}
			} else {
				if (oddH == null) {
					oddH = node;
					oddT = node;
				} else {
					oddT.next = node;
					oddT = oddT.next;
				}
			}
			head = head.next;
		} 
		// if all numbers are even odd head value will be null
		if(oddH == null) {
			return evenH;
		}
		oddT.next = evenH;
		return oddH;
	}
}

class Node<T> {
	T data;
	Node<T> next;

	public Node(T element) {
		this.data = element;
	}
}