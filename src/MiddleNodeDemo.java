//Feyza Yalçındağ 250444002
public class MiddleNodeDemo {
    public static void main(String[] args) {

        System.out.println();
        System.out.println();
        SinglyLinkedList list1 = new SinglyLinkedList();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);




        System.out.println("List 1:" );
        list1.display();
        Node middle1 = list1.findMiddle();



        System.out.println("Middle Node: " + middle1.data );
        System.out.println();
        SinglyLinkedList list2 = new SinglyLinkedList();
        list2.add(10);
        list2.add(20);
        list2.add(30);
        list2.add(40);
        list2.add(50);


        System.out.println("List 2:");
        list2.display();
        Node middle2 = list2.findMiddle();

        System.out.println("Middle Node: " + middle2.data );

        System.out.println();
    }


}
