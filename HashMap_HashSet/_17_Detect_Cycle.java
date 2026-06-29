import java.util.HashSet ;
class Node17{
    int data ; 
    Node17 next ;

    public Node17(int data){
        this.data = data ;
        this.next = null ;
    }
}
public class _17_Detect_Cycle{

    public void displayNode(Node17 head){
        if(head ==null){
            System.out.println("Linked List be empty") ;
            return ;
        }

        Node17 temp = head ;

        while(temp!=null){
            System.out.print(temp.data + " -> ") ;
            temp = temp.next ;
        }
        System.out.println("null") ;
    }

    public boolean detect_Cycle(Node17 head){

        if(head==null){
            System.out.println("Linked List be empty") ;
            return false ;
        }

        Node17 temp = head ;
        HashSet<Node17> hashSet = new HashSet<>()  ;
        
        while(temp !=null){

            if(hashSet.contains(temp)){
                System.out.println("temp be: "+ temp.data) ;
                return true ;
            }

            hashSet.add(temp) ;
            temp = temp.next ;

        }

        return false ;

    }
    public static void main(String [] args){
        System.out.println("17. Program to Detect Cycle ") ;

        Node17 head = new Node17(12) ;
        Node17 element2 = new Node17(13) ;
        Node17 element3 = new Node17(14) ;
        Node17 element4 = new Node17(15) ;
        Node17 element5 = new Node17(16) ;
        
        head.next = element2 ;
        element2.next = element3 ;
        element3.next = element4 ;
        element4.next = element5 ;

        element5.next = element2 ;

        _17_Detect_Cycle list = new _17_Detect_Cycle() ;


        if(list.detect_Cycle(head)){
            System.out.println("Cycle Detected ") ;
        }
        else{
            System.out.println("Cycle Not Detected") ;
        }



    }
}