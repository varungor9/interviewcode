package com.healthedge.junits;

import java.util.LinkedList;

import org.junit.Before;
import org.junit.Test;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.testng.Assert;

import com.healthedge.solution1.EvenOddLinkedList;

@PrepareForTest()
public class LinkedListProbTest {

	private EvenOddLinkedList list = null; 
			
	@Before
	public void setUp() {
		list = new EvenOddLinkedList();
	}
	
	@Test
	public void testEvenOddList() {
		LinkedList<Integer> data = new LinkedList<Integer>();
		data.add(5);
		data.add(2);
		data.add(4);
		data.add(3);
		data.add(10);
		data.add(12);
		data.add(11);
		data.add(9);
		data.add(7);
		
		LinkedList<Integer> result = list.oddEvenList(data);
		int count = 0;
		for(int i = 0; i < result.size(); i++) {
			if(result.get(i) % 2 != 0) {
				count++;
			}
		}
		Assert.assertTrue(count == 5);
	}
}
