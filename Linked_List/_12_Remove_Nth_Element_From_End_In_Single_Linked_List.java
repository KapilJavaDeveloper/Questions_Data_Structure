class Node12{
    int data ;
    Node12 next ;

    public Node12(int data){
        this.data = data ;
        this.next = null ;
    }
}
public class _12_Remove_Nth_Element_From_End_In_Single_Linked_List {

    Node12 head ;
    Node12 tail ;

    public void insert_Node(int data){
        Node12 newNode = new Node12(data) ;

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
            System.out.println("Single linked List be empty.") ;
            return ;
        }

        Node12 temp = head ;

        while(temp!=null){
            System.out.print(temp.data + " -> ") ;
            temp = temp.next ;
        }
        System.out.println("null") ;

    }

    public void remove_N_Elements(int position){

        if(head==null){
            System.out.println("Single Linekd List be empty.") ;
            return ;
        }
        else if(position <=0){
            System.out.println("Invalid Position") ;
            return ;

        }

        int length = 0 ;

        Node12 temp = head ;

        while(temp!=null){
            length++ ;
            temp = temp.next ;
        }

        int index = length -position ;

        if(index<0){
            System.out.println("Invalid position ") ;
            return ;
        }
        else if(index ==0){
            head = head.next ;
            if(head==null){
            tail = head ;
            }
            return ;
            
        }
       
        Node12 prevNode = null ;
        Node12 currentNode = head ;

        while(index>0){
            index-- ;
            prevNode = currentNode ;
            currentNode = currentNode.next  ;
        }
        prevNode.next = currentNode.next ;
        if(currentNode == tail){
            tail = prevNode ;
        }
    }
    public static void main(String [] args){
        System.out.println("Program to remove Nth elment from end in single linked list.") ;

        _12_Remove_Nth_Element_From_End_In_Single_Linked_List list = new _12_Remove_Nth_Element_From_End_In_Single_Linked_List() ;

        list.insert_Node(1);
        list.insert_Node(2);
        list.insert_Node(3);
        list.insert_Node(4);
        list.insert_Node(5);

        System.out.println("Single Linked List be: ") ;
        list.display_Node();


        int position = 5 ;
        System.out.println("Removing element at position "+ position + " from end." ) ;
        list.remove_N_Elements(position);
        list.display_Node();

    }
    
}
