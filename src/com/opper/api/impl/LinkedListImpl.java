package com.opper.api.impl;

import com.opper.api.LinkedList;
import com.opper.bean.Node;

/**
 * @author najjar
 *
 */
public class LinkedListImpl implements LinkedList {

	private Node head;
	private Node current;
	int size;

	public LinkedListImpl() {
		size = 0;
	}

	/**
	 * @param val
	 */
	@Override
	public void appendElement(String val) {
		Node node = new Node(val);
		if (head == null) {
			head = node;
			current = head;
		} else {
			current.setNext(node);
			current = node;
		}
		size++;
	}

	/**
	 * 
	 */
	@Override
	public void removeTail() {
		if (current == null) {
			System.out.println("no Element to delete because the List is Empty");
			return;
		}

		else {
			if (head == current) {
				head = null;
				current = null;
			} else {
				Node beforeCurrent = head;
				while (beforeCurrent.getNext() != current)
					beforeCurrent = beforeCurrent.getNext();
				current = beforeCurrent;
				current.setNext(null);
			}
		}
	}

	public void showAll() {
		Node current = head;
		if(current !=null){
			while (current.getNext() != null) {
				System.out.print(current.getData() + " -> ");
				current = current.getNext();
			}
			System.out.println(current.getData());
		}
	}

	@Override
	public void removeAllNodesGreaterThanTargetValue(String targetNode) {
		Node current = head;
		while (current != null && current.getNext() != null) {

			if (current.getNext().getData() == targetNode) {
				while (current != null && current.getNext() != null) {
					current.setNext(current.getNext().getNext());
					size--;
				}
				System.out.println("Success! Node with data " + targetNode + " deleted.");
			}
			current = current.getNext();
			System.out.println("Delete Failed: No node found with given data!");
		}

	}

}
