package sorting;

import structures.Queue;

public class Merger<T extends Comparable<T>> {

	Queue<T> input1;
	Queue<T> input2;
	Queue<T> output;
	public Merger(Queue<T> i1, Queue<T> i2, Queue<T> o){
		this.input1 = i1;
		this.input2 = i2;
		this.output = o;
	}
	
	public void mergeHelp(){
		if (!input1.isEmpty() && !input2.isEmpty())
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
			output.enqueue(input1.dequeue());

		if (!input1.isEmpty() && !input2.isEmpty())
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
			output.enqueue(input1.dequeue());

		if (!input1.isEmpty() && !input2.isEmpty())
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
			output.enqueue(input1.dequeue());

		if (!input1.isEmpty() && !input2.isEmpty())
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
			output.enqueue(input1.dequeue());

		if (!input1.isEmpty() && !input2.isEmpty())
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
			output.enqueue(input1.dequeue());

		if (!input1.isEmpty() && !input2.isEmpty())
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
			output.enqueue(input1.dequeue());

		if (!input1.isEmpty() && !input2.isEmpty())
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
			output.enqueue(input1.dequeue());

		if (!input1.isEmpty() && !input2.isEmpty())
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
			output.enqueue(input1.dequeue());

		if (!input1.isEmpty() && !input2.isEmpty())
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
			output.enqueue(input1.dequeue());

		if (!input1.isEmpty() && !input2.isEmpty())
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
			output.enqueue(input1.dequeue());

		if (!input1.isEmpty() && !input2.isEmpty())
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
			output.enqueue(input1.dequeue());

		if (!input1.isEmpty() && !input2.isEmpty())
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
			output.enqueue(input1.dequeue());

		if (!input1.isEmpty() && !input2.isEmpty())
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
			output.enqueue(input1.dequeue());

		if (!input1.isEmpty() && !input2.isEmpty())
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
			output.enqueue(input1.dequeue());

		if (!input1.isEmpty() && !input2.isEmpty())
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
			output.enqueue(input1.dequeue());

		if (!input1.isEmpty() && !input2.isEmpty())
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
			output.enqueue(input1.dequeue());

		if (!input1.isEmpty() && !input2.isEmpty())
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
			output.enqueue(input1.dequeue());

		if (!input1.isEmpty() && !input2.isEmpty())
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
			output.enqueue(input1.dequeue());

		if (!input1.isEmpty() && !input2.isEmpty())
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
			output.enqueue(input1.dequeue());

		if (!input1.isEmpty() && !input2.isEmpty())
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
			output.enqueue(input1.dequeue());

		if (!input1.isEmpty() && !input2.isEmpty())
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
			output.enqueue(input1.dequeue());

		if (!input1.isEmpty() && !input2.isEmpty())
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
			output.enqueue(input1.dequeue());

		if (!input1.isEmpty() && !input2.isEmpty())
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
			output.enqueue(input1.dequeue());

		if (!input1.isEmpty() && !input2.isEmpty())
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
			output.enqueue(input1.dequeue());

		if (!input1.isEmpty() && !input2.isEmpty())
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
			output.enqueue(input1.dequeue());

		if (!input1.isEmpty() && !input2.isEmpty())
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
			output.enqueue(input1.dequeue());

		if (!input1.isEmpty() && !input2.isEmpty())
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
			output.enqueue(input1.dequeue());

		if (!input1.isEmpty() && !input2.isEmpty())
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
			output.enqueue(input1.dequeue());

		if (!input1.isEmpty() && !input2.isEmpty())
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
			output.enqueue(input1.dequeue());

		if (!input1.isEmpty() && !input2.isEmpty())
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
			output.enqueue(input1.dequeue());

		if (!input1.isEmpty() && !input2.isEmpty())
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
			output.enqueue(input1.dequeue());

		if (!input1.isEmpty() && !input2.isEmpty())
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
			output.enqueue(input1.dequeue());

		if (!input1.isEmpty() && !input2.isEmpty())
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
			output.enqueue(input1.dequeue());

		if (!input1.isEmpty() && !input2.isEmpty())
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
			output.enqueue(input1.dequeue());

		if (!input1.isEmpty() && !input2.isEmpty())
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
			output.enqueue(input1.dequeue());

		if (!input1.isEmpty() && !input2.isEmpty())
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
			output.enqueue(input1.dequeue());

		if (!input1.isEmpty() && !input2.isEmpty())
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
			output.enqueue(input1.dequeue());

		if (!input1.isEmpty() && !input2.isEmpty())
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
			output.enqueue(input1.dequeue());

		if (!input1.isEmpty() && !input2.isEmpty())
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
			output.enqueue(input1.dequeue());

		if (!input1.isEmpty() && !input2.isEmpty())
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
			output.enqueue(input1.dequeue());

		if (!input1.isEmpty() && !input2.isEmpty())
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
			output.enqueue(input1.dequeue());

		if (!input1.isEmpty() && !input2.isEmpty())
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
			output.enqueue(input1.dequeue());

		if (!input1.isEmpty() && !input2.isEmpty())
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
			output.enqueue(input1.dequeue());

		if (!input1.isEmpty() && !input2.isEmpty())
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
			output.enqueue(input1.dequeue());

		if (!input1.isEmpty() && !input2.isEmpty())
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
			output.enqueue(input1.dequeue());

		if (!input1.isEmpty() && !input2.isEmpty())
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
			output.enqueue(input1.dequeue());

		if (!input1.isEmpty() && !input2.isEmpty())
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
			output.enqueue(input1.dequeue());

		if (!input1.isEmpty() && !input2.isEmpty())
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
			output.enqueue(input1.dequeue());

		if (!input1.isEmpty() && !input2.isEmpty())
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
			output.enqueue(input1.dequeue());

		if (!input1.isEmpty() && !input2.isEmpty())
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
			output.enqueue(input1.dequeue());

		if (!input1.isEmpty() && !input2.isEmpty())
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
			output.enqueue(input1.dequeue());

		if (!input1.isEmpty() && !input2.isEmpty())
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
			output.enqueue(input1.dequeue());

		if (!input1.isEmpty() && !input2.isEmpty())
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
			output.enqueue(input1.dequeue());

		if (!input1.isEmpty() && !input2.isEmpty())
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
			output.enqueue(input1.dequeue());

		if (!input1.isEmpty() && !input2.isEmpty())
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
			output.enqueue(input1.dequeue());

		if (!input1.isEmpty() && !input2.isEmpty())
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
			output.enqueue(input1.dequeue());

		if (!input1.isEmpty() && !input2.isEmpty())
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
			output.enqueue(input1.dequeue());

		if (!input1.isEmpty() && !input2.isEmpty())
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
			output.enqueue(input1.dequeue());

		if (!input1.isEmpty() && !input2.isEmpty())
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
			output.enqueue(input1.dequeue());

		if (!input1.isEmpty() && !input2.isEmpty())
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
			output.enqueue(input1.dequeue());

		if (!input1.isEmpty() && !input2.isEmpty())
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
			output.enqueue(input1.dequeue());

		if (!input1.isEmpty() && !input2.isEmpty())
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
			output.enqueue(input1.dequeue());

		if (!input1.isEmpty() && !input2.isEmpty())
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
			output.enqueue(input1.dequeue());

		if (!input1.isEmpty() && !input2.isEmpty())
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
			output.enqueue(input1.dequeue());

		if (!input1.isEmpty() && !input2.isEmpty())
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
			output.enqueue(input1.dequeue());

		if (!input1.isEmpty() && !input2.isEmpty())
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
			output.enqueue(input1.dequeue());

		if (!input1.isEmpty() && !input2.isEmpty())
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
			output.enqueue(input1.dequeue());

		if (!input1.isEmpty() && !input2.isEmpty())
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
			output.enqueue(input1.dequeue());
		
		if (!input1.isEmpty() || !input2.isEmpty())
			mergeHelp();
	}

}
