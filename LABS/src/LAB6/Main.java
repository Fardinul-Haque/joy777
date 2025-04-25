package LAB6;

public class Main {

		public static void main(String[]args) {
			
			
			Node x1=new Node(10);
			Node x2=new Node(11);
			Node x3=new Node(13);
			Node x4=new Node(14);
			Node x5=new Node(15);
			
			x1.next=x2;
			x2.next=x3;
			x3.next=x4;
			x4.next=x5;
			
			Implementation s1=new Implementation();
			s1.setHead(x1);
			s1.setTail(x5);
			
			s1.displayInformation();
			s1.insertAtAnyPosition(2, 4 );
			s1.displayInformation();
			s1.insertAtAnyPosition(4, 500);
			s1.displayInformation();
			s1.insertAtAnyPosition(4, 550);
			s1.displayInformation();
			s1.insertAtAnyPosition(0, 10000);
			s1.displayInformation();
			s1.insertAtAnyPosition(8, 1234);
			s1.displayInformation();
			s1.deleteAtAnyIndex(9);
			s1.displayInformation();
			s1.deleteAtAnyIndex(8);
			s1.displayInformation();
			s1.deleteAtAnyIndex(7);
			s1.displayInformation();
			s1.deleteAtAnyIndex(0);
			s1.displayInformation();
		}
	}

	class Node{
		int data;
		Node next;
		
		
		Node(int x){
			this.data=x;
		}
	}

	class Implementation{
		
		Node head=null;
		Node tail=null;
		
		
		void displayInformation() {
			System.out.println();
			System.out.print("Displaying information: ");
			
			Node temp=head;
			
			while(temp!=null) {
				System.out.print(temp.data+ " ");
				temp=temp.next;
			}
			System.out.print(" Head: "+head.data);
			System.out.print(" Tail: "+tail.data);
			System.out.print(" Size: "+size());
		
			
		}
		
		void insertAtAnyPosition(int idx, int value) {
			
			Node newNode=new Node(value);
			Node temp=head;
			
			if(idx==0) {
				newNode.next=head;
				head=newNode;
			}
			
			else if(idx==size()-1) {
				tail.next=newNode;
				tail=newNode;
				
			}
			else {
				
			for(int i=1;i<idx;i++) {
				temp=temp.next;
			}
			newNode.next=temp.next;
			temp.next=newNode;
				
		}
		}
		
		void deleteAtAnyIndex(int idx) {
			Node temp=head;
			
			if(idx==0) {
				head=head.next;
			}
			
			else if(idx==size()-1) {
				
				for(int i=1;i<idx;i++) {
					temp=temp.next;
				}
				tail=temp;
				tail.next=null;
				
			}
			
			else {
			
			for(int i=1;i<idx;i++) {
				temp=temp.next;
			}
			temp.next=temp.next.next;
		}
		}
		
		int size() {
	    Node temp=head;
	    int count=0;
		while(temp!=null) {
			count++;
			temp=temp.next;
		}
		return count;
			
		}
		
		
		void setHead(Node head){
			this.head=head;
		}
		void setTail(Node tail) {
			this.tail=tail;
		}
	}

