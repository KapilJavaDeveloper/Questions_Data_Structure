class Node14{
    int data ;
    Node14 next ;

    public Node14(int data){
        this.data = data ;
        this.next = null ;
    }
}
public class _14_Check_Pallindrome_Single_Linked_List {

    Node14 head ;
    Node14 tail ;

    public void insert_Node(int data){
        Node14 newNode = new Node14(data) ;

        if(head==null){
            head = newNode ;
            tail = newNode ;
            return ;
        }
        tail.next = newNode ;
        tail = newNode ;
    }

    public void display_Node(){
        if(head==null){
            System.out.println("Single Linked List be empty.") ;
            return ;
        }
        Node14 temp = head ;

        while(temp!=null){
            System.out.print(temp.data + " -> ") ;
            temp = temp.next ;
        }
        System.out.println("null") ;
    }
    public boolean is_Pallindrome(){

        if(head==null || head.next==null){
            return true  ;
        }

        Node14 slow = head ;
        Node14 fast = head ;

        while(fast!=null && fast.next!=null){
            slow = slow.next ;
            fast = fast.next.next ;
        }

        Node14 firstHalf = head ;
        Node14 secondHalf = reverse(slow) ;

        while(firstHalf!=null && secondHalf!=null){
        
            if(firstHalf.data != secondHalf.data){
                return false ;
            }
          

            firstHalf = firstHalf.next ;
            secondHalf = secondHalf.next ;

        }
        return true ;


    }

    public Node14 reverse(Node14 head1){

       Node14 prevNode = null ;
       Node14 currentNode = head1 ;
       Node14 nextNode = currentNode ;

       while(currentNode!=null){
        nextNode = currentNode.next ;
        currentNode.next = prevNode ;
        prevNode = currentNode ;
        currentNode = nextNode ;
       }
       head1 = prevNode ;

       return head1 ;





    }
    public static void main(String [] args){
        System.out.println("Program to check is Single Linekd List is Pallindrome.") ;

        _14_Check_Pallindrome_Single_Linked_List list = new _14_Check_Pallindrome_Single_Linked_List() ;

        list.insert_Node(1);
        list.insert_Node(2);
        list.insert_Node(3);
        list.insert_Node(2);
        list.insert_Node(1);

        System.out.println("Single Linked List be: ") ;
        list.display_Node();

        if(list.is_Pallindrome()){
            System.out.println("Pallindrome Single Linked List.") ;
        }
        else{
            System.out.println("Not Pallindrome Linked List") ;
        }


    }
    
}
