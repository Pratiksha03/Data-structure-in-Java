package ds;

import java.util.Arrays;

public  class  Stack<T> {
	@SuppressWarnings("unchecked")
	private T[] value = (T[]) new Object[16];
	private int top = 0;
	
	/*View last element on stack*/
	public T peek() {
		return value[--top];
	}
	/*Add element in the stack*/
	public void push(T val) {
		/*Increase the length if the stack is full*/
		if(top == value.length) {
			value = Arrays.copyOf(value, 16);
		}
		value[top++] = val;
	}
	/*Delete the last element in the stack*/
	public T pop() {
		T pop = value[top];
		value[top--] = null;
		return pop;
	}
}
