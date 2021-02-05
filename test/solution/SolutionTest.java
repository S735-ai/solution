
package solution;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;

import com.solution.Solution;

public class SolutionTest {

    @Test
    public void teststruppercase()
    {
        assertEquals("foo".toUpperCase(), "FOO");
    }

    @Test
    public void testcase0()
    {
        assertTrue(Solution.getresult("madam"));
    }


    @Test
    public void testcase1()
    {
        assertFalse(Solution.getresult("random string"));
    }

    @Test
    public void testcase2()
    {
        assertTrue(Solution.getresult("satanoscillatemymetallicsonatas"));
    }

    @Test
    public void testcase3()
    {
        assertTrue(Solution.getresult("in girum imus nocte et consumimur igni"));
    }

    @Test
    public void testcase4()
    {
        assertFalse(Solution.getresult("lmaoml"));
    }

    @Test
    public void testcase5()
    {
        assertTrue(Solution.getresult("wassamassaw"));
    }

}
