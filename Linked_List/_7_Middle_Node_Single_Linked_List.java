class Node7{
    int data ;
    Node7 next ;

    public Node7(int data){
        this.data = data ;
        this.next = null ;
    }
}
public class _7_Middle_Node_Single_Linked_List{

    Node7 head ;
    Node7 tail ;

    public void insert_Node(int data){
        Node7 newNode = new Node7(data) ;

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
            System.out.println("Single Linked List is empty.") ;
            return ;
        }

        Node7 temp = head ;

        while(temp!=null){
            System.out.print(temp.data + " -> ") ;
            temp = temp.next ;
        }
        System.out.println("null") ;
    }

    public void middle_Node(){
        if(head==null){
            System.out.println("Empty Linked List.") ;
            return ;
        }

        int length = 0 ;

        Node7 temp = head ;

        while(temp!=null){
            length++ ;
            temp = temp.next ;
        }

        Node7 middleNode = head ;

        for(int i = 0; i<length/2 ; i++){
            middleNode = middleNode.next ;
        }
        System.out.println("Middle Node be: " + middleNode.data) ;

    }

    public static void main(String [] args){
        System.out.println("Finding Middle Node Of Single Linked List Program -- ") ;

        _7_Middle_Node_Single_Linked_List list = new _7_Middle_Node_Single_Linked_List() ;

        list.insert_Node(1);
        list.insert_Node(2);
        list.insert_Node(3);
        list.insert_Node(4);
        list.insert_Node(5);
        list.insert_Node(6);
        list.insert_Node(7);

        System.out.println("Single Linked List be: ") ;
        list.display_Node() ;

        list.middle_Node() ;
        

    }
}