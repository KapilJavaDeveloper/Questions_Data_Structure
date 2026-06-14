class Node5{
    int data ;
    Node5 next ;

    public Node5(int data){
        this.data = data ;
        this.next = null ;
    }
}
public class _5_Search_Element {

    Node5 head ;
    Node5 tail ;

    public void insert_Node(int data){

        Node5 newNode = new Node5(data) ;

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

        Node5 temp = head ;

        while(temp != tail){
            System.out.print(temp.data + " -> ") ;
            temp = temp.next ;
        }
        System.out.print(temp.data + " -> " + "null") ;
    }

    public void search_element(int element){
        if(head == null){
            System.out.println("Single Linekd List be empty.") ;
            return ;
        }

        Node5 temp = head ;

        while(temp!=null){
            if(temp.data == element){
                System.out.println(element + " Present in the Single Linked List") ;
                return ;
            }
            temp = temp.next ;
        }

        System.out.println(element + " Not Present in the Single Linekd List.") ;
    }


    public static void main(String [] args){
        System.out.println("Search Element in Single Linked List Program: ") ;

        _5_Search_Element list = new _5_Search_Element() ;

        list.insert_Node(1);
        list.insert_Node(2);
        list.insert_Node(3);
        list.insert_Node(4);
        list.insert_Node(5);

        System.out.println("Linked List be: ") ;
        list.display_Node() ;
        
        int element = 2 ;
        System.out.println() ;
        System.out.println("Seraching element "+ element + " in Linked List: ") ;
        list.search_element(element) ;

    }
    
}
