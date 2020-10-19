package org.example;

import org.junit.Before;
import org.junit.Test;

public class CheckNumberTest {
    CheckNumber num;

    @Before
    public void setUp()
    {
        num = new CheckNumber();
    }

    @Test
    public void evenNumber()
    {
        String result = num.check(10);
    }

    @Test
    public void oddNumber()
    {
        String result = num.check(11);
    }

}
