package mytest;

import myclass.Line;
import org.junit.Test;
import static org.junit.Assert.*;
public class LineTest {

    @Test
    public void lineFunction() {
        assertEquals( 10, Line.lineFunction(0, 0, 3, 3, 10), 1e-2);
        assertEquals( 0, Line.lineFunction(0, 0 , 2, 3, 0), 1e-2);
        assertEquals( -3, Line.lineFunction(0, 0, -2, 2, 3), 1e-2);
        assertEquals( 1, Line.lineFunction(1, 1, 23, 1, 3), 1e-2);
        assertEquals( 18, Line.lineFunction(25, 28, -5, 13, 5), 1e-2);
        assertEquals( 1.5, Line.lineFunction(0, 0, 2, 3, 1), 1e-2);
    }



}
