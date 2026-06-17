class Node9{
    int data ;
    Node9 next ;

    public Node9(int data){
        this.data = data ;
        this.next = null ;
    }
}
public class _9_Remove_Cycle_From_Linked_List{

    Node9 head ;
    Node9 tail ;

    public void insert_Node(int data){
        Node9 newNode = new Node9(data) ;

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

        Node9 temp = head ;
        while(temp!=null){
            System.out.print(temp.data + " -> ") ;
            temp = temp.next ;
        }
        System.out.println("null") ;
    }

    public void remove_Cycle(){
        if(head==null || head.next == null){
            return ;
        }

        Node9 slow = head ;
        Node9 fast = head ;
        boolean cycle = false ;

        while(fast!=null && fast.next !=null ){
            slow = slow.next ;
            fast = fast.next.next ;

             if(fast == slow){
                cycle = true ;
                break ;

            }

        }

        if(cycle==false){
            return ;
        }

        slow = head ;

        if(slow==fast){
            while(fast.next !=slow){
                fast = fast.next ;
            }
        }
        else{
            while(slow !=fast){
                slow = slow.next ;
                fast = fast.next ;
            }

            while(fast.next!=slow){
                fast = fast.next ;
            }
        }

        fast.next = null ;

    }

    public static void main(String [] args){
        System.out.println("Remove Cycle From Single Linked List") ;

        _9_Remove_Cycle_From_Linked_List list = new _9_Remove_Cycle_From_Linked_List() ;

        list.insert_Node(1);
        list.insert_Node(2);
        list.insert_Node(3);
        list.insert_Node(4);
        list.insert_Node(5);
        list.insert_Node(90);

        list.tail.next = list.head.next ;

        list.remove_Cycle();
        System.out.println("Single Linked After removing elements from Single Linekd List: ") ;

        list.display_Node() ;

        

    }
}




