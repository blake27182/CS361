/**
 * 
 */
package mystack;

/**
 * @author ADD YOUR NAME 
 *
 */

// Stack using generics

// Complete the provided code

public class MyStack<T> {

	private MyNode<T> theStack = null;

	private class MyNode<T1> {
		T1 val;
		MyNode<T1> next;

		MyNode(T1 v, MyNode<T1> n) {
			val = v;
			next = n;
		}
	}

	/**
	 * 
	 */
	public MyStack() {
	}

	public T pop() {
		// TODO To complete
		if (theStack == null){
			return null;
		} else {
			MyNode<T> cursor = theStack;
			while (cursor.next != null){
				cursor = cursor.next;
			}
			return cursor.val;
		}
	}

	public void push(T v) {
		// TODO To complete
		MyNode<T> newNode = new MyNode<>(v, null);
		if (theStack == null){
			theStack = newNode;
		} else {
			MyNode<T> cursor = theStack;
			while (cursor.next != null){
				cursor = cursor.next;
			}
			cursor.next = newNode;
		}
	}

	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO To complete
		// Create a stack of Integer
		MyStack<Integer> s1 = new MyStack<>();
		// Push 1 and 2
		s1.push(1);
		s1.push(2);
		// Pop
		s1.pop();
		// Push 5
		s1.push(5);
		
		// TODO To complete
		// Create a stack of Person
		MyStack<Person> s2 = new MyStack<>();
		// Push a person p1 with your name
		Person p1 = new Person();
		p1.setFname("Blake");
		p1.setLname("Williams");
		s2.push(p1);
		// Push a person p2 with my name
		Person p2 = new Person();
		p2.setFname("Christelle");
		p2.setLname("Scharff");
		s2.push(p2);
	}

}
