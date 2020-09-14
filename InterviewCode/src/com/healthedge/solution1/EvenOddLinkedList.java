package com.healthedge.solution1;

import java.util.LinkedList;
import java.util.Scanner;

public class EvenOddLinkedList {

	public static void main(String[] args) {
		LinkedList<Integer> data = new LinkedList<Integer>();

		// Taking input from console
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter data in the Linked List. (enter -1 to exit)");
		int elem = scan.nextInt();
		while (elem != -1) {
			data.add(elem);
			elem = scan.nextInt();
		}
		System.out.println("Linked List Before Arranging Odd and Even numbers.");
		for (Integer i : data) {
			System.out.print(i + " ");
		}
		System.out.println();
		// sorting odd and even data of the linked list
		LinkedList<Integer> result = new EvenOddLinkedList().oddEvenList(data);
		System.out.println("Linked List After Arranging Odd and Even numbers.");
		for (Integer i : result) {
			System.out.print(i + " ");
		}
		
		scan.close();

	}

	public LinkedList<Integer> oddEvenList(LinkedList<Integer> data) {
		LinkedList<Integer> odd = new LinkedList<Integer>();
		LinkedList<Integer> even = new LinkedList<Integer>();
		
		for(Integer element : data) {
			if(element%2 == 0) {
				even.add(element);
			} else {
				odd.add(element);
			}
		}
		odd.addAll(even);
		return odd;
	}
}
