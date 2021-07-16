import java.util.LinkedList;

public class MergeSortedLinkedList {

	public static void main(String[] args) {

		Node head1 = newNode(1);
        head1.next = newNode(3);
        head1.next.next = newNode(5);
 
        // 1.3.5 LinkedList created
 
        Node head2 = newNode(0);
        head2.next = newNode(2);
        head2.next.next = newNode(4);
        
        Node head3;
	     if(head1.data<head2.data)
	     {
	    	head3 = head1;
	    	head1 = head1.next;
	    	
	     }
	     else {
	    	 head3 = head2;
	    	 head2 =head2.next;
	     }
	     Node current_node = head3;
		 while(head1!= null && head2!= null)
		 {
			 if(head1.data<head2.data)
		     {
				current_node.next = head1;
		    	head1 = head1.next;
		    	
		     }
		     else {
		    	 current_node.next = head2;
		    	 head2 =head2.next;
		     }
			 current_node = current_node.next;
		     
		 }
		 if(head1 == null)
		 {
			 current_node.next = head2;
		 }
		 if(head2 == null)
		 {
			 current_node.next = head1;
		 }
		 
		        while (head3 != null) {
		            System.out.printf("%d ", head3.data);
		            head3 = head3.next;
		        }
		    
		
	}
	 static class Node {
	        int data;
	        Node next;
	    };
	 
	private static Node newNode(int key) {
		  Node temp = new Node();
	        temp.data = key;
	        temp.next = null;
	        return temp;
	}

}
