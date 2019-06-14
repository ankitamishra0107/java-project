package com.mkyong.hashing;

/**
 * Hello world today! 
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        EvenOdd obj= new EvenOdd();
	System.out.println(obj.checkEvenOdd(Integer.parseInt(args[0])));
    }
}
