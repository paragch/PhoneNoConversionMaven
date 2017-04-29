package TestGroup;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static org.junit.Assert.*;

/**
 * Created by paragchatterjee on 29/04/2017.
 */
public class TransformTest {

    Transform testTransform;

    @Before
    public void setUp() throws Exception {

        testTransform = new Transform();
    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void testTransform() throws Exception {

        assertEquals(testTransform.transform("abcd 12gh uh9 h78 jj6 4o9"),"129-786-49");
        assertNotEquals(testTransform.transform("abcd 12gh uh9 h78 jj6 4o"),"129-786-4");

    }


    @Test
    public void testPickNumbers() throws Exception {

        assertEquals(testTransform.pickNumbers("abcd 12gh uh9 h78 jj6 4o9"),"12978649");
        assertNotEquals(testTransform.pickNumbers("abcd 12gh uh9 h78 jj6 4o9"),"1297864u");

    }

    @Test
    public void testArrangeNumbers() throws Exception {

        assertEquals(testTransform.arrangeNumbers("1234567890"),"123-456-78-90");
        assertNotEquals(testTransform.arrangeNumbers("1234567890"),"1297864u");

    }
}