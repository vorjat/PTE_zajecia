package myStack;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.nio.BufferOverflowException;
import java.util.EmptyStackException;

import org.junit.jupiter.api.Test;


public class MyStackTest {
		
		@Test
		public void newlyCreatedStackIsEmpty() {
			MyStack myStack = new MyStack();
			assertTrue(myStack.isEmpty());
		}
		
		@Test
		public void afterPushStackNotEmpty() {
			MyStack myStack = new MyStack();
			myStack.push(1);
			assertFalse(myStack.isEmpty());
			assertTrue(!myStack.isEmpty());
		}
		@Test
		public void afterPushAndPopStackEmpty() {
			MyStack myStack = new MyStack();
			myStack.push(1);
			myStack.pop();
			assertTrue(myStack.isEmpty());
		}

		@Test
		public void emptyStackThrowsOnPop() {
			MyStack myStack = new MyStack();
			assertThrows(EmptyStackException.class, ()->myStack.pop());
		}
		
		@Test
		public void popReturnsWhatWasPushed() {
			MyStack myStack = new MyStack();
			myStack.push(1);
			assertEquals(myStack.pop(), 1);
		}
		
		@Test
		public void stackNotEmptyWhenLessPopThanPush () {
			MyStack myStack = new MyStack();
			myStack.push(1);
			myStack.push(9);
			myStack.pop();
			assertFalse(myStack.isEmpty());
		}
		
		@Test
		public void lastPopReturnFirstPushedValue() {
			MyStack myStack = new MyStack();
			myStack.push(1);
			myStack.push(9);
			myStack.pop();
			assertEquals(myStack.pop(), 1);
		}
		
		@Test
		public void stackThrowsWhenCapacityExceeded() {
			MyStack myStack = new MyStack();
			assertThrows(BufferOverflowException.class,
			()->{
				for (int i = 0; i<MyStack.MAX_CAPACITY+1; ++i) 
				myStack.push(i);	 
			});
		}
}
