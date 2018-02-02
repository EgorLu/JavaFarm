package utils;

import java.util.EmptyStackException;

public class Stack<T> {

	private T[] items;
	private int size; // Size of the stack

	@SuppressWarnings("unchecked")
	public Stack() {
		size = 0;
		items = (T[]) new Object[size];
	}

	public boolean isEmpty() {
		return size == 0;
	}

	/**
	 * Push
	 * 
	 * Aliasing alert! No use of copy constructors, etc.
	 * 
	 * @param item
	 *            Item to be pushed
	 */
	@SuppressWarnings("unchecked")
	public void push(T item) {
		T[] tempArr = (T[]) new Object[++size]; // Create temp array and increment "size".
		for (int i = 0; i < items.length; i++) {
			tempArr[i] = items[i];
		}
		tempArr[size - 1] = item;
		items = tempArr;
	}

	/**
	 * Protected Pop
	 * 
	 * Checks whether the stack is empty. If so, will throw an EmptyStackException.
	 * Otherwise will call the popItem function.
	 * 
	 * @return Generic type variable from the top of the stack.
	 */
	public T pop() {
		if (!isEmpty()) {
			return popItem();
		}
		throw new EmptyStackException();
	}

	/**
	 * Pop
	 * 
	 * Aliasing alert!
	 * 
	 * @return Generic type variable from the top of the stack.
	 */
	@SuppressWarnings("unchecked")
	private T popItem() {
		T[] tempArr = (T[]) new Object[size - 1]; // Create temp array and decrement "size".
		T tempVal = items[size - 1];
		for (int i = 0; i < items.length - 1; i++) {
			tempArr[i] = items[i];
		}
		items = tempArr;
		return tempVal;
	}

	public int size() {
		return size;
	}

	public String toString() {
		String result = new String();
		if (!isEmpty()) {
			for (int i = 0; i < items.length; i++) {
				result += (i+1) + ". " + items[i] + "\n";
			}
		}
		return result;
	}

	public T getItemAt(int i) {
		return items[i];
	}
}
