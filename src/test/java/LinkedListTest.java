import org.junit.Test;

/**
 * Created by hema on 5/11/16.
 */
public class LinkedListTest {
    Node head = new Node();
    LinkedList list = new LinkedList(head);

    int data, pos;

  /*  @Test
    public void insertDeleteTest(){
       //start
        list.insert(2,1);
        list.insert(1, 1);
        //end
        list.insert(4,3);
        list.insert(6, 4);
        //middle
        list.insert(3, 3);
        list.insert(5,5);
        list.printList();
        System.out.println();
        //Remove -- Start
        list.delete(1);
        list.delete(5);
        list.delete(3);
        list.printList();
    }*/
    @Test
    public void insertStartTest(){
        list.insertStart(2);
        list.insertStart(1);
        list.printList();
        System.out.println();
    }
    @Test
    public void insertEndTest(){
        list.insertLast(4);
        list.insertLast(6);
        list.printList();
        System.out.println();
      }
    @Test
    public void insertMiddleTest(){
        list.insert(3, 3);
        list.insert(5,5);
        list.printList();
        System.out.println();
      }

    @Test
    public void deleteStartTest(){
        //Remove -- Start
        list.deleteFirst();
        list.printList();
        System.out.println();
    }

    @Test
    public void deleteEndTest(){
        list.deleteLast();
        list.printList();
        System.out.println();
     }

    @Test
    public void deleteMiddleTest(){
        list.delete(3);
        list.printList();
        System.out.println();
    }

    @Test
    public void getDataTest(){
        list.getValue(2);
      }

}
