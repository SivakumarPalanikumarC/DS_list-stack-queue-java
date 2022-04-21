package operations;
import java.util.*;
class stackk<T> {
	class Node{
		T data;
		Node next;
		Node(T val){
			data = val;
			next = null;
		}
	}
	
	Node top;
	stackk(){
		top = null;
	}
	
	public void push(T val) {
		Node newNode = new Node(val);
		newNode.next = top;
		top = newNode;
	}
	
	public T pop() {
		if(top==null)
			throw new IndexOutOfBoundsException("Stack is Empty");
		
		T tmp = top.data;
		top = top.next;
		return tmp;
		
	}
	
	public boolean isEmpty() {
		return top==null;
	}
	
	public T peek() {
		return top.data;
	}
	

//public class StackList {
public static void main(String args[]) {
	stackk<Integer> li=new stackk<Integer>();
	Scanner inp=new Scanner(System.in);
	while(true) {
	System.out.println("1.Push");
	System.out.println("2.Pop");
	System.out.println("3.Peek");
	System.out.println("Enter your choice");
	int choice=inp.nextInt();
	switch(choice) {
	case 1:System.out.print("Enter your data:");
	   int val=inp.nextInt();
	   li.push(val);
	   break;
	case 2:System.out.println(li.pop() + " popped from stack");
	       break;
	case 3:System.out.println("Top element is " + li.peek());
			break;
	default:
		System.out.println("Wrong Choice!!!");
	}
	}
}
}

