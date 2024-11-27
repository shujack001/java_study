import org.junit.Test;
import static org.junit.Assert.*;
import java.util.List;

public class TestRODI {

    @Test
    public void testRODI(){
        ReverseOddDigitIterator rodi = new ReverseOddDigitIterator(12345770);
        List<Integer> actual = IterableUtils.toList(rodi);
        List<Integer> except = List.of(7, 7, 5, 3, 1);
        assertEquals(except, actual);
    }
}
