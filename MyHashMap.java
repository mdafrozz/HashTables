/**
 * 
 */
package com.bridgelabz.main;

/**
 * @author MD_AFROZ
 *
 */

public class MyHashMap<K, V> {

		LinkedList<K> linkedList;
		
		public MyHashMap() {
	        this.linkedList = new LinkedList<>();
	    }
		
		public V get(K key) {
	        @SuppressWarnings("unchecked")
			Node<K, V> mapNode = (Node<K, V>) this.linkedList.search(key);
	        if (mapNode == null)
	            return null;
	        return mapNode.getValue();
	    }
		
		public void add(K key, V value) {
	        @SuppressWarnings("unchecked")
			Node<K, V> mapNode = (Node<K, V>) this.linkedList.search(key);
	        if (mapNode == null) {
	            mapNode = new Node<>(key, value);
	            this.linkedList.append(mapNode);
	        } else {
	            mapNode.setValue(value);
	        }
	    }
		
		public V remove(K key) {
			@SuppressWarnings("unchecked")
			Node<K, V> mapNode = (Node<K, V>) this.linkedList.delete(key);
			if (mapNode == null) {
				System.out.println("Word is not present phrase");
			}
			return mapNode.getValue();
		}
}
