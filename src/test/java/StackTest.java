/**
 * Created by hema on 5/17/16.
 */
import org.junit.Test;

import static org.junit.Assert.*;

public class StackTest {

    Stack stack = new Stack();

    @Test
    public void test() {

        assertTrue(stack.isEmpty());
        stack.add(3);
        stack.add(5);
        stack.add(7);
        stack.printQueue();
        System.out.println("\n");

        assertTrue(stack.size() == 3);
        assertEquals(7, stack.peek());

        stack.add(9);
        stack.printQueue();
        System.out.println("\n");

        assertTrue(stack.getValue(stack.size()) == 9);

        stack.remove();

        stack.printQueue();
        System.out.println("\n");

        assertTrue(stack.getValue(stack.size()) == 7);
    }
}