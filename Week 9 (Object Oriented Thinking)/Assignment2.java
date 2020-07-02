// Program adds numbers into a queue and then displays in first-in first-out order 

public class Assignment2 {

	public static void main(String[] args) {
		Queue queue = new Queue();
		for (int i = 0; i <= 20; i++)
			queue.enqueue(i);
		while (!queue.empty())
			System.out.print(queue.dequeue() + " ");
	}
}

class Queue {
	private int[] elements;
	private int size;

	/** Construct a queue with the default capacity 8 */
	public Queue() {
		elements = new int[8];
	}

	/** Add a new integer into the queue */
	public void enqueue(int value) {
		if (size >= elements.length) {
			int[] temp = new int[size + 1];
			System.arraycopy(elements, 0, temp, 0, elements.length);
			elements = temp;
		}
		elements[size++] = value;
	}

	/** Remove and return an element from the queue */
	public int dequeue() {
		int value = elements[0];
		int[] temp = new int[elements.length - 1];
		System.arraycopy(elements, 1, temp, 0, elements.length - 1);
		elements = temp;
		return value;
	}

	/** Test whether the queue is empty */
	public boolean empty() {
		if (elements.length == 0)
			return true;
		else
			return false;
	}

	/** Return the number of elements in the queue */
	public int getSize() {
		return elements.length;
	}
}


/* Output

0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 

*/
