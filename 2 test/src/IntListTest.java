import org.junit.Test;
import static org.junit.Assert.*;

public class IntListTest {

    @Test
    public void testDreaming1(){
        IntList list = IntList.list(1, 2);
        list.dreaming(3);
        assertEquals(list.first, 1);
        assertEquals(list.rest.first, 2);
        assertEquals(list.rest.rest.first, 3);
    }

    @Test
    public void testDreaming2(){
        IntList list = IntList.list(1, 2, 3);
        list.dreaming(4);
        assertEquals(list.first, 2);
        assertEquals(list.rest.first, 3);
        assertEquals(list.rest.rest.first, 4);
    }
}
