/**
 * 
 */
package com.bridgelabz.main;

/**
 * @author MD_AFROZ
 *
 */
public interface INode<K> {

	public K getKey();

	public void setKey(K key);

	public INode<K> getNext();

	public void setNext(INode<K> next);
}
