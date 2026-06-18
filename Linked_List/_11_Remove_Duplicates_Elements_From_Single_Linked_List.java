import java.util.HashSet ;
class Node11{
    int data ;
    Node11 next ;

    public Node11(int data){
        this.data = data ;
        this.next = null ;
    }
}
public class _11_Remove_Duplicates_Elements_From_Single_Linked_List{

    Node11 head ;
    Node11 tail ;

    public void insert_Node(int data){
        Node11 newNode = new Node11(data) ;

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

        Node11 temp = head ;

        while(temp!=null){
            System.out.print(temp.data + " -> ") ;
            temp = temp.next ;
        }
        System.out.println("null") ;

    }

    public void remove_Duplicate_Node(){
        if(head==null){
            System.out.println("Single Linked List be empty.") ;
            return ;
        }

        HashSet<Integer> set = new HashSet<>() ;


        Node11 prevNode = null ;
        Node11 currentNode = head ;

        while(currentNode !=null){
            if(set.contains(currentNode.data)){
                prevNode.next = currentNode.next ;

            }
            else{
                set.add(currentNode.data) ;
                prevNode = currentNode ;
            }

            currentNode = currentNode.next ;
        }

    }

    
    public static void main(String [] args){
        System.out.println("Program to remove duplicates elements from Single Linekd List") ;

        _11_Remove_Duplicates_Elements_From_Single_Linked_List list = new _11_Remove_Duplicates_Elements_From_Single_Linked_List() ;

        list.insert_Node(1);
        list.insert_Node(2);
        list.insert_Node(3);
        list.insert_Node(3);
        list.insert_Node(4);
        list.insert_Node(4);
        list.insert_Node(2);
        list.insert_Node(4);
        list.insert_Node(4);
        list.insert_Node(6);

        System.out.println("Single Linked List be: ") ;
        list.display_Node() ;

        System.out.println("Single Linked List after removing duplicate element--") ;
        list.remove_Duplicate_Node();
        list.display_Node();

    }
}