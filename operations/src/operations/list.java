package operations;
import java.util.*;

class list<T> {
	Node head;
	
	class Node{
		T data;
		Node next;	
		Node(T val){
			data = val;
			next = null;
		}
	}
	
	list(){
		head = null;
	}
	//insert at begin
	public void insertAtBeginning(T val){
		Node newNode = new Node(val);
		//when list empty
		if(head==null)
			head = newNode;
		else { //list is not empty
			newNode.next = head;	
			head = newNode;
		}	
		
	}
	// insert by the position  value
	public void insertAtPos(int pos,T val) {
		if(pos==0)
		{
			insertAtBeginning(val);
			return;
		}
		
		Node newNode = new Node(val);
		Node temp = head;
		for(int i=1;i<pos;i++) { //jump to prev node
			temp = temp.next;
			if(temp==null) 
				throw new IndexOutOfBoundsException("Invalid Pos " + pos);
		}
		
		//reassign pointers
		newNode.next = temp.next;
		temp.next = newNode;
			
	}
	//display the position  value
	public void display() {
		Node temp = head; //start from head
		while(temp != null) { //null implies end of list
			System.out.print( temp.data +" " );
			temp = temp.next; //jump
		}
		
	}
	//delete value by the position
public void deleteAtPos(int pos) {
		
		if(head==null) 
			throw new IndexOutOfBoundsException("Deletion attempted on empty list ");
	
		if(pos==0) {
			head = head.next;
			return;
		}
		
		Node temp = head;
		Node prev = null;
		
		//jump till node to be deleted
		for(int i=1;i<=pos;i++) {
			prev = temp; //keep track of prev node
			temp = temp.next; //jump to next node
		}
		
		prev.next = temp.next; //reassign pointers
	}


//public class LinkedList {
public static void main(String a[]) {
	Scanner inp=new Scanner(System.in);
	list<Integer> li =new list<Integer>();
	while(true) {
	System.out.println("1.Insert at begining");
	System.out.println("2.Insert at posiition");
	System.out.println("3.Display");
	System.out.println("4.Delete");
	System.out.println("Enter your choice");
	int choice=inp.nextInt();
	switch(choice) {
	case 1:System.out.print("Enter your data:");
		   int val=inp.nextInt();
		   li.insertAtBeginning(val);
		   break;
	case 2:System.out.print("Enter your data:");
	   	   int val2=inp.nextInt();
	   	   System.out.print("Enter your target position:");
	   	   int pos=inp.nextInt();
           li.insertAtPos(pos,val2);
           break;
	case 3:li.display();break;
	case 4:System.out.print("Enter your target position:");
	       int pos1=inp.nextInt();
           li.deleteAtPos(pos1);
           break;
    default:
    	System.out.println("Wrong choice!!!");
	
    
	}
	System.out.println(" ");
	}
}
}

