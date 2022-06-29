package org.tan90.training.datastructures.trie;

import java.util.HashMap;
import java.util.Map;

public class WordDictionary {
	
	private TrieNode root; 

	public WordDictionary() {
		root = new TrieNode(' ');
	}

	public void addWord(String word) {
		TrieNode current = root;
		
		for (int i = 0; i < word.length(); i++) {
			char ch = word.charAt(i);
			if (current.children.keySet().contains(ch)) {
				current = current.children.get(ch);
			}
			else {
				current.children.put(ch, new TrieNode(ch));
				current = current.children.get(ch);
			}
		}

	}

	public boolean search(String word) {
		return searchWord(word, root);
	}
	
	public boolean searchWord(String word, TrieNode node) {
		
		if (word.length() == 0 && node.children.isEmpty()) {
			return true;
		}
		if (word.length() == 0) {
			return false;
		}
		TrieNode current = node;
		char ch = word.charAt(0);
		if (ch == '.') {
			for (TrieNode trieNode : current.children.values()) {
				if (searchWord(word.substring(1), trieNode)) {
					return true;
				}
			}
			return false;
		}
		else if (current.children.containsKey(ch)) {
			return searchWord(word.substring(1), current.children.get(ch));
		}
		else {
			return false;
		}
		
	}
	
	class TrieNode {
		
		private char value;
		private Map<Character, TrieNode> children;
		
		public TrieNode(char value) {
			this.value = value;
			children = new HashMap<>();
		}
		
		public String toString() {
			return "" + value + ">" + children;
		}
	}
}
