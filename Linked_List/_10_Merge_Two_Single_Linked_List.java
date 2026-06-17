class Node10{
    int data ;
    Node10 next ;

    public Node10(int data){
        this.data = data ;
        this.next = null ;
    }

}
public class _10_Merge_Two_Single_Linked_List {

    Node10 head ;
    Node10 tail ;

    public void insert_Node(int data){
        Node10 newNode = new Node10(data) ;

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

        Node10 temp = head ;

        while(temp!=null){
            System.out.print(temp.data + " -> ") ;
            temp = temp.next ;
        }
        System.out.println("null") ;
    }

        public static void merge_Two_Linked_List(_10_Merge_Two_Single_Linked_List list1 , _10_Merge_Two_Single_Linked_List list2){

            _10_Merge_Two_Single_Linked_List merged = new _10_Merge_Two_Single_Linked_List () ;

            Node10 temp1 = list1.head ;
            Node10 temp2 = list2.head ;

            while(temp1!=null && temp2!=null){
                if(temp1.data < temp2.data){
                    merged.insert_Node(temp1.data) ;
                    temp1 = temp1.next ;
                }
                else{
                    merged.insert_Node(temp2.data) ;
                    temp2 = temp2.next ;
                }
            }

            while(temp1 !=null){
                merged.insert_Node(temp1.data) ;
                temp1 = temp1.next ;
            }

            while(temp2 !=null){
                merged.insert_Node(temp2.data) ;
                temp2 = temp2.next ;
            }

            merged.display_Node() ;

                
    }

    public static void main(String [] args){
        System.out.println("Merge Two Single Linked List Program: ") ;

        _10_Merge_Two_Single_Linked_List list1 = new _10_Merge_Two_Single_Linked_List() ;

        list1.insert_Node(1);
        list1.insert_Node(2);
        list1.insert_Node(3);
        list1.insert_Node(4);

        _10_Merge_Two_Single_Linked_List list2 = new _10_Merge_Two_Single_Linked_List() ;

        list2.insert_Node(100);
        list2.insert_Node(200);
        list2.insert_Node(300);
        list2.insert_Node(400);
        list2.insert_Node(500);
        list2.insert_Node(600);
        list2.insert_Node(700);

        System.out.println("First Linked List be: ") ;
        list1.display_Node() ;

        System.out.println("Second Linked List be: ") ;
        list2.display_Node() ;


        System.out.println("Merged Linked List be : ") ;
        merge_Two_Linked_List(list1, list2) ;

    }
    
}
