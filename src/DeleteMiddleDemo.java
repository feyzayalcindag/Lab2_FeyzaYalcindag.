//Feyza Yalçındağ 250444002
public class DeleteMiddleDemo{
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
        System.out.println("After deleting");
        list1.deleteMiddle(); ;
        System.out.println("list1");
        list1.display();
        SinglyLinkedList list2 = new SinglyLinkedList();
        list2.add(10);
        list2.add(20);
        list2.add(30);
        list2.add(40);
        list2.add(50);
        System.out.println("List 2:" );
        list2.display();
        System.out.println("After deleting");
        list2.deleteMiddle(); ;
        System.out.println("list2");
        list2.display();
        SinglyLinkedList list3 = new SinglyLinkedList();
        list3.add(1);

        System.out.println("List 3:" );
        list3.display();
        System.out.println("After deleting");
        list3.deleteMiddle(); ;
        System.out.println("list3");
        list3.display();

    }


}

