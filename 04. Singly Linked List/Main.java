class Node {

	public int value;
	public Node next;
}

class SinglyLinkedList {

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

	// SinglyLinkedList Traversal Method 
	public void traverseSinglyLinkedList() {

		if (head == null) { // O(1)
			System.out.println("SLL does not exist!"); // O(1)
		} else {
			Node tempNode = head; // O(1)
			for (int i = 0; i < size; i++) { // O(n)
				System.out.print(tempNode.value); // O(1)
				if (i != size - 1) { // O(1)
					System.out.print(" -> "); // O(1)
				}
				tempNode = tempNode.next; // O(1)
			}
		}
		System.out.println("\n"); // O(1)
		// Time Complexity: O(n)
		// Space Complexity: O(1)
	}

	// Search for a Node
	boolean searchNode(int nodeValue) {

		if (head != null) { // O(1)
			Node tempNode = head; // O(1)
			for (int i = 0; i < size; i++) { // O(n)
				if (tempNode.value == nodeValue) {
					System.out.print("Found node at location: "+i+"\n"); // O(1)
					return true;
				}
				tempNode = tempNode.next; // O(1)
			}
		}
		System.out.println("Node not found!"); // O(1)
		return false; 
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

	// Deleting Entire SinglyLinkedList
	public void deleteSLL() {

		head = null; // O(1)
		tail = null; // O(1)
		System.out.println("sLL deleted successfully!"); // O(1)
		// Time Complexity: O(1)
		// Space Complexity: O(1)
	}
}

public class Main {

	public static void main (String[] args) {

		SinglyLinkedList sLL = new SinglyLinkedList();
		sLL.createSinglyLinkedList(5);
		sLL.insertInLinkedList(6, 0);
		sLL.insertInLinkedList(7, 1);
		sLL.insertInLinkedList(8, 3);
		sLL.insertInLinkedList(56, 2);
		System.out.println("Head Value: "+sLL.head.value);
		sLL.traverseSinglyLinkedList();
		sLL.searchNode(7);
		sLL.searchNode(60);
		sLL.deleteNode(1);
		sLL.traverseSinglyLinkedList();
		sLL.deleteSLL();
		sLL.traverseSinglyLinkedList();
	}
}

