import static org.junit.Assert.*;
import org.junit.*;

public class ListTests {
    @Test
    public void testFilter(){
        String[] input1 = {"apple","banana","orange"};
        String check = "apple";
        assertEquals(true,ListExamples.filter(input1,check));
    }

    @Test
    public void testMerge(){

    }
}
