package com.mkyong.hashing;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{

    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testEven()
    {
        EvenOdd obj= new EvenOdd();
	String avalue= obj.checkEvenOdd(7);
	String evalue= "Number is Odd";
	assertEquals(avalue,evalue);
    }
    public void testEven1()
    {
        EvenOdd obj= new EvenOdd();
	String avalue= obj.checkEvenOdd(6);
	String evalue= "Number is Even";
	assertEquals(avalue,evalue);
    }
    public void testApp()
    {
        assertTrue( true );
    }
}
