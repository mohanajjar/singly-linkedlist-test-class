package com.opper.bean;

/**
 * @author najjar
 *
 */
public class Node {
	private Node next = null;
	private String data;

	public Node(String d) {
		setData(d);
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}
	
	
} 