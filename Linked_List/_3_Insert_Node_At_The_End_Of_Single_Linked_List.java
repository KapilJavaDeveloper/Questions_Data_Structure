// package Linked_List;

class Node3{
    int data ;
    Node3 next ;

    public Node3(int data){
        this.data = data ;
        this.next = null ;
    }
}
public class _3_Insert_Node_At_The_End_Of_Single_Linked_List {

    Node3 head ;
    Node3 tail ;

    public void insert_Node(int data){

        Node3 newNode = new Node3(data) ;

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

        Node3 temp = head ;

        while(temp!=tail){
            System.out.print(temp.data + " -> ") ;
            temp = temp.next ;
        }
        System.out.print(temp.data + " -> " + "null") ;
    }

    public void insert_At_End(int data){
        Node3 newNode = new Node3(data) ;

        if(head==null){
            head = newNode ;
            tail = newNode ;
            return ;
        }
        tail.next = newNode ;
        tail = newNode ;
    }
    public static void main(String [] args){

        System.out.println("Program to insert Node at the End of Single Linked List") ;

        _3_Insert_Node_At_The_End_Of_Single_Linked_List list = new _3_Insert_Node_At_The_End_Of_Single_Linked_List() ;

        list.insert_Node(1);
        list.insert_Node(2);
        list.insert_Node(3);
        list.insert_Node(4);

        System.out.println("Single Linked List be: ") ;
        list.display_Node();

        System.out.println() ;
        System.out.println("Inserting a Node at the end of single Linked List: ") ;
        list.insert_At_End(80);
        list.display_Node();

    }
    
}
