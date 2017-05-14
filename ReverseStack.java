import java.util.Arrays;
import java.util.Stack;

public class ReverseStack {
	
	/* Exercise 2 - Collections
       Write a method the takes a Stack of Integers and returns a reversed Stack while preserving the initial stack
	 */
	
	//method to create reversed stack
	public static Stack<Integer> reverse(Stack<Integer> initial) {
		Stack<Integer> myFirstEverStack = new Stack<>();
		//dummy stack to be used to recreate the first one
		Stack<Integer> dummyStack = new Stack<>();
		//pop oout from the initial and push it in the new stack
		while ( initial.isEmpty() == false) {
			myFirstEverStack.push(initial.pop());
			// dummy stack copy of the reversed initial
			dummyStack.push(myFirstEverStack.peek());
		}
		//recreate the initial by reversing the method
		while ( dummyStack.isEmpty() == false) {
			initial.push(dummyStack.pop());
		}
		
		return myFirstEverStack;
    }

		
	public static void main(String[] args) {
		Stack<Integer> myStack = new Stack<>();
	    myStack.addAll(Arrays.asList(new Integer[]{0,1,2,3,4,5,6,7,8,9,10}));
	    //print the results
	    System.out.println("initial stack: " + myStack);
	    System.out.println("reversed stack: " + reverse(myStack));
	    System.out.println("initial stack: " + myStack);
	 }

	}

