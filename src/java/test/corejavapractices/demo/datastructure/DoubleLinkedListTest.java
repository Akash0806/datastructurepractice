package corejavapractices.demo.datastructure;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import corejavapractices.demo.datastructure.DoubleLinkedList.DoubleLinkedListNode;

public class DoubleLinkedListTest {
	
	static DoubleLinkedList boubleLinkedList=new DoubleLinkedList();

	@Before
	public void setUp() throws Exception {
		
	}

	@Test
	public void shouldReturnLength_One_WhenElemntInsertOnFront() {
		boubleLinkedList.insertFrontNode(1);
		assertEquals(boubleLinkedList.head.object, boubleLinkedList.tail.object);
	}
	
	@Test
	public void shouldReturnLength_Two_WhenElemntInsertOnFront() {
		boubleLinkedList.insertFrontNode(2);
		assertEquals(2,boubleLinkedList.length);
		//assertEquals(boubleLinkedList.head.object, boubleLinkedList.tail.object);
	}
	
	@Test
	public void testTraverseTheElement(){
		DoubleLinkedListNode node=boubleLinkedList.head;
		while(node!=null){
			System.out.println(node.object);
			node=node.next;
		}
	}

}
