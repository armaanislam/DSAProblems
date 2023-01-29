class Stack {

	int[] arr;
	int topOfStack;
	
	// Creation of Stack
	Stack(int size) {

		this.arr = new int[size]; // O(1)
		this.topOfStack = -1; // O(1)
		System.out.println("Stack is created with a size of: "+ size); // O(1)
		// Time Complexity: O(1)
		// Space Complexity: O(n)
	}

	// isEmpty
	public boolean isEmpty() {
		if (topOfStack == -1) { // O(1)
			return true; // O(1)
		} else {
			return false; // O(1)
		}
		// Time Complexity: O(1)
		// Space Complexity: O(1)
	}

	// isFull
	public boolean isFull() {
		if (topOfStack == arr.length - 1) { // O(1)
			return true; // O(1)
		} else {
			return false; // O(1)
		}
		// Time Complexity: O(1) 
		// Space Complexity: O(1)
	}

	// Push Method
	public void push(int value) {
		if (isFull()) { // O(1)
			System.out.println("The stack is full"); // O(1)
		} else {
			arr[topOfStack + 1] = value; // O(1)
			topOfStack++; // O(1)
			System.out.println("Value successfully push: " + value); // O(1)
		}
		// Time Complexity: O(1) 
		// Space Complexity: O(1)
	}

	// Pop Method
	public int pop() {
		if (isEmpty()) { // O(1)
			System.out.println("The stack is empty"); // O(1)
			return -1;
		} else {
			int poppedValue = arr[topOfStack]; // O(1)
			topOfStack--; // O(1)
			return poppedValue; // O(1)
		}
		// Time Complexity: O(1) 
		// Space Complexity: O(1)
	}

	// Peek Method
	public int peek() {
		if (isEmpty()) { // O(1)
			System.out.println("The stack is full"); // O(1)
			return -1; // O(1)
		} else {
			return arr[topOfStack]; // O(1)
		}
		// Time Complexity: O(1) 
		// Space Complexity: O(1)
	}

	// Delete Method
	public void deleteStack() {
		arr = null; // O(1)
		System.out.println("The stack is successfully deleted"); // O(1)
		// Time Complexity: O(1) 
		// Space Complexity: O(1)
	}
}

public class Main {

	public static void main(String[] args) {

		Stack newStack = new Stack(4);
		boolean emptyCheck = newStack.isEmpty();
		System.out.println(emptyCheck);
		boolean fullCheck = newStack.isFull();
		System.out.println(fullCheck);
		newStack.push(1);
		newStack.push(3);
		newStack.push(5);
		newStack.push(7);
		newStack.push(9);
		System.out.println(newStack.peek());
		System.out.println("Value popped: " + newStack.pop());
		System.out.println(newStack.peek());
		newStack.deleteStack();
	}
} 