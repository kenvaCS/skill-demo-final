import static org.junit.Assert.*;
import org.junit.*;

public class SkillDemoTester{
    @Test
    public void testSubtract(){
        assertEquals(4, SkillDemo.subtract(9,5)); // should fix it.
    }
}