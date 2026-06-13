class Node1{
    int data ;
    Node1 next  ;

    public Node1(int data){
        this.data = data ;
        this.next = null ;

    }

}
public class _1_Create_A_Singly_Linked_List{

    Node1 head ;
    Node1 tail ;

    public void insert_Node(int data){

        Node1 newNode = new Node1(data) ;

        if(head==null){
            head=newNode ;
            tail=newNode ;
            return ;
        }
        tail.next = newNode ;
        tail = newNode ;

    }

    public void display_Node(){

        if(head==null){
            System.out.println("Singly Linked List be empty.") ;
            return ;
        }

        Node1 temp = head ;

        while(temp!=tail){
            System.out.print(temp.data + " -> ") ;
            temp = temp.next ;
        }
        System.out.print(temp.data + " -> ") ;
        System.out.println("null") ;

    }
    public static void main(String [] args){
        System.out.println("Creation of Single Linked List Program : ") ;

        _1_Create_A_Singly_Linked_List list = new _1_Create_A_Singly_Linked_List() ;

        list.insert_Node(1);
        list.insert_Node(2);
        list.insert_Node(3);
        list.insert_Node(4);

        System.out.println("Singly Linked List be: ") ;

        list.display_Node() ;

    }
}