package com.mycompany.app;

/**
 * Hello world!
 *
 */

import java.util.ArrayList;

public class App 
{
	public static boolean search(ArrayList<Integer> array, int e) {
	System.out.println("inside search");
		if (array == null) return false;
			for (int elt : array) {
		if (elt == e) return true;
		}
		return false;
}
    
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
}
