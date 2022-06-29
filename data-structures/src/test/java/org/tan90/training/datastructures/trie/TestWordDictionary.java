package org.tan90.training.datastructures.trie;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TestWordDictionary {
	
	@Test
	public void testWordDictionary() {
		
		WordDictionary wordDictionary = new WordDictionary();
		wordDictionary.addWord("bad");
		wordDictionary.addWord("dad");
		wordDictionary.addWord("pad");
		
		assertFalse(wordDictionary.search("mad"));
		assertTrue(wordDictionary.search("bad"));
		assertTrue(wordDictionary.search(".ad"));
		assertTrue(wordDictionary.search("b.."));

		

	}
	
	@Test
	public void testWordDictionary2() {
		
		WordDictionary wordDictionary = new WordDictionary();
		wordDictionary.addWord("at");
		wordDictionary.addWord("and");
		wordDictionary.addWord("an");
		wordDictionary.addWord("add");

		
		assertFalse(wordDictionary.search("a"));
		assertFalse(wordDictionary.search(".at"));
		wordDictionary.addWord("bat");
		assertTrue(wordDictionary.search(".at"));
		assertTrue(wordDictionary.search("an."));
		assertFalse(wordDictionary.search("a.d."));
		assertFalse(wordDictionary.search("b."));
		assertTrue(wordDictionary.search("a.d"));
		assertFalse(wordDictionary.search("."));

//		assertTrue(wordDictionary.search("bad"));
//		assertTrue(wordDictionary.search(".ad"));
//		assertTrue(wordDictionary.search("b.."));

		
//		["WordDictionary","addWord","addWord","addWord","addWord","search","search","addWord","search","search","search","search","search","search"]
//		[[],              ["at"],   ["and"],  ["an"],   ["add"],  ["a"],   [".at"], ["bat"],   [".at"], ["an."],["a.d."], ["b."], ["a.d"],  ["."]]
		
//		[null,            null,     null,     null,      null,    false,    false,   null,      true,   true,    false,    false,  true,    false]
		

	}

}
