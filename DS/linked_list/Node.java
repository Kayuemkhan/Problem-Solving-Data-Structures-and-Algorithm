package DS.linked_list;//{ Driver Code Starts
/*package whatever //do not write package name here */
import java.util.*;
class Node {
    int data;
    Node next;
    
    public Node(int data){
        this.data = data;
        this.next = null;
    }
}

class GFG {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0){
		    
		    Node head1 = null, head2 = null, tail1 = null, tail2 = null;
		    
		    //Input first LL
		    int n1 = sc.nextInt();
            int d1 = sc.nextInt();		    
		    head1 = new Node(d1);
		    tail1 = head1;
		    
		    while(n1-- > 1){
		        Node n = new Node(sc.nextInt());
		        tail1.next = n;
		        tail1 = tail1.next;
		    }
		    
		    //Input second LL
		    int n2 = sc.nextInt();
            int d2 = sc.nextInt();		    
		    head2 = new Node(d2);
		    tail2 = head2;
		    
		    while(n2-- > 1){
		        Node n = new Node(sc.nextInt());
		        tail2.next = n;
		        tail2 = tail2.next;
		    }
		    
		    Solution obj = new Solution();
		    if(obj.isIdentical(head1, head2))
		        System.out.println("Identical");
		    else   
		        System.out.println("Not identical");
		    
		}
	}
	
	public static void po(Object o){
	    System.out.println(o);

	}

    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        Stack<Integer> dfs = new Stack<>();
        dfs.add(0);
        HashSet<Integer> seenCheck = new HashSet<>();
        seenCheck.add(0);
        while (!dfs.isEmpty()) {
            int i = dfs.pop();
            for (int j : rooms.get(i))
                if (!seenCheck.contains(j)) {
                    dfs.add(j);
                    seenCheck.add(j);
                    if (rooms.size() == seenCheck.size()) return true;
                }
        }
        return rooms.size() == seenCheck.size();
    }
	
	public static void show(Node head){
        while(head != null){
            System.out.print(head.data+" ");
            head = head.next;
        }
        System.out.println();
    }
}

// } Driver Code Ends


/*
class Node {
    int data;
    Node next;
    
    public Node(int data){
        this.data = data;
        this.next = null;
    }
}*/

class Solution {
    
    //Function to check whether two linked lists are identical or not.
    public boolean isIdentical (Node head1, Node head2){
        //write your code here 
        
        Node newNode1 = head1;
        Node newNode2 = head2;
        
        int length1=0, length2=0;
        
        while ( newNode1 != null ){
            newNode1 = newNode1.next;
            length1 ++;    
        }
        while( newNode2 !=null ){
            newNode2 = newNode2.next;
            length2 ++;
        }
        
        if(length1 != length2){
            return false;
        }
       
        boolean status =false;
         newNode1 = head1;
         newNode2 = head2;

        while(newNode1 != null ){
            if(newNode1.data != newNode2.data)
            {
                status =true;
                break;
            }
            else{
                newNode1 = newNode1.next;
                newNode2 = newNode2.next;
            }

        }

       return status;
    }
}