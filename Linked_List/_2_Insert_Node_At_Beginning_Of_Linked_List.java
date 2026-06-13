// package Linked_List;

class Node2{
    int data ;
    Node2 next ;

    public Node2(int data){
        this.data = data ;
        this.next = null ;
    }
}
public class _2_Insert_Node_At_Beginning_Of_Linked_List {

    Node2 head ;
    Node2 tail ;

    public void insert_Node(int data){
        Node2 newNode = new Node2(data) ;

        if(head==null){
            head = newNode ;
            tail=newNode ;
            return ;
        }

        tail.next = newNode ;
        tail = newNode ;
    }

    public void display_Node(){
        if(head==null){
            System.out.println("Linked List be empty.") ;
            return ;
        }

        Node2 temp = head ;

        while(temp!=tail){
            System.out.print(temp.data + " -> ") ;
            temp = temp.next ;
        }
        System.out.print(temp.data + " -> " + "null") ;
    }

    public void insert_At_Beginning(int data){
        Node2 newNode = new Node2(data) ;

        if(head==null){
            head = newNode ;
            tail = newNode ;
            return ;
        }
        newNode.next = head ;
        head = newNode ;
    }
    public static void main(String [] args){

        System.out.println("Insert Node At The Beginning of Single Linked List: ") ;

        _2_Insert_Node_At_Beginning_Of_Linked_List list = new _2_Insert_Node_At_Beginning_Of_Linked_List() ;

        list.insert_Node(1);
        list.insert_Node(2);
        list.insert_Node(3);
        list.insert_Node(4); 

        System.out.println("Single Linled List be: ") ;
        list.display_Node();

        System.out.println() ;
        System.out.println("Inserting Node at the Beginning: ") ;
        list.insert_At_Beginning(90); 
        list.display_Node();

    }
    
}
