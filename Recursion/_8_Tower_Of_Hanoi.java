public class _8_Tower_Of_Hanoi {

    public static void tower_Of_Hanoi(int n , char source , char auxiliary , char destination){
        if(n == 1){
            System.out.println("Move Disk 1 from  " + source + " to " + destination) ;
            return ; 
        }

        tower_Of_Hanoi(n-1, source,  destination , auxiliary);
        System.out.println("Moving disk "+ n + " from " + source + " to " + destination) ;

        tower_Of_Hanoi(n-1, auxiliary,source, destination);

    }
    public static void main(String [] args){
        System.out.println("8. Program Tower of Hanoi.") ;

        int disk = 3 ;
        tower_Of_Hanoi(disk, 'A', 'B', 'C');

    }
    
}
