class Node13{
    int data ;
    Node13 next ;

    public Node13(int data){
        this.data = data ;
        this.next = null ;
    }
}
public class _13_Delete_N_Node_From_Single_Linked_List {

    Node13 head ;
    Node13 tail ;

    public void insert_Node(int data){
        Node13 newNode = new Node13(data) ;

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

        Node13 temp = head ;
        while(temp!=null){
            System.out.print(temp.data + " -> ") ;
            temp = temp.next ;
        }
        System.out.println("null") ;

    }

    public void delete_Node_At_Nth_Position(int position){
        if(head==null){
            System.out.println("List be empty") ;
            return ;
        }
        else if(position<=0){
            System.out.println("Invalid Position") ;
            return ;
        }
        else if(position == 1 && head.next == null){
            head = null ;
            tail = null ;
            return ;
        }
        else if(position == 1){
            head = head.next ;
            return ;
        }
      
        Node13 prevNode = null ;
        Node13 currentNode = head ;
        int start = 1 ;

        for(start=1 ; start<position && currentNode!=null ; start++){
            prevNode = currentNode ;
            currentNode= currentNode.next ;
        }

        if(currentNode==null){
            System.out.println("Invalid position") ;
            return ;
        }
      
            prevNode.next = currentNode.next ;

            if(currentNode==tail){
                tail = prevNode ;
            }
            
        
        

    }
    public static void main(String [] args){
        System.out.println("Program to delete Nth element from Single Linked List.") ;

        _13_Delete_N_Node_From_Single_Linked_List list = new _13_Delete_N_Node_From_Single_Linked_List() ;

        list.insert_Node(1);
        list.insert_Node(2);
        list.insert_Node(3);
        list.insert_Node(4);

        System.out.println("Single Linked List be : ") ;
        list.display_Node();

        int position = 5 ;


        System.out.println("Linked List after Deleting Node from Position : " + position) ;
        list.delete_Node_At_Nth_Position(position);
        list.display_Node();



    }
    
}
