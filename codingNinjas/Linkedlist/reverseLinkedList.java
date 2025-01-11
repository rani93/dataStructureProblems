	// Following is the structure of the Singly Linked List.	



class LinkedListNode<T> 
    {
    	T data;
    	LinkedListNode<T> next;
    	public LinkedListNode(T data) 
        {
        	this.data = data;
    	}
	}



public class reverseLinkedList {
    public static LinkedListNode<Integer> reverseLinkedList(LinkedListNode<Integer> head) 
    {
        // Write your code here!
		if(head==null || head.next == null){
			return head;
		}
		LinkedListNode<Integer> prev =null;
		LinkedListNode<Integer> current = head;
		LinkedListNode<Integer> next = head.next;
		
		while(next!=null){
			current.next = prev;
			
			prev = current;
			current = next;
			next= next.next;
		}
		current.next = prev;
		head = current;
		return head;
    }    
}
