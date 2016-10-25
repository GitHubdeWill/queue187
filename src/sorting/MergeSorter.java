package sorting;

import structures.Queue;

/**
 * A class containing methods to sort queues and merge sorted queues.
 * 
 * "Sorted" means in ascending order: the front of the queue is the smallest
 * element, and the rear of the queue is the largest.
 * 
 * e1 is less than or equal to e2 if and only if (e1.compareTo(e2) <= 0)
 *
 * You may not use loops (for, while, do, etc.) in this class. You must instead
 * use recursion.
 */
public class MergeSorter<T extends Comparable<T>> {
	/**
	 * Returns a new queue containing the elements from the input queue in
	 * sorted order.
	 * 
	 * Do not modify the input queue! Work on a copy of the input.
	 * 
	 * Implement this method recursively:
	 * 
	 * In the base case, return the sorted queue.
	 *
	 * Otherwise:
	 * 
	 * First, divide the input queue into two smaller output queues.
	 * 
	 * Then, recursively mergeSort each of these smaller queues.
	 * 
	 * Finally, return the result of merging these two queues.
	 * 
	 * @param queue
	 *            an input queue
	 * @return a sorted copy of the input queue
	 */
	public Queue<T> mergeSort(Queue<T> queue) {
		// TODO 1
		Queue<T> in = new Queue<T>(queue);
		inplace(in);
		return in;
	}
	
	public Queue<T> inplace(Queue<T> in)
	{
		if(in.size() <= 1)
		{
			return in;
		}
		Queue<T> o0 = new Queue<T>();
		Queue<T> o1 = new Queue<T>();
		new Divider<T>(in, o0, o1).divi();
		o0 = inplace(o0);
		o1 = inplace(o1);
		new Merger<T>(o0, o1, in).mergeHelp();
		return in;
	}
	/**
	 * Places elements from the input queue into the output queues, roughly half
	 * and half.
	 * 
	 * Implement this method recursively:
	 * 
	 * In the base case, there's nothing left to do.
	 * 
	 * Otherwise:
	 * 
	 * Make progress on moving elements from the input to the output.
	 * 
	 * Then make a recursive call to divide.
	 * 
	 * @param input
	 *            a queue
	 * @param output1
	 *            a queue into which about half of the elements in input should
	 *            go
	 * @param output2
	 *            a queue into which the other half of the elements in input
	 *            should go
	 */
	void divide(Queue<T> input, Queue<T> output1, Queue<T> output2) {
		// TODO 2
		/*
		 * if (input.size()==1){ output1.enqueue(input.dequeue()); return; }
		 * else if (input.size() < 1) return; output1.enqueue(input.dequeue());
		 * output2.enqueue(input.dequeue()); divide(input, output1, output2);
		 */
		if (input.isEmpty())
			return;
		new Divider<T>(input, output1, output2).divi();
	}

	/**
	 * Merges sorted input queues into an output queue in sorted order, and
	 * returns that queue.
	 * 
	 * Use mergeHelper to accomplish this goal.
	 * 
	 * @param input1
	 *            a sorted queue
	 * @param input2
	 *            a sorted queue
	 * @return a sorted queue consisting of all elements from input1 and input2
	 */
	Queue<T> merge(Queue<T> input1, Queue<T> input2) {
		// TODO 3
		Queue<T> out = new Queue<T>();
		new Merger<T>(input1, input2, out).mergeHelp();
		return out;
	}

	/**
	 * Merges the sorted input queues into the output queue in sorted order.
	 * 
	 * Implement this method recursively:
	 * 
	 * In the base case, there's nothing left to do.
	 * 
	 * Otherwise:
	 * 
	 * Make progress on moving elements from an input to the output.
	 * 
	 * Then make a recursive call to mergeHelper.
	 * 
	 * @param input1
	 *            a sorted queue
	 * @param input2
	 *            a sorted queue
	 * @param output
	 *            a sorted queue containing the accumulated progress so far
	 */
	void mergeHelper(Queue<T> input1, Queue<T> input2, Queue<T> output) {
		// TODO 3
		/*if (!input1.isEmpty() && !input2.isEmpty())
			switch (input1.peek().compareTo(input2.peek())) {
			case -1:
				output.enqueue(input1.dequeue());
				break;
			case 1:
				output.enqueue(input2.dequeue());
				break;
			case 0:
				output.enqueue(input1.dequeue());
				output.enqueue(input2.dequeue());
				break;
			}

		if (input1.isEmpty() && !input2.isEmpty())
			output.enqueue(input2.dequeue());
		if (input2.isEmpty() && !input1.isEmpty())
			output.enqueue(input1.dequeue());*/
		new Merger<T>(input1, input2, output).mergeHelp();
		
		/*if (!input1.isEmpty() || !input2.isEmpty())
			mergeHelper(input1, input2, output);*/
	}
}
