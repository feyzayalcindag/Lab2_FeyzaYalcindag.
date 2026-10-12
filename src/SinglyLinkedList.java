// Feyza Yalçındağ 250444002 12/10/26
public class SinglyLinkedList {
    private Node head ;
    public SinglyLinkedList(){
        head = null ; // because i have no head
    }
    public void add(int data) {
        //im using new method for new addings
        Node newNode = new Node(data);
        //now i need to make sure if its empty the null is the head
        if( head == null ){
            head = newNode ;
            //if its not empty the new should go to the last
        }else{
            Node current = head ; //the old one is the head but
            while (current.next != null ){
                current = current.next ;
            }
            current.next = newNode ;
        }
    }
    public void display() {
        Node current = head ;
        while (current != null ){
            System.out.print(current.data + "-->" );
            current = current.next ;

        }
        System.out.println("Null");
    }
    public Node findMiddle(){
        // if its odd its the middle if its even return to second middle
        //if its empty
        if ( head == null){
            return null;
        }
        int lenght = 0 ;
        Node current = head ;
        while ( current != null ){
            lenght++ ;
            current = current.next ;
        }
        int middleIndex = lenght /2 ;
        current = head ;
        for ( int i = 0 ; i<middleIndex ; i++){
            current = current.next ;
        }
        return current ;

    }
    public Node getHead() {
        return head;
    }
    public void deleteMiddle(){
        // if its odd its the middle if its even return to second middle
        //if its empty
        if ( head == null) {
            return;
        }
        if ( head.next == null){
            head = null ;
            return;
        }
        int lenght = 0 ;
        Node current = head ;
        while ( current != null ){
            lenght++ ;
            current = current.next ;
        }
        int middleIndex = lenght /2 ;
        current = head ;
        for ( int i = 0 ; i<middleIndex -1 ; i++){
            current = current.next ;
        }
        current.next = current.next.next ;

    }
}
