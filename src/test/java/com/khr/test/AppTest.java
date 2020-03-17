package com.khr.test;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    @Test
    public void test(){

        int i = 0;
        StringBuffer sb = new StringBuffer();
        while(i < 100){
            sb.append("hello"+i);
            i++;
        }
        System.out.println(sb.toString());
    }
}
