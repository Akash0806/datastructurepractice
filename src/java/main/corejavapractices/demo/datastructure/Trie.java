package corejavapractices.demo.datastructure;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Trie {
	TrieNode root=null;
	public Trie() {
		root = new TrieNode();
		

}
 class TrieNode{
	Map<Character, TrieNode> childerNode = null;
	boolean lastend;
	public TrieNode(){
		childerNode = new HashMap<Character, TrieNode>();
		lastend = false;
	}
	
}
	int length = 0;


	
	

	public boolean insertWord(String word) {
		// TODO Auto-generated method stub
		if (word == null || word.isEmpty())
			return false;

		TrieNode currentRoot = root;
		char[] charArray = word.toCharArray();
		for (char charactere : charArray) {
			Map<Character, TrieNode> childerNode2 = currentRoot.childerNode;
			if (charactere == 'g') {
				System.out.println(charactere);
			}
			TrieNode trieRoot = childerNode2.get(charactere);
			if (trieRoot == null) {
				trieRoot = new TrieNode();
				currentRoot.childerNode.put(charactere, trieRoot);
			}
			currentRoot = trieRoot;
		}
		currentRoot.lastend = true;
		// root=currentRoot;
		retrieveValuesFromListMethod(root.childerNode);

		return true;
	}
	
	public boolean search(String words){
		char[] charC=words.toCharArray();
		TrieNode current=root;
		for(char c:charC){
			TrieNode node=current.childerNode.get(c);
			if(node==null){
				return false;
			}
			current=node;
		}
		return current.lastend;
	}

	public void retrieveValuesFromListMethod(Map map) {
		Set keys = map.keySet();
		Iterator itr = keys.iterator();
		char key;
		TrieNode value;
		while (itr.hasNext()) {
			key = (char) itr.next();
			value = (TrieNode) map.get(key);

			System.out.println(key + " - " + value.lastend);
			System.out.println(map.size());
			if (value.lastend) {
				return;
			}
			retrieveValuesFromListMethod(value.childerNode);

		}
	}

}
