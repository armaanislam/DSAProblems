class Node {

	public int value;
	public Node next;
}

class LinkedList {

	public Node head;
	public Node tail;
	public int size;

	// SinglyLinkedList Creation Method
	public Node createSinglyLinkedList(int nodeValue) {

		Node node = new Node(); // O(1)
		node.value = nodeValue; // O(1)
		node.next = null; // O(1)
		head = node; // O(1)
		tail = node; // O(1)
		size = 1; // O(1)
		return head;
		// Time Complexity: O(1)
		// Space Complexity: O(1)
	}

	// SinglyLinkedList Insert Method 
	public void insertInLinkedList(int nodeValue, int location) {

		Node node = new Node(); // O(1)
		node.value = nodeValue; // O(1)
		if (head == null) { // O(1)
			createSinglyLinkedList(nodeValue); // O(1)
			return;
		} else if (location == 0) { // O(1)
			node.next = head; // O(1)
			head = node; // O(1)
		} else if (location >= size) { // O(1)
			node.next = null; // O(1)
			tail.next = node; // O(1)
			tail = node; // O(1)
		} else {
			Node tempNode = head; // O(1)
			int index = 0; // O(1)
			while (index < location - 1) { // O(n)
				tempNode = tempNode.next;
				index++;
			}
			Node nextNode = tempNode.next; // O(1)
			tempNode.next = node; // O(1)
			node.next = nextNode; // O(1)
		}
		size++;
		// Time Complexity: O(n)
		// Space Complexity: O(1)
	}

	// Deleting a Node from SinglyLinkedList
	public void deleteNode(int location) {

		if (head == null) { // O(1)
			System.out.println("The SLL does not exist"); // O(1)
		} else if (location == 0) { // O(1)
			head = head.next; // O(1)
			size --; // O(1)
			if (size == 0) { // O(1)
			    tail = null; // O(1)
			}
		} else if (location >= size) { // O(1)
			Node tempNode = head; // O(1)
			for (int i = 0; i < size - 1; i++) { // O(n)
				tempNode = tempNode.next; // O(1)
			}
			if (tempNode == head) { // O(1)
				tail = head = null; // O(1)
				size--; // O(1)
				return; // O(1)
			}
			tempNode.next = null; // O(1)
			tail = tempNode; // O(1)
			size--; // O(1)
		} else {
			Node tempNode = head; // O(1)
			for (int i = 0; i < location - 1; i++) { // O(n)
				tempNode = tempNode.next; // O(1)
			}
			tempNode.next = tempNode.next.next; // O(1)
			size--; // O(1)
		}
		// Time Complexity: O(n)
		// Space Complexity: O(1)
	}
} 

class Stack {

	LinkedList linkedList;

	// Creation of Stack
	Stack() {

		linkedList = new LinkedList();
	}

	// isEmpty
	public boolean isEmpty() {
		if (linkedList.head == null) { // O(1)
			return true; // O(1)
		} else {
			return false; // O(1)
		}
		// Time Complexity: O(1)
		// Space Complexity: O(1)
	}

	// Push Method
	public void push(int value) {

		linkedList.insertInLinkedList(value, 0); // O(1)
		System.out.println("Inserted " + value + " in stack"); // O(1)
		// Time Complexity: O(1)
		// Space Complexity: O(1)
	}

	// Pop Method
	public int pop() {

		int result = -1; // O(1)
		if (isEmpty()) { // O(1)
			System.out.println("The stack is empty"); // O(1)
		} else {
			result = linkedList.head.value; // O(1)
			linkedList.deleteNode(0); // O(1)
		}
		return result; // O(1)
		// Time Complexity: O(1)
		// Space Complexity: O(1)
	}

	// Peek Method
	public int peek() {
		
		if (isEmpty()) { // O(1)
			System.out.println("The stack is empty"); // O(1)
			return -1; // O(1)
		} else {
			return linkedList.head.value; // O(1)
		}
		// Time Complexity: O(1)
		// Space Complexity: O(1)
	}

	// Delete Method
	public void deleteStack() {
		
		linkedList.head = null; // O(1)
		System.out.println("The stack is deleted"); // O(1)
		// Time Complexity: O(1)
		// Space Complexity: O(1)
	}
}

public class Main {

	public static void main (String[] args) {

		Stack newStack = new Stack();
		newStack.push(1);
		newStack.push(2);
		newStack.push(3);
		System.out.println(newStack.pop());
		System.out.println(newStack.peek());
		newStack.deleteStack();
	}
}

