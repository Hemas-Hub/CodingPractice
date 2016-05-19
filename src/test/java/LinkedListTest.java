import org.junit.Test;

import static org.junit.Assert.*;

public class LinkedListTest {

    LinkedList list = new LinkedList();

    @Test
    public void test() {
        assertTrue(list.isEmpty());
        list.insertStart(3);
        list.insertLast(5);
        list.insert(4,2);

        list.printList();
        System.out.println("\n");

        assertTrue(list.size() == 3);
        assertEquals(4, list.getValue(2));

        list.insert(9,10);

        assertFalse(list.size() == 4);
        assertFalse(list.getLastValue() == 9);

        list.deleteLast();

        list.printList();
        System.out.println("\n");

        assertFalse(list.getLastValue() == 5);

        list.deleteFirst();

        list.printList();
        System.out.println("\n");

        assertFalse(list.getHead() == 3);

        list.insertStart(1);
        list.printList();
        System.out.println("\n");


        list.delete(2);

        list.printList();
        System.out.println("\n");

        assertFalse(list.getValue(2) == 4);

    }

}