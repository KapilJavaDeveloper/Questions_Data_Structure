class Node4{
    int data ;
    Node4 next ;

    public Node4(int data){
        this.data = data ;
        this.next = null ;
    }
}
public class _4_Delete_A_Node{

    Node4 head ;
    Node4 tail ;

    public void insert_Node(int data){
        Node4 newNode = new Node4(data) ;

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
            System.out.println("Single Linked List be empty") ;
            return ;
        }

        Node4 temp = head ;

        while(temp != tail){
            System.out.print(temp.data + " -> ") ;
            temp = temp.next ;
        }
        System.out.print(temp.data + " -> " + "null") ;
    }

    public void delete_Node(int element){

        if(head==null){
            System.out.println("Cannot Delete Node from Empty Single Linked List") ;
            return ;
        }
        else if(head.data == element){
            head = head.next ;
            return ;

        }

        Node4 prevNode = null ;
        Node4 currentNode = head ;
        
        while(currentNode!= null && currentNode.data !=element){
            // System.out.print(currentNode.data + " ") ;
            prevNode = currentNode ;
            currentNode = currentNode.next ;
        }
        if(currentNode ==null ){
            System.out.println("Element Not present in Linekd List.") ;
            return ;

        }
        prevNode.next = currentNode.next ;
        currentNode = null ;
        if(tail.data == element){
            tail = prevNode ;
        }
    
    }
    public static void main(String [] args){
        System.out.println("Delete a Node from a Single Linked List") ;

        _4_Delete_A_Node list = new _4_Delete_A_Node() ;

        list.insert_Node(1);
        list.insert_Node(2);
        list.insert_Node(3);
        list.insert_Node(4);

        System.out.println("Single Linked List be: ") ;
        list.display_Node() ;

        int element = 4 ;

        System.out.println() ;
        System.out.println("Linked List after deletion: ") ;
        list.delete_Node(element);
        list.display_Node() ;
   

    }
}