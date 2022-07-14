/**
 * 
 */
package com.bridgelabz.main;

import java.util.Arrays;
import java.util.LinkedHashSet;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author MD_AFROZ
 *
 */
public class MyMapNode {
	@Test
	public void frequencyWordTest() {
		String sentence = "To be or not to be";
		String[] words = sentence.toLowerCase().split(" ");
		String result = "";
		MyHashMap<String, Integer> hashMap = new MyHashMap<>();
		for (String word : words) {
			Integer value = hashMap.get(word);
			if (value == null) {
				value = 1;
			} else {
				value += 1;
			}
			hashMap.add(word, value);
		}

		LinkedHashSet<String> set = new LinkedHashSet<String>(Arrays.asList(words));
		for (String word : set) { // Convert to string
			result = result + word + " : " + hashMap.get(word) + "\n";
		}
		System.out.println(result);

		Integer frequency = hashMap.get("be");
		Integer expectedValue = 2;
		Assert.assertEquals(expectedValue, frequency);
	}
	@Test
	public void largeParafrequencyWordTest() {
		String sentence = "Paranoids are not paranoid because they are paranoid but "
				+ "because they keep putting themselves deliberately into paranoid "
				+ "avoidable situations";
		String[] words = sentence.toLowerCase().split(" ");
		String result = "";
		MyHashMap<String, Integer> hashMap = new MyHashMap<>();
		for (String word : words) {
			Integer value = hashMap.get(word);
			if (value == null) {
				value = 1;
			} else {
				value += 1;
			}
			hashMap.add(word, value);
		}

		LinkedHashSet<String> set = new LinkedHashSet<String>(Arrays.asList(words));
		for (String word : set) { // Convert to string
			result = result + word + " : " + hashMap.get(word) + "\n";
		}
		System.out.println(result);

		Integer frequency = hashMap.get("paranoid");
		Integer expectedValue = 3;
		Assert.assertEquals(expectedValue, frequency);
	}
}
