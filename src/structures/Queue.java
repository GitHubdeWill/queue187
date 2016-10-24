package structures;

import java.util.NoSuchElementException;

public class Queue<T> implements UnboundedQueueInterface<T> {

	Node<T> front, tail;
	int size = 0;
	
	public Queue() {		
            // TODO 1
    }
	
	public Queue(Queue<T> other) {
            // TODO 2
		if (other == null) return;
		Node<T> curr = other.front;
		while (curr != null){
			this.enqueue(curr.getData());
			curr = curr.getNext();
		}
	}
	
	@Override
	public boolean isEmpty() {
            // TODO 3
            return front == null && tail == null;
	}

	@Override
	public int size() {
            // TODO 4
            return size;
	}

	@Override
	public void enqueue(T element) {
            // TODO 5
		if (element == null) return;
		if (front == null && tail == null){
			tail = new Node<T>(element);
			front = tail;
		} else {
			tail.setNext(new Node<T>(element));
			tail = tail.getNext();
		}
		size++;
	}

	@Override
	public T dequeue() throws NoSuchElementException {
            // TODO 6
		if (front == null && tail == null) 
			throw new NoSuchElementException("dequeue failed: Nothing to dequeue.");
		else {
			size--;
			T ret = front.getData();
			front = front.getNext();
			if (front == null) tail = null;
			return ret;
		}
	}

	@Override
	public T peek() throws NoSuchElementException {
            // TODO 7
		if (front == null && tail == null) 
			throw new NoSuchElementException("dequeue failed: Nothing to peek.");
		else return front.getData();
	}

	@Override
	public UnboundedQueueInterface<T> reversed() {
            // TODO 8
		LinkedStack<T> stack = new LinkedStack<T>();
		Node<T> curr = front;
		while (curr != null){
			stack.push(curr.getData());
			curr = curr.getNext();
		}
		Queue<T> ret = new Queue<T>();
		while (!stack.isEmpty()) ret.enqueue(stack.pop());
		return ret;
	}
}
