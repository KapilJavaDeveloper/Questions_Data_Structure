class Node15{
    int data ;
    Node15 next ;

    public Node15(int data){
        this.data = data ;
        this.next = null ;
    }
}
public class _15_Intersection_Of_Two_Single_Linked_List {

    Node15 head ;
    Node15 tail ;

    public void insert_Node( int data){
        Node15 newNode = new Node15(data) ;
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

        Node15 temp = head ;

        while(temp!=null){
            System.out.print(temp.data + " -> ") ;
            temp = temp.next ;
        }
        System.out.println("null") ;

    }

    public static Node15 intersection_Node(Node15 head1 , Node15 head2){

        if(head1 == null || head2==null){
            return null ;
        }

        Node15 firstNode = head1 ;
        Node15 secondNode = head2 ;

        while(firstNode!=secondNode){
            firstNode = (firstNode==null)? head1:firstNode.next ;
            secondNode = (secondNode==null)? head2: secondNode.next ;
        }

        return firstNode ;

    }
    public static void main(String [] args){

        System.out.println("Program to find the intersection Of Two Single Linked List..") ;

        _15_Intersection_Of_Two_Single_Linked_List list1 = new _15_Intersection_Of_Two_Single_Linked_List() ;


        Node15 common = new Node15(4) ;
        list1.insert_Node( 1);
        list1.insert_Node( 2);
        list1.insert_Node( 3);
        list1.tail.next=common ;
        list1.tail = common ;
        list1.insert_Node( 5);

        System.out.println("First Linked List be: ") ;
        list1.display_Node();

       

        _15_Intersection_Of_Two_Single_Linked_List list2 = new _15_Intersection_Of_Two_Single_Linked_List() ;

        list2.insert_Node( -1);
        list2.insert_Node( 100);
        list2.insert_Node( -200);
        list2.insert_Node( 300);
        list2.tail.next = common ;
        list2.tail = common ;


        System.out.println("Second Linked List be: ") ;
        list2.display_Node();

        if(intersection_Node(list1.head, list2.head)!=null){
            System.out.println("Itersection Node be: "+ intersection_Node(list1.head, list2.head).data) ;
        }
        else{
            System.out.println("No Intersection Point") ;
        }

    }
    
}
