package corejavapractices.demo.datastructure;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TrieDataStructureTest {
	
	Trie trieDataStructure=null;

	@Before
	public void setUp() throws Exception {
		trieDataStructure=new Trie();
	}

	@Test
	public void shouldReturnFalseWhenWordIsNull() {
		assertFalse(trieDataStructure.insertWord(null));
	}
	
	@Test
	public void shouldReturnFalseWhenWordIEmpty() {
		assertFalse(trieDataStructure.insertWord(""));
	}
	
	@Test
	public void shouldReturnTrueWhenWordIsAdd() {
		assertTrue(trieDataStructure.insertWord("abc"));
		System.out.println("==============");
		assertTrue(trieDataStructure.insertWord("abgl"));
		//assertTrue(trieDataStructure.childerNode.size()>0);
		//assertTrue(trieDataStructure.length>0);
	}
	
	public void shouldReturnTrueWhenWordIsPresent(){
		assertTrue(trieDataStructure.search("abc"));
	}

}
