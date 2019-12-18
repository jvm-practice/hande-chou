package com.maxwit.app;

import org.junit.Test;

import static org.junit.Assert.assertEquals; //static 作用是方便使用类名直接调用成员方法

//import org.junit.Assert;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */

    @Test
    public void AssertEquals() {
        App app = new App();
        assertEquals(2, app.add(1, 1));
    }
}
