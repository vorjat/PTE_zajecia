package myStack;

import java.nio.BufferOverflowException;
import java.util.EmptyStackException;

public class MyStack {
	public static final int MAX_CAPACITY=10;
	private int size = 0;
	private int[] value = new int[MAX_CAPACITY];

	public boolean isEmpty() {
		return size == 0;
	}

	public void push(int i) {
		if (size < MAX_CAPACITY) {
		value[size++]=i;
		}else {
			throw new BufferOverflowException();
		}
	}

	public int pop() {
		if (size == 0) {
			throw new EmptyStackException();
		} {
			return value[--size];
		}

	}

}
